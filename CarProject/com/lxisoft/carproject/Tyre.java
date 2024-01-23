package com.lxisoft.carproject;

public class Tyre {

private String brand;
private String tyretype;

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getTyretype() {
    return tyretype;
}

public void setTyretype(String tyretype) {
    this.tyretype = tyretype;
}


public Tyre(String brand, String tyretype){

        this.brand = brand;
        this.tyretype = tyretype;

}

public void printTyreDetails() {

System.out.println("......TYRE.....\n");
System.out.println("Tyre Brand is :"+ this.brand);
System.out.println("Tyre Type is :"+ this.tyretype);

}

}
    
