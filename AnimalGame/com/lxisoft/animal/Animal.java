package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Animal implements Comparable<Animal>{
   private String name;
   private double strength;
   private double hungerLevel;
   private int vision;
   private Location location;
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
        this.strength = strength;
    }
    public double getHungerLevel(){
        return hungerLevel;
    }
    public void setHungerLevel(double hungerLevel){
        this.hungerLevel = hungerLevel;
    }
    public int getVision(){
        return vision;
    }
    public void setVision(int vision){ 
        this.vision = vision;      
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

    void locationData(){
     System.out.println(this.name+ " location x= " + this.location.locationx+ " location y= " + this.location.locationy);
    }
    public String toString(){
        System.out.println(this.name.toUpperCase() + " with strength: " + 
         this.strength + " Hunger Level: " + this.hungerLevel + " vision " +this.vision);
         return name;
        
    }
    public boolean equals(Object o){
        if(o instanceof Animal&& o != null){
            if (this.getStrength() ==((Animal)o).getStrength()){
                return true;

                
            }

        }
        else {
          return false;
        
        }
        return false;
    }

    @Override
    public int compareTo(Animal o) {
        return (int) (this.getStrength() - o.getStrength());
           
        }

    }

  
   