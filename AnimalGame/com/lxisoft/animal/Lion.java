package com.lxisoft.animal;

public class Lion extends Animal implements Carnivores{

    public Lion(String name, double strength, double hungerLevel, int vision, Location location) {
        super( name, strength, hungerLevel, vision, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fight(Animal animal) {
       if (animal instanceof Herbivores){
       if(((Herbivores)animal).escapeFromEnemy() == true){
            System.out.println(animal.getName()+" luckily escaped");
        }
        else{
    
            animal.setStrength(animal.getStrength()-3);
            animal.setHungerLevel(animal.getHungerLevel()-3);
        }}
       else{
       this.setStrength(this.getStrength()-1);
       this.setHungerLevel(this.getHungerLevel()-1);
       animal.setStrength(animal.getStrength()-3);
       animal.setHungerLevel(animal.getHungerLevel()-3);
     
       }
    }
    }
    
 
