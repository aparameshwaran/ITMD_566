/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: UserCommentModel.java
 * Final Project: Car services App
 */

package com.CSModel;

public class UserCommentModel {
    private String cID;
    private String cDateTime;
    private String comment;
    //
    private String custID;
    //
    private String locID;
    //
    private String transacID;
    // 
    private String truckID;
    
    @Override
    public String toString() {
        return "Comment{" + "cID=" + getcID() + ", cDateTime=" + getcDateTime() + ", comment=" + getComment() + 
                ", custID=" + getcustID() + ", locID=" + getlocID() + ", transacID=" 
                + gettransacID() + ", truckID=" + getTruckID() +')';
    }

    
    
    public UserCommentModel(){
        
    }

    /**
     * @return the cID
     */
    public String getcID() {
        return cID;
    }

    /**
     * @param cID the cID to set
     */
    public void setcID(String cID) {
        this.cID = cID;
    }

    /**
     * @return the cDateTime
     */
    public String getcDateTime() {
        return cDateTime;
    }

    /**
     * @param cDateTime the cDateTime to set
     */
    public void setcDateTime(String cDateTime) {
        this.cDateTime = cDateTime;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComments(String comment) {
        this.comment = comment;
    }

    /**
     * @return the custID
     */
    public String getcustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setcustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the locID
     */
    public String getlocID() {
        return locID;
    }

    /**
     * @param locID the locID to set
     */
    public void setlocID(String locID) {
        this.locID = locID;
    }

    /**
     * @return the transacID
     */
    public String gettransacID() {
        return transacID;
    }

    /**
     * @param transacID the transacID to set
     */
    public void settransacID(String transacID) {
        this.transacID = transacID;
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
}
