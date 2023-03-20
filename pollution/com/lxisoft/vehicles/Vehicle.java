package com.lxisoft.vehicles;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.view.VehicleInfo;

public class Vehicle {

    private String brandName;
    private String regNo;

    private List <VehicleInfo> info = new ArrayList<VehicleInfo>();

public List<VehicleInfo> getInfo() {
    return info;
    }
public void setInfo(List<VehicleInfo> info) {
    this.info = info;
    }

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
public boolean equals(Object obj) {

        boolean s =false;
        if(obj!=null && obj instanceof Vehicle)
        if(((Vehicle)obj).getRegNo().equals(this.regNo))
        
        s=true;
        return s;
    }

@Override
public String toString() {
        
        return "Vehicle :"  + brandName + "\n" +  "regNo :" + regNo+ "\n" + info + "\n";

    }}