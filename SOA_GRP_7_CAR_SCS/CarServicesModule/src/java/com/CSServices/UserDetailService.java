/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: UserDetailService.java
 * Final Project: Car services App
 */

package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.CSControllers.CustomerController;
import com.CSModel.CustomerModel;


@WebService(name = "CustomerList", serviceName = "CustomerListService")
public class UserDetailService {

    
    @WebMethod(operationName = "listCustomers")
    public ArrayList<CustomerModel> listCustomers(@WebParam(name = "city") String city) throws Exception {

        CustomerController cl = new CustomerController();
        System.out.println(cl.getCustomers(city));
        return cl.getCustomers(city);
    }

}


