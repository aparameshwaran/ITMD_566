/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: UserCommentController.java
 * Final Project: Car services App
 */
package com.CSControllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.UserCommentModel;


public class UserCommentController {

    DB_Main main = new DB_Main();

    public ArrayList<UserCommentModel> getComments(String transactionID) throws Exception {

        Connection con = DB_Main.getConnection();
        PreparedStatement selectComments = con.prepareStatement("select commentDateTime, comment from "
                + "comments where transactionID = '" + transactionID + "'");

        ResultSet rs = selectComments.executeQuery();
        ArrayList<UserCommentModel> comments = new ArrayList<>();

        while (rs.next()) {
            UserCommentModel com = new UserCommentModel();
            com.setcDateTime(rs.getString("commentDateTime"));
       
            com.setComments(rs.getString("comment"));
      

            comments.add(com);
        }

        return comments;
    }

}
