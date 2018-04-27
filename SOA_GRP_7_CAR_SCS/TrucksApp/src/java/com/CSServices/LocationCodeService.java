/* Group Members: Ajay Parameshwaran,Sayali Nagwekar 
 * Date: 4/26/2018
 * File name: LocationCodeService.java
 * Final Project: Car services App
 */

package com.CSServices;

import java.util.ArrayList;
import javax.jws.WebService;

import com.CSControllers.LocationController;
import com.CSModel.AreaModel;

import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(name = "LocationList", serviceName = "LocationListService")
public class LocationCodeService {

    @WebMethod(operationName = "listLocations")
    public ArrayList<AreaModel> listLocations (@WebParam(name = "locationCode") String locationCode) throws Exception{
        
        LocationController ll = new LocationController();
        return ll.getLocations(locationCode);
    }
}
