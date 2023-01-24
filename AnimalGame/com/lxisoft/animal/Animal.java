package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;

public class Animal {
    
    String name;
    int strength;
    int hungerLevel;

    public Animal(){

    }

    public Animal(String name, int strength, int hungerLevel){
        this.name = name;
        this.strength = strength;
        this.hungerLevel = hungerLevel;

    }
    //getters and setters
    public String getName (){
       return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
    }

    public void modStrength(){
    this.strength = this.strength/2;
    }
    public int gethungerLevel(){
        return hungerLevel;
    }
    public void sethungerLevel(int hungerLevel){
        
    }
    public void modhungerLevel(){
        this.hungerLevel = this.hungerLevel/2;
    }



    public String toString(){
        return  this.name + " " + "strength " + this.strength + " Hunger Level: " + this.hungerLevel + " is the winner";
    }
}
