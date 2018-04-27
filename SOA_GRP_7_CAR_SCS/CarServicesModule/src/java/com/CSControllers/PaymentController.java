/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: PaymentController.java
 * Final Project: Car services App
 */

package com.CSControllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.PurchaseModel;


public class PaymentController {

    DB_Main main = new DB_Main();

    public ArrayList<PurchaseModel> getExpenses(String payMethod) throws Exception {

        Connection con = DB_Main.getConnection();
        PreparedStatement selectExpenses = con.prepareStatement("select expID, empID, desc, amt from "
                + "expenses where payMethod = '" + payMethod + "'");

        ResultSet rs = selectExpenses.executeQuery();
        ArrayList<PurchaseModel> exp= new ArrayList<>();

        while (rs.next()) {
            PurchaseModel ex = new PurchaseModel();
            ex.setexpID(rs.getString("expID"));

            ex.setempID(rs.getString("empID"));

            ex.setTruckID(rs.getString("desc"));
            ex.setamt(rs.getString("amt"));



            exp.add(ex);
        }

        return exp;
    }

}
