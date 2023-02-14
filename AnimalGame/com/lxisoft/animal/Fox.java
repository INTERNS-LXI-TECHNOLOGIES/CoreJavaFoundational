package com.lxisoft.animal;

public class Fox extends Animal implements Carnivores {

    public Fox(String name, double strength, double hungerLevel, int vision, Location location) {
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
       this.setStrength(this.getStrength()-3);
       this.setHungerLevel(getHungerLevel()-3);
       animal.setStrength(getStrength()-1);
       animal.setHungerLevel(getHungerLevel()-1);
     
       
        }}
    
}
