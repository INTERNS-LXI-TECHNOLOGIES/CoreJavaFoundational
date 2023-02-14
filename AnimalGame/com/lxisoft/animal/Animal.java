package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;

public class Animal {
   private String name;
   private double strength;
   private double hungerLevel;
   private int vision;
   Location location;
   private static String Feature;

   

    public Animal( String name, double strength, double hungerLevel, int vision, Location location){
        this.name = name;
        this.strength = strength;
        this.hungerLevel = hungerLevel;
        this.vision = vision;
        this.location = location;

    }

    //getters and setters
    public static String getFeature(){
        return Feature;
    }
    public void setFeature(String Feature){
    }
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
        this.hungerLevel = Math.round(this.hungerLevel/2);
    }
    public void modStrength(){
        this.strength = Math.round(this.strength/2);
    
    }
    void  anmialData(){
       
       System.out.println(  "-> " + this.name + " "  +  "strength: " + this.strength + " Hunger Level: " + this.hungerLevel 
        +  " vision: " + this.vision );
    }
    void locationData(){
     System.out.println(this.name+ " location x= " + this.location.locationx+ " location y= " + this.location.locationy);
    }
        public String toString(){
        return   "The Winner is "+ this.name.toUpperCase() + " with strength: " + 
         this.strength + " Hunger Level: " + this.hungerLevel + " vision " +this.vision;
    }

}