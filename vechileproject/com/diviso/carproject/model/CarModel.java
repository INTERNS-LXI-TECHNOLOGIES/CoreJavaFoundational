package com.diviso.carproject.model;

public class CarModel {
    private String carName;
    private String ownerName;
    private String registerNumber;
         
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

        

    public CarModel(String carName, String ownerName, String registerNumber) {
        this.carName = carName;
        this.ownerName = ownerName;
        this.registerNumber = registerNumber;
    }

    
}
    



   