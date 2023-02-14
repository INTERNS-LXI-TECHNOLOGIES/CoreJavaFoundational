package com.lxisoft.animal;

public class Cheetah extends Animal implements Carnivores {

    public Cheetah(String name, double strength, double hungerLevel, int vision, Location location) {
        super(name, strength, hungerLevel, vision, location);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fight(Animal animal) {
        if (animal instanceof Herbivores){
            if(((Herbivores)animal).escapeFromEnemy() == true){
                System.out.println(animal.getName()+" luckily escaped");
            }}
            else{
       this.setStrength(this.getStrength()-1);
       this.setHungerLevel(getHungerLevel()-3);
       animal.setStrength(getStrength()-3);
       animal.setHungerLevel(getHungerLevel()-2);
     
       }
    }}

  
     
    

