/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: PaymentService.java
 * Final Project: Car services App
 */

package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.CSControllers.PaymentController;
import com.CSModel.PurchaseModel;


@WebService(name = "ExpenseList", serviceName = "ExpenseListService")
public class PaymentService {

   
    @WebMethod(operationName = "paymentMethod")
    public ArrayList<PurchaseModel> listExpenses(@WebParam(name = "paymentMethod") String paymentMethod) throws Exception {

        PaymentController el = new PaymentController();
        System.out.println(el.getExpenses(paymentMethod));
        return el.getExpenses(paymentMethod);
    }

}
