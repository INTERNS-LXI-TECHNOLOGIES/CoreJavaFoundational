package com.lxisoft.carproject;

public class Car{
   private String brand;
   private  String model;
   private  String color;
   private  String price;

   public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getPrice() {
    return price;
}

public void setPrice(String price) {
    this.price = price;
}

        Tyre [] tyres;   
        Door []  doors;
   
       Car(String brand, String model, String color, String price,Tyre[] tyres,Door[] doors) {
           this.brand = brand;
           this.model = model;
           this.color = color;
           this.price = price;
           this.tyres = tyres;
           this.doors = doors;
   
   }
   
   public void printCarDetails() {
   
   
   System.out.println("Car Brand :"+this.brand);
   System.out.println("Car Model :"+this.model);
   System.out.println("Car Color :"+this.color);
   System.out.println("Car Price :"+this.price+"\n");
   System.out.println("Car Tyre :"+this.tyres+"\n" );
   System.out.println("Car Door :"+this.doors+"\n");
   
   
   System.out.println(".........Tyre..........:");
   for (Tyre tyre : tyres) {
       tyre.printTyreDetails();
   }


   System.out.println("......Door.....:");
   for (Door door : doors) {
       door.printDoorDetails();
   }
}

}

