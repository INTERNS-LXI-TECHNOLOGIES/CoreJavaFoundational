package com.lxisoft.animal;

import java.util.Random;

import com.lxisoft.animal.Animal;
import com.lxisoft.animal.Herbivores;
import com.lxisoft.animal.Location;

public class Elephant extends Animal implements Herbivores {

    public Elephant(String name, double strength, double hungerLevel, int vision, Location location) {
        super(name, strength, hungerLevel, vision, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean escapeFromEnemy() {
        // TODO Auto-generated method stub
        Random r = new Random();
        int girrrandom = r.nextInt(1);
        if(girrrandom ==0){
        return true;
        }
        else{
          return false;
        }
    }
    public void herbiFight(Animal animal){
        if(animal instanceof Herbivores){
            this.setStrength(this.getStrength()-1);
            animal.setStrength(animal.getStrength()-1);
        }
     }
        

  
}
    
