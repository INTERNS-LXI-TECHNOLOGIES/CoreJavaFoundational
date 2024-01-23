package com.lxisoft.vehicle;

import java.util.*;

public class Vehicle {

   public List<VehicleInfo>vehicleInfo = new ArrayList<VehicleInfo>();

    private String ownerName;
    private String registerNo;

    public boolean temp = false;
    
    
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getRegisterNo() {
        return registerNo;
    }
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public boolean equals(Object obj){

        if(obj != null && obj instanceof Vehicle ) 
        if(((Vehicle) obj).getRegisterNo().equals(this.registerNo))
        {

            temp =true;


        }

        return temp;


    }
   
    @Override
    public String toString() {
        return "Vehicle Owner Name =" + ownerName + "\n" + "Register No =" +  
        registerNo + "\n" + "Vehicle Info" + vehicleInfo;
    }

    
}
