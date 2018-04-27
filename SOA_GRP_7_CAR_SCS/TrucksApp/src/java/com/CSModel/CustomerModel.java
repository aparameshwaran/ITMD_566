/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: CustomerModel.java
 * Final Project: Car services App
 */

package com.CSModel;


public class CustomerModel {
    private String custID;
    private String state;
    private String custName;
    private String busiName;
    private String billingadd;
    private String city;
    private String zipcode;
    private String Country;
    private String Number;
    private String phNumber;
    private String faxNumber;
    private String email;
    private String custType;

    @Override
    public String toString() {
        return "Customer{" + "custID=" + custID + ", state=" + state + 
                ", custName=" + custName + ", busiName=" + busiName + ", billingadd=" +
                billingadd + ", city=" + city + ", zipcode=" + zipcode + ", Country=" + Country + ", Number=" + 
                Number + ", phNumber=" + phNumber + ", faxNumber=" + faxNumber + ", email=" + email + ", custType=" +
                custType + ", CompanyName=" + CompanyName + ", contactName=" + contactName + ", date=" + date + '}';
    }

    public String getcustType() {
        return custType;
    }

    public void setcustType(String custType) {
        this.custType = custType;
    }
    
    private String contactName;
    private String CompanyName;
    
    private String date;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getcustID() {
        return custID;
    }

    public void setcustID(String custID) {
        this.custID = custID;
    }
    
    public String getbusiName() {
        return busiName;
    }

    public String getcustName() {
        return custName;
    }

   
     public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
    
    public void setbusiName(String busiName) {
        this.busiName = busiName;
    }
    
    public void setcustName(String custName) {
        this.custName = custName;
    }

    public String getbillingadd() {
        return billingadd;
    }

    public void setbillingadd(String billingadd) {
        this.billingadd = billingadd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getzipcode() {
        return zipcode;
    }

    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getphNumber() {
        return phNumber;
    }

    public void setphNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public CustomerModel(){
        
    }
    
  
}
