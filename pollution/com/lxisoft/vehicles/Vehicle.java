package com.lxisoft.vehicles;

import java.util.ArrayList;
import java.util.List;

import com.lxisoft.view.VehicleInfo;

public class Vehicle {

    private String brandName;
    private String regNo;

   public List <VehicleInfo> info = new ArrayList<VehicleInfo>();

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
  
    @Override
    public String toString() {
        
        return "Vehicle :"  + brandName + "\n" +  "regNo :" + regNo+ "\n" + info + "\n";

        
    }
      
}

