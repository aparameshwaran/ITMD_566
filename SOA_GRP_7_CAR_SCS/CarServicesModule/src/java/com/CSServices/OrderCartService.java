/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: OrderCartService.java
 * Final Project: Car services App
 */

package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.CSControllers.OrderController;
import com.CSModel.OrderCartModel;


@WebService(name = "OrderList", serviceName = "OrderListService")
public class OrderCartService {

    
    @WebMethod(operationName = "listOrders")
    public ArrayList<OrderCartModel> listOrders(@WebParam(name = "isSpecial") String isSpecial) throws Exception {

        OrderController ol = new OrderController();
        System.out.println(ol.getOrders(isSpecial));
        return ol.getOrders(isSpecial);
    }

}


