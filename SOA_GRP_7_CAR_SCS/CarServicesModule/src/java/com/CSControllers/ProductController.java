/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: ProductController.java
 * Final Project: Car services App
 */

package com.CSControllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.ProductModel;

/**
 *
 */
public class ProductController {

    DB_Main main = new DB_Main();

    public ArrayList<ProductModel> getItems(String itemID) throws Exception {

        Connection con = DB_Main.getConnection();
        PreparedStatement selectComments = con.prepareStatement("select itemID,itemName,itemDescription,qty,price from     "
                + "item where itemID = '" + itemID + "'");

        ResultSet rs = selectComments.executeQuery();
        ArrayList<ProductModel> items = new ArrayList<>();

        while (rs.next()) {
            ProductModel itm = new ProductModel();
            
            
            itm.setItemID(rs.getString("itemID"));
            itm.setItemName(rs.getString("itemName"));
            itm.setItemDescription(rs.getString("itemDescription"));
            itm.setqty(rs.getString("qty"));
            itm.setPrice(rs.getString("price"));
           
      

            items.add(itm);
        }

        return items;
    }

}
