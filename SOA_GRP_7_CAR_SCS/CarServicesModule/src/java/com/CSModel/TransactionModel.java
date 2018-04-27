/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: TransactionModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *
 */
public class TransactionModel {
    private String transactionID;
    private String orderID;
    private String priceID;
    private String transactionDate;
    private String transactionAmount;
    private String transactionDescription;
    private String truckID;
    private String empID;
    private String disc;
    private String qty;
    private String unitPrice;

    @Override
    public String toString() {
        return "Transaction{" + "transactionID=" + transactionID + ", orderID=" + orderID + ", priceID=" + priceID + 
                ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + ", transactionDescription=" 
                + transactionDescription + ", truckID=" + truckID + ", empID=" + empID + ", disc=" 
                + disc + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }

    

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
    
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPriceID() {
        return priceID;
    }

    public void setPriceID(String priceID) {
        this.priceID = priceID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

   

    public String getTruckID() {
        return truckID;
    }

    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    public String getempID() {
        return empID;
    }

    public void setempID(String empID) {
        this.empID = empID;
    }

    public String getdisc() {
        return disc;
    }

    public void setdisc(String disc) {
        this.disc = disc;
    }

    public String getqty() {
        return qty;
    }

    public void setqty(String qty) {
        this.qty = qty;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public TransactionModel(){
        
    }
    
}
