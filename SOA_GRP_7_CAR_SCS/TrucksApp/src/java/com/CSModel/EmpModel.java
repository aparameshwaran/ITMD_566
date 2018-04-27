/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: EmpModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *
 */
public class EmpModel {
    private String empID;
    private String fname;
    private String lname;
    private String email;
    private String ext;
    private String homePh;
    private String cellPh;
    private String Title;
    private String SSN;
    private String licenseNo;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String birthDate;
    private String dateHired;
    private String salary;
    
    @Override
    public String toString() {
        return "Employee{" + "empID=" + getempID() + ", fname=" + getfname() + ", lname=" + getlname() + 
                ", email=" + getemail() + ", ext=" + getext() + ", homePhr=" 
                + gethomePh() + ", cellPh=" + getcellPh() + ", Title=" + getTitle() + ", SSN=" + getSSN() + ", licenseNo=" 
                + getlicenseNo() + ", address=" + getAddress() + ", city=" + getCity() +",State="+getState()+",zipcode=" +getzipcode()+","
                + "birthDste="+getBirthDate()+",dateHired="+getDateHired()+",salary="+getSalary()+ '}';
    }

    
    public EmpModel(){
        
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
     * @return the fname
     */
    public String getfname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setfname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getlname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setlname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the email
     */
    public String getemail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setemail(String email) {
        this.email = email;
    }

    /**
     * @return the extention
     */
    public String getext() {
        return ext;
    }

    /**
     * @param ext the extention to set
     */
    public void setext(String ext) {
        this.ext = ext;
    }

    /**
     * @return the homePh
     */
    public String gethomePh() {
        return homePh;
    }

    /**
     * @param homePh the homePh to set
     */
    public void sethomePh(String homePh) {
        this.homePh = homePh;
    }

    /**
     * @return the cellPh
     */
    public String getcellPh() {
        return cellPh;
    }

    /**
     * @param cellPh the cellPh to set
     */
    public void setcellPh(String cellPh) {
        this.cellPh = cellPh;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the SSN
     */
    public String getSSN() {
        return SSN;
    }

    /**
     * @param SSN the SSN to set
     */
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /**
     * @return the licenseNo
     */
    public String getlicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo the licenseNo to set
     */
    public void setlicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipcode
     */
    public String getzipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the dateHired
     */
    public String getDateHired() {
        return dateHired;
    }

    /**
     * @param dateHired the dateHired to set
     */
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
