/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: CustomerController.java
 * Final Project: Car services App
 */
package com.CSControllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.CustomerModel;

public class CustomerController {

    DB_Main main = new DB_Main();

    public ArrayList<CustomerModel> getCustomers(String city) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selesctCustomers = con.prepareStatement("select customerID, companyName, contactName, emailAddress from "
                + "customers where city = '" + city + "'");

        ResultSet rs = selesctCustomers.executeQuery();
        ArrayList<CustomerModel> customers = new ArrayList<>();

        while (rs.next()) {
            CustomerModel cus = new CustomerModel();
            cus.setcustID(rs.getString("customerID"));

            cus.setemail(rs.getString("emailAddress"));

            cus.setCompanyName(rs.getString("companyName"));
            cus.setContactName(rs.getString("contactName"));


            customers.add(cus);
        }

        return customers;
    }

}
