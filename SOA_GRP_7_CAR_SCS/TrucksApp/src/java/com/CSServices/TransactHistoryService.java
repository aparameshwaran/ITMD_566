/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: TransactHistoryService.java
 * Final Project: Car services App
 */
package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebService;

import com.CSControllers.TransactController;
import com.CSModel.TransactionModel;

import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(name = "TransactionList", serviceName = "TransactionListService")
public class TransactHistoryService {

    
    @WebMethod(operationName = "listTransactions")
    public ArrayList<TransactionModel> listTransactions (@WebParam(name = "orderID") String orderID) throws Exception{
        
        TransactController tl = new TransactController();
        return tl.getTransaction(orderID);
    }
}
