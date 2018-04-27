/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: EmployeeService.java
 * Final Project: Car services App
 * 
 */

 
package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.CSControllers.EmployeeController;
import com.CSModel.EmpModel;


@WebService(name = "EmployeeList", serviceName = "EmployeeListService")
public class EmployeeService {

   
    @WebMethod(operationName = "EXT")
    public ArrayList<EmpModel> listEmployees(@WebParam(name = "extension") String extension) throws Exception {

        EmployeeController el = new EmployeeController();
        System.out.println(el.getEmployees(extension));
        return el.getEmployees(extension);
    }

}
