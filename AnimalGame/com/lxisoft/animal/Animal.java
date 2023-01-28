package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;

public class Animal {

  private String name;
   private double strength;
   private double hungerLevel;
   private int vision;
   private int locationx;
   private int locationy;

    public Animal(String name, double strength, double hungerLevel, int vision, int locationx, int locationy){
        this.name = name;
        this.strength = strength;
        this.hungerLevel = hungerLevel;
        this.vision = vision;
        this.locationx = locationx;
        this.locationy = locationy;
    }
    //getters and setters
    public String getName (){
       return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public double getStrength(){
        return strength;
    }
    public void setStrength(double strength){
    }
    public double getHungerLevel(){
        return hungerLevel;
    }
    public void setHungerLevel(double hungerLevel){
        
    }
    public int getVision(){
        return vision;
    }
    public void setVision(int vision){
        
    }
    public int getLocationx(){
        return locationx;
    }
    public void setLocationx(int locationx){

    }
    public int getLocationy(){
        return locationy;
    }
    public void setLocationy(int locationy){

    }
    public void modHungerLevel(){
        this.hungerLevel = this.hungerLevel/2;
    }
    public void modStrength(){
        this.strength = this.strength/3;
    }
    
    public String toString(){
        return  this.name + " " + "strength " + this.strength + " Hunger Level: " + this.hungerLevel + " is the winner";
    }
}
