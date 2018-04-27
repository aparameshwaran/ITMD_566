/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: ItemPriceController.java
 * Final Project: Car services App
 */

package com.CSControllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.ItemPriceModel;


public class ItemPriceController {

    DB_Main main = new DB_Main();

    public ArrayList<ItemPriceModel> getPrices(String priceID) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selectPrices = con.prepareStatement("select locationID, price from "
                + "prices where priceID = '" + priceID + "'");

        ResultSet rs = selectPrices.executeQuery();
        ArrayList<ItemPriceModel> prices = new ArrayList<>();

        while (rs.next()) {
            ItemPriceModel pc = new ItemPriceModel();
            pc.setLocationID(rs.getString("locationID"));

            pc.setPrice(rs.getString("price"));

          



            prices.add(pc);
        }

        return prices;
    }

}
