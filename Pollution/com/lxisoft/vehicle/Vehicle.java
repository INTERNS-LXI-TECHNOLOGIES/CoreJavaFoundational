package com.lxisoft.vehicle;

import java.util.Date;

public class Vehicle {

    private String ownerName;
    private int registerNo;
    private Date date;
    
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public int getRegisterNo() {
        return registerNo;
    }
    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Vehicle ownerName=" + ownerName + ", registerNo=" + registerNo + ", date=" + date;
    }

    
}
