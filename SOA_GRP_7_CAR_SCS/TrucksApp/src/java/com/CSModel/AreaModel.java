/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: AreaModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *

 */
public class AreaModel {
    private String locID;
    //
    private String locName;
    //
    private String locCode;
    //
    private String isAuction;
    //
    private String customerID;
    //
    private String address1;
    //
    private String address2;
    //
    private String city;
    //
    private String state;
    //
    private String zipcode;
    //
    private String locContactName;
    //
    private String locPhone;
    //
    private String locFax;
    //
    private String locEmail;

    @Override
    public String toString() {
        return "Location{" + "locID=" + locID + ", locName=" + locName + ", locCode=" + locCode 
                + ", isAuction=" + isAuction + ", customerID=" + customerID + ", address1=" + address1 + ", address2=" 
                + address2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", locContactName=" + locContactName 
                + ", locPhone=" + locPhone + ", locFax=" + locFax + ", locEmail=" + locEmail + '}';
    }

    public String getlocID() {
        return locID;
    }

    public void setlocID(String locID) {
        this.locID = locID;
    }

    public String getlocName() {
        return locName;
    }

    public void setlocName(String locName) {
        this.locName = locName;
    }

    public String getlocCode() {
        return locCode;
    }

    public void setlocCode(String locCode) {
        this.locCode = locCode;
    }

    public String getIsAuction() {
        return isAuction;
    }

    public void setIsAuction(String isAuction) {
        this.isAuction = isAuction;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getaddress1() {
        return address1;
    }

    public void setaddress1(String address1) {
        this.address1 = address1;
    }

    public String getaddress2() {
        return address2;
    }

    public void setaddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getzipcode() {
        return zipcode;
    }

    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getlocContactName() {
        return locContactName;
    }

    public void setlocContactName(String locContactName) {
        this.locContactName = locContactName;
    }

    public String getlocPhone() {
        return locPhone;
    }

    public void setlocPhone(String locPhone) {
        this.locPhone = locPhone;
    }

    public String getlocFax() {
        return locFax;
    }

    public void setlocFax(String locFax) {
        this.locFax = locFax;
    }

    public String getlocEmail() {
        return locEmail;
    }

    public void setlocEmail(String locEmail) {
        this.locEmail = locEmail;
    }
    
    public AreaModel(){
        
    }
}
