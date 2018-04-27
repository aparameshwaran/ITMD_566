/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: PurchaseModel.java
 * Final Project: Car services App
 */

package com.CSModel;

public class PurchaseModel {
    private String expID;
    private String empID;
    private String truckID;
    private String expType;
    private String expCategory;
    private String amt;
    private String desc;
    private String datePurchased;
    private String dateSubmitted;
    private String advAmount;
    private String payMethod;
    
    
    @Override
    public String toString() {
        return "Expense{" + "expID=" + getexpID() + ", empID=" + getempID() + ", truckid=" + getTruckID() + 
                ", expType=" + getexpType() + ", expenseCategory=" + getexpCategory() + ", amt=" 
                + getamt() + ", desc=" + getdesc() + ", datePurchased=" + getDatePurchased() +  ", dateSubmitted=" 
                + getDateSubmitted() + ", advAmount=" + getadvAmount() + ", payMethod=" + getpayMethod() + '}';
    }

    public PurchaseModel(){
        
    }

    /**
     * @return the expID
     */
    public String getexpID() {
        return expID;
    }

    /**
     * @param expID the expID to set
     */
    public void setexpID(String expID) {
        this.expID = expID;
    }

    /**
     * @return the empID
     */
    public String getempID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setempID(String empID) {
        this.empID = empID;
    }

    /**
     * @return the truckID
     */
    public String getTruckID() {
        return truckID;
    }

    /**
     * @param truckID the truckID to set
     */
    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    /**
     * @return the expType
     */
    public String getexpType() {
        return expType;
    }

    /**
     * @param expType the expType to set
     */
    public void setexpType(String expType) {
        this.expType = expType;
    }

    /**
     * @return the expCategory
     */
    public String getexpCategory() {
        return expCategory;
    }

    /**
     * @param expCategory the expCategory to set
     */
    public void setexpCategory(String expCategory) {
        this.expCategory = expCategory;
    }

    /**
     * @return the amt
     */
    public String getamt() {
        return amt;
    }

    /**
     * @param amt the amt to set
     */
    public void setamt(String amt) {
        this.amt = amt;
    }

    /**
     * @return the desc
     */
    public String getdesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setdesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the datePurchased
     */
    public String getDatePurchased() {
        return datePurchased;
    }

    /**
     * @param datePurchased the datePurchased to set
     */
    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    /**
     * @return the dateSubmitted
     */
    public String getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * @param dateSubmitted the dateSubmitted to set
     */
    public void setDateSubmitted(String dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    /**
     * @return the advAmount
     */
    public String getadvAmount() {
        return advAmount;
    }

    /**
     * @param advAmount the advAmount to set
     */
    public void setadvAmount(String advAmount) {
        this.advAmount = advAmount;
    }

    /**
     * @return the payMethod
     */
    public String getpayMethod() {
        return payMethod;
    }

    /**
     * @param payMethod the payMethod to set
     */
    public void setpayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}
