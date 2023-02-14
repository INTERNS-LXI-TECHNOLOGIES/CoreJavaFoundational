package com.lxisoft.animal;

import java.nio.Buffer;
import java.util.Random;

public class Giraffe extends Animal implements Herbivores {

    public Giraffe(String name, double strength, double hungerLevel, int vision, Location location) {
        super(name, strength, hungerLevel, vision, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean escapeFromEnemy() {
        Random r = new Random();
        int girrrandom = r.nextInt(4);
        if(girrrandom ==1){
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