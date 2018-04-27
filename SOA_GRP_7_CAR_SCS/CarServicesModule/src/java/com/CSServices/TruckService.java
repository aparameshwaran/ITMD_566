/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: TruckService.java
 * Final Project: Car services App
 */

package com.CSServices;
import javax.jws.WebService;

import com.CSControllers.TruckController;
import com.CSModel.TruckModel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "TrucksList")
public class TruckService {

   
    @WebMethod(operationName = "listTrucks")
    public ArrayList<TruckModel> listTrucks(@WebParam(name = "employeeID") String employeeID) throws Exception {

        TruckController tl = new TruckController();
        System.out.println(tl.getTrucks(employeeID));
        return tl.getTrucks(employeeID);
    }
}
