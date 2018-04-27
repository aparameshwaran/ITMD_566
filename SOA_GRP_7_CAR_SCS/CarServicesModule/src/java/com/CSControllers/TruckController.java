/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: TruckController.java
 * Final Project: Car services App
 */

package com.CSControllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.TruckModel;

/**
 *
 */
public class TruckController {

    DB_Main main = new DB_Main();

    public ArrayList<TruckModel> getTrucks(String empID) throws Exception {

        Connection con = DB_Main.getConnection();
        PreparedStatement selecttrucks = con.prepareStatement("select truckID, VIN, makeYear, model from "
                + "trucks where empID = '" + empID + "'");

        ResultSet rs = selecttrucks.executeQuery();
        ArrayList<TruckModel> trucks = new ArrayList<>();

        while (rs.next()) {
            TruckModel cus = new TruckModel();
            cus.setTruckID(rs.getString("truckID"));
            cus.setVIN(rs.getString("VIN"));
            cus.setMakeYear(rs.getString("makeYear"));
            cus.setModel(rs.getString("model"));

            trucks.add(cus);
        }

        return trucks;
    }

}
