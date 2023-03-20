package com.lxisoft.view;

public class VehicleInfo {
    private String center;
    private String date;


public String getCenter() {
        return center;
    }
public void setCenter(String center) {
        this.center = center;
    }
public String getDate() {
        return date;
    }
public void setDate(String date) {
        this.date = date;
    }
@Override
public String toString() {
        return "Center : " + center + "\n" +  " Updated Date : " + date + "\n";
    
    }}