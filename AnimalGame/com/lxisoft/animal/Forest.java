package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;


public class Forest {
    ArrayList<Animal> animals = new ArrayList<Animal>();
  
//animal details
    public void animalDetails(){
        animals.add(new Animal("lion", 10,10));
        animals.add(new Animal("tiger", 8, 8));
        animals.add(new Animal("fox", 4, 6));
        animals.add(new Animal("cheetah", 6, 10));
        animals.add(new Animal("wolf", 6, 8));
    }

    public void animalFight(){
    int random1 = (int)(Math.random()*6);
    int random2 = (int)(Math.random()*6);  
     
    if (random1 == random2){
        random1 =  random1 + 1;
      }
        for (int n=0; n<4; n++){
          animals.get(random1).modStrength();
          animals.get(random2).modStrength();
          animals.get(random1).modhungerLevel();
          animals.get(random2).modhungerLevel();  
            }  
       }

     public void findWinner(){

         for(int i = 0; i<4; i++){  
        
            if (animals.get(i).getStrength() >= animals.get(0).getStrength()){   
                    System.out.println(animals.get(i).toString());
                    
                    
           }
        }
    }
}

