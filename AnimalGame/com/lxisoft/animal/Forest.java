package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;


public class Forest {
    public ArrayList<Animal> animals = new ArrayList<Animal>();
  
//animal details
    public void animalDetails(){

        animals.add(new Animal("lion", 8,10,6, new Location(4,9)));
        animals.add(new Animal("tiger", 8, 7,9, new Location(7,10)));
        animals.add(new Animal("fox", 4, 6,7, new Location(8, 5)));
        animals.add(new Animal("cheetah", 6, 9,8,new Location(9,7)));
        animals.add(new Animal("wolf", 6, 6,5, new Location(10,8)));
  }

    public void animalFight(){

      Animal nearestAnimal = animals.get(0);
      Random ran = new Random();
      int random1 = ran.nextInt(5);
      int random =  ran.nextInt(10);
      int random2 =  ran.nextInt(10);
      int random3 =  ran.nextInt(10);
      int random4 =  ran.nextInt(10);
      Animal firstAnimal = animals.get(random1);

      double distance1 = 1000;
   
      for(int t = 0; t<animals.size(); t++){  
    
      double square = Math.pow((firstAnimal.location.getLocationx() - animals.get(t).location.getLocationx()), 2);

      double animalSquare = Math.pow((firstAnimal.location.getLocationy() - animals.get(t).location.getLocationy()) , 2);


      double distance2 = Math.sqrt((animalSquare+square));

      if( distance2 < distance1 ){
        nearestAnimal = animals.get(t);
        distance1 = distance2;
      }
     }
         
          animals.get(random1).modStrength();
          nearestAnimal.modStrength();
          animals.get(random1).modHungerLevel();
          nearestAnimal.modHungerLevel();  
          for(int e=0; e<animals.size(); e++){
        //  System.out.println(animals.get(e).location.getLocationx()+" "+animals.get(e).location.getLocationy());
          }

         
            animals.get(0).setLocation(new Location(random, random1));
            animals.get(1).setLocation(new Location(random3, random));
            animals.get(2).setLocation(new Location(random, random2));
            animals.get(3).setLocation(new Location(random2, random3));
            animals.get(4).setLocation(new Location(random1, random4));
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
              System.out.println(largestStrength.toString());
          } 
             
            
  }

