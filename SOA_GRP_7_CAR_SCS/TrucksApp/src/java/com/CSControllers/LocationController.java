/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: LocationController.java
 * Final Project: Car services App
 */

package com.CSControllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.CustomerModel;
import com.CSModel.AreaModel;

/**
 *
 */
public class LocationController {
    DB_Main main = new DB_Main();
    
    public ArrayList<AreaModel> getLocations(String locCode) throws Exception {
        
        Connection con = main.getConnection();
        PreparedStatement selesctCustomers = con.prepareStatement("select locID, customerID, locCode, city, state from "
                + "locations where locCode = '" + locCode + "'");
        
        ResultSet rs = selesctCustomers.executeQuery();
        ArrayList<AreaModel> locations = new ArrayList<>();
        
        while (rs.next()) {
            AreaModel loc = new AreaModel();
            loc.setCustomerID(rs.getString("customerID"));
            loc.setlocID(rs.getString("locID"));
            loc.setlocCode(rs.getString("locCode"));
            loc.setCity(rs.getString("city"));
            loc.setState(rs.getString("state"));

            locations.add(loc);
        }

        return locations;
    }

        
    }

