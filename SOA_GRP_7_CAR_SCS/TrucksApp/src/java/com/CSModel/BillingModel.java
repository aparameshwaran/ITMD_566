/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: BillingModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *
 */
public class BillingModel {
    
    
    private String invoiceID;
    private String orderID;
    private String itemID;
    private String priceID;
    
    
    public String toString() {
        return "Invoice{" + "invoiceID=" + getInvoiceID() + ", orderID=" + getOrderID() + ", itemID=" + getItemID() + 
                ", priceID=" + getPriceID() +  '}';
    }

    /**
     * @return the invoiceID
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * @param invoiceID the invoiceID to set
     */
    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the priceID
     */
    public String getPriceID() {
        return priceID;
    }

    /**
     * @param priceID the priceID to set
     */
    public void setPriceID(String priceID) {
        this.priceID = priceID;
    }

    
}
