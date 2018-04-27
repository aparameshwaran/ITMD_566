/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: ProductsService.java
 * Final Project: Car services App
 */
package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebService;

import com.CSControllers.ProductController;
import com.CSModel.ProductModel;

import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(name = "ItemList", serviceName = "ItemListService")
public class ProductsService {

   
    @WebMethod(operationName = "ItemID")
    public ArrayList<ProductModel> listItems(@WebParam(name = "itemID") String itemID) throws Exception {

        ProductController itm = new ProductController();
         
          System.out.println(itm.getItems(itemID));
        return itm.getItems(itemID);
    }

}

