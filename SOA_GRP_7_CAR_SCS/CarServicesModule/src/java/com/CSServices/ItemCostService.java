/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: ItemCostService.java
 * Final Project: Car services App
 */
package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.CSControllers.ItemPriceController;
import com.CSModel.ItemPriceModel;


@WebService(name = "PriceList", serviceName = "PriceListService")
public class ItemCostService {

   
    @WebMethod(operationName = "listPrices")
    public ArrayList<ItemPriceModel> listPrices(@WebParam(name = "priceID") String priceID) throws Exception {

        ItemPriceController pl = new ItemPriceController();
        System.out.println(pl.getPrices(priceID));
        return pl.getPrices(priceID);
    }

}
