/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: UserCommentService.java
 * Final Project: Car services App
 */
package com.CSServices;


import java.util.ArrayList;
import javax.jws.WebService;

import com.CSControllers.UserCommentController;
import com.CSModel.UserCommentModel;

import javax.jws.WebMethod;
import javax.jws.WebParam;




@WebService(name = "CommentList", serviceName = "CommentListService")
public class UserCommentService {

   
    @WebMethod(operationName = "TransactionID")
    public ArrayList<UserCommentModel> listComments(@WebParam(name = "transactionID") String transactionID) throws Exception {

        UserCommentController cml = new UserCommentController();
        System.out.println(cml.getComments(transactionID));
        return cml.getComments(transactionID);
    }

}

