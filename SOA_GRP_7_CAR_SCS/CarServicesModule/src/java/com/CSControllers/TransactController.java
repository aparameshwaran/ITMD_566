/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: TransactController.java
 * Final Project: Car services App
 */

package com.CSControllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.TransactionModel;

/**
 *
 */
public class TransactController {
    DB_Main main = new DB_Main();
    
    public ArrayList<TransactionModel> getTransaction(String orderID) throws Exception {

        Connection con = main.getConnection();
        PreparedStatement selesctCustomers = con.prepareStatement("select transactionID, transactionDate, transactionDescription, "
                + "transactionAmount, disc, unitPrice, qty from transactions where orderID = '" + orderID + "'");

        ResultSet rs = selesctCustomers.executeQuery();
        ArrayList<TransactionModel> transactions = new ArrayList<>();

        while (rs.next()) {
            TransactionModel tran = new TransactionModel();
            tran.setTransactionID(rs.getString("transactionID"));
            tran.setTransactionDate(rs.getString("transactionDate"));
            tran.setTransactionDescription(rs.getString("transactionDescription"));
            tran.setTransactionAmount(rs.getString("transactionAmount"));
            tran.setdisc(rs.getString("disc"));
            tran.setUnitPrice(rs.getString("unitPrice"));
            tran.setqty(rs.getString("qty"));

            transactions.add(tran);
        }

        return transactions;
    }
}
