/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: EmployeeController.java
 * Final Project: Car services App
 */

package com.CSControllers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.CSDao.DB_Main;
import com.CSModel.EmpModel;

/**
 *
 */
public class EmployeeController {

    DB_Main main = new DB_Main();

    public ArrayList<EmpModel> getEmployees(String extension ) throws Exception {

        Connection con = DB_Main.getConnection();
        PreparedStatement selectEmployees = con.prepareStatement("select employeeID, firstName, lastName, email from "
                + "employees where extension  = '" + extension + "'");

        ResultSet rs = selectEmployees.executeQuery();
        ArrayList<EmpModel> employees = new ArrayList<>();

        while (rs.next()) {
            EmpModel emp = new EmpModel();
            emp.setempID(rs.getString("empID"));

            emp.setemail(rs.getString("email"));

            emp.setfname(rs.getString("firstName"));
            emp.setlname(rs.getString("lastName"));


            employees.add(emp);
        }

        return employees;
    }

}
