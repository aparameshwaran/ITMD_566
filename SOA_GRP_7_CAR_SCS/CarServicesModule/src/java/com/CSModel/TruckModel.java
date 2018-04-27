/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: TruckModel.java
 * Final Project: Car services App
 */

package com.CSModel;

/**
 *
 */
public class TruckModel {
    private String truckID;
    //
    private String VIN;
    //
    private String makeYear;
    //
    private String model;
    //
    private String licenseNo;
    //
    private String empID;
    //
    private String color;
    //
    private String cost;
    
    
    @Override
    public String toString() {
        return "Truck{" + "truckID=" + getTruckID() + ", VIN=" + getVIN() + ", makeYear=" + getMakeYear() + 
                ", model=" + getModel() + ", licenseNo=" + getlicenseNo() + ", empID=" 
                + getempID() + ", color=" + getColor() + ", cost=" + getCost()  + '}';
    }

    public TruckModel(){
        
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
     * @return the VIN
     */
    public String getVIN() {
        return VIN;
    }

    /**
     * @param VIN the VIN to set
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * @return the makeYear
     */
    public String getMakeYear() {
        return makeYear;
    }

    /**
     * @param makeYear the makeYear to set
     */
    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the licensePlateNo
     */
    public String getlicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo
     */
    public void setlicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }
}
