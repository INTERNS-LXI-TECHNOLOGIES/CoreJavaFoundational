package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;


public class Forest {
    ArrayList<Animal> animals = new ArrayList<Animal>();
  
//animal details
    public void animalDetails(){
        animals.add(new Animal("lion", 9,9,6,2,1));
        animals.add(new Animal("tiger", 8, 8,5,1,2));
        animals.add(new Animal("fox", 4, 6,4,2,1));
        animals.add(new Animal("cheetah", 6, 9,8,2,1));
        animals.add(new Animal("wolf", 6, 7,5,1,2));
    }

    public void animalFight(){
    int random1 = (int)(Math.random()*5);
    int random2 = (int)(Math.random()*5);  
     
    if (random1 == random2){
        random1 =  random1 + 1;
      }
        int tt = animals.get(random1).getVision() + animals.get(random2).getVision();
      if ( tt >4){
        for (int h = 0; h<4; h++){
          animals.get(random1).modStrength();
          animals.get(random2).modStrength();
          animals.get(random1).modStrength();
          animals.get(random2).modStrength();
          animals.get(random1).modHungerLevel();
          animals.get(random2).modHungerLevel();  
          }
        }
       }

     public void findWinner(){
           Animal largestStrength = animals.get(0);
           Animal largestHl = animals.get(0);


         for(int i = 0; i<animals.size(); i++){  
        
            if (animals.get(i).getStrength() > largestStrength.getStrength() &&
             animals.get(i).getHungerLevel() > largestHl.getHungerLevel()){   
               largestStrength =  animals.get(i);      
               }
           }
              System.out.println(largestStrength);
            
  }
  
}
