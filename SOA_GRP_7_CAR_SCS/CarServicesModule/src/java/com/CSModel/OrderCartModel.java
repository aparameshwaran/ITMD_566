/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: OrderCartModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *
 */
public class OrderCartModel {

    /**
     * @param orderID the orderID to set
     */
   

    /**
     * @param Total the Total to set
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }
    private String orderID; 
    private String orderDate;
    private String custID;
    private String empID;
    private String truckID;
    private String isSpecial;
    private String PostNumber;
    private String Total;

    public String getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getcustID() {
        return custID;
    }

    public String getempID() {
        return empID;
    }

    public String getTruckID() {
        return truckID;
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public String getPON() {
        return PostNumber;
    }

    public String getTotal() {
        return Total;
    }
    
 public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @param custID the custID to set
     */
    public void setcustID(String custID) {
        this.custID = custID;
    }

    /**
     * @param empID the empID to set
     */
    public void setempID(String empID) {
        this.empID = empID;
    }

    /**
     * @param truckID the truckID to set
     */
    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    /**
     * @param isSpecial the isSpecial to set
     */
    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }

    /**
     * @param PostNumber the PostNumber to set
     */
    public void setPostNumber(String PostNumber) {
        this.PostNumber = PostNumber;
    }
    
    public OrderCartModel(){
        
    }

    @Override
    public String toString() {
        return "Order{" + "orderDate=" + orderDate + ", custID=" + custID + ", empID=" + empID + ", truckID=" + truckID + ", isSpecial=" + isSpecial + ", PON=" + PostNumber + ", Total=" + Total + '}';
    }
    
    
    
    
}
