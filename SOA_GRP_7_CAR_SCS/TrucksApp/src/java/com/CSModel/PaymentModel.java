/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: PaymentModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *
 */
public class PaymentModel {
    private int payID;
    private int orderID;
    private int paymentMethodID;
    private double paymentAmount;
    private String paymentDate;
    private double checkNumber;
    private double creditCardNumber;
    private String cardHolderName;
    private String creditCardExpDte;
    private int creditCardAuthNumber;
    
    public String toString() {
        return "Payment{" + "payID=" + getpayID() + ", paymentMethodID=" + getPaymentMethodID() + ", paymentAmount=" + getPaymentAmount() + 
                ", paymentDate=" + getPaymentDate() + ", checkNumber=" + getCheckNumber() + ", creditcardNumber=" 
                + getCreditCardNumber() + ", CardHolderName=" + getCardHolderName() + ", creditCardExpDate=" + getCreditCardExpDte() + ", creditcardAuthNumber=" + getCreditCardAuthNumber() + '}';
    }

    
    public PaymentModel(){
        
    }

    /**
     * @return the payID
     */
    public int getpayID() {
        return payID;
    }

    /**
     * @param payID the payID to set
     */
    public void setpayID(int payID) {
        this.payID = payID;
    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the paymentMethodID
     */
    public int getPaymentMethodID() {
        return paymentMethodID;
    }

    /**
     * @param paymentMethodID the paymentMethodID to set
     */
    public void setPaymentMethodID(int paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
    }

    /**
     * @return the paymentAmount
     */
    public double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount the paymentAmount to set
     */
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return the paymentDate
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the checkNumber
     */
    public double getCheckNumber() {
        return checkNumber;
    }

    /**
     * @param checkNumber the checkNumber to set
     */
    public void setCheckNumber(double checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * @return the creditCardNumber
     */
    public double getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber(double creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * @return the cardHolderName
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * @param cardHolderName the cardHolderName to set
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * @return the creditCardExpDte
     */
    public String getCreditCardExpDte() {
        return creditCardExpDte;
    }

    /**
     * @param creditCardExpDte the creditCardExpDte to set
     */
    public void setCreditCardExpDte(String creditCardExpDte) {
        this.creditCardExpDte = creditCardExpDte;
    }

    /**
     * @return the creditCardAuthNumber
     */
    public int getCreditCardAuthNumber() {
        return creditCardAuthNumber;
    }

    /**
     * @param creditCardAuthNumber the creditCardAuthNumber to set
     */
    public void setCreditCardAuthNumber(int creditCardAuthNumber) {
        this.creditCardAuthNumber = creditCardAuthNumber;
    }
}
