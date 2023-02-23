package com.lxisoft.animal;

public class Cheetah extends Animal implements Carnivores {

    public Cheetah(String name, double strength, double hungerLevel, int vision, Location location) {
        super(name, strength, hungerLevel, vision, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fight(Animal animal) throws LuckFactorException {
    
       if (animal instanceof Herbivores){
       
       if(((Herbivores)animal).escapeFromEnemy() == true){
        throw new LuckFactorException();
        }}
        if(animal instanceof Herbivores){
    
            animal.setStrength(animal.getStrength()-3);
            animal.setHungerLevel(animal.getHungerLevel()-3);
        }
        if(animal instanceof Carnivores){
       this.setStrength(this.getStrength()-1);
       this.setHungerLevel(this.getHungerLevel()-1);
       animal.setStrength(animal.getStrength()-3);
       animal.setHungerLevel(animal.getHungerLevel()-3);
     
       }
    }

}
    
    
 