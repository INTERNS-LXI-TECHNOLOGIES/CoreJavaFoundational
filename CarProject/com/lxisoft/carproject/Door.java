package com.lxisoft.carproject;

public class Door {
    private String color;
    private String model;
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String model) {
        this.model = model;
    }

    public Door(String color,String model){
        
        this.color = color;
        this.model = model;
    }

    public void printDoorDetails(){

    System.out.println(".........DOOR..........\n");
    System.out.println("Door color is :"+ this.color);
    System.out.println("Door Model is :"+ this.model);
    }
}
