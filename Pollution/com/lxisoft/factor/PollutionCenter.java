package com.lxisoft.factor;
import java.util.*;

import com.lxisoft.vehicle.Vehicle;

public class PollutionCenter {

    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();



public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
 public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }



@Override
public String toString() {
    
    return "Vehicle Details :" + vehicleList;

}


    
}

    

