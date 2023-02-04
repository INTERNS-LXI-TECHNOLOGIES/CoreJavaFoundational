package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;

public class Animal {
   public Location location;
   public String name;
   public double strength;
   public double hungerLevel;
   public int vision;
   

    public Animal(String name, double strength, double hungerLevel, int vision, Location location){
        this.name = name;
        this.strength = strength;
        this.hungerLevel = hungerLevel;
        this.vision = vision;
        this.location = location;

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
    public Location getLocation(){
        return location;
    }
    public void setLocation(Location location){
        this.location = location;
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