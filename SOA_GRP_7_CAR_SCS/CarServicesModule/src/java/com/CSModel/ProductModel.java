/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: ProductModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *

 */
public class ProductModel {
    
    private String itemID;
    private String transactionID;
    private String itemName;
    private String itemDescription;
    private String qty;
    private String price;
    
    
    @Override
    public String toString() {
        return "Item{" + "itemID=" + getItemID() + ", transactionID=" + getTransactionID() + ", itemName=" + getItemName() + 
                ", itemDescription=" + getItemDescription() + ", qty=" + getqty() + ", price=" 
                + getPrice() + '}';
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
     * @return the transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * @param transactionID the transactionID to set
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the qty
     */
    public String getqty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setqty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
