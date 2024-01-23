package com.lxisoft.vehicle;

public class VehicleInfo {

    private String date;
    private String centreName;


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCentreName() {
        return centreName;
    }
    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }
    @Override
    public String toString() {
        return "VehicleInfo date =" + date + "centreName =" + centreName;
    }

    
    
}
