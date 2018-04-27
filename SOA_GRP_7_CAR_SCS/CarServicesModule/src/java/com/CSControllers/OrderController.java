/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: OrderController.java
 * Final Project: Car services App
 */

package com.CSControllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.OrderCartModel;

/**
 *
 *
 */
public class OrderController {

    DB_Main main = new DB_Main();

    public ArrayList<OrderCartModel> getOrders(String isSpecial) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selesctOrders = con.prepareStatement("select orderID, orderDate, custID, empID,truckID,PostNumber,Total from "
                + "orders where isSpecial = '" + isSpecial + "'");

        ResultSet rs = selesctOrders.executeQuery();
        ArrayList<OrderCartModel> orders = new ArrayList<>();

        while (rs.next()) {
            OrderCartModel ord = new OrderCartModel();
          ord.setOrderID(rs.getString("orderID"));
          ord.setOrderDate(rs.getString("orderDate"));
          ord.setcustID(rs.getString("custID"));
          ord.setempID(rs.getString("empID"));
          ord.setTruckID(rs.getString("truckID"));
          ord.setPostNumber(rs.getString("PostNumber"));
          ord.setTotal(rs.getString("Total"));

//            cus.setEmailAddress(rs.getString("emailAddress"));
//
//            cus.setCompanyName(rs.getString("companyName"));
//            cus.setContactName(rs.getString("contactName"));
orders.add(ord);

//            customers.add(cus);
        }

      return orders;
    }

}
