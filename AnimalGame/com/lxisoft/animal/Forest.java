package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.catalog.CatalogFeatures.Feature;

import com.lxisoft.launch.Elephant;


public class Forest {
     ArrayList<Animal> animals = new ArrayList<Animal>();
  
//animal details 
    public void animalDetails(){
      System.out.println("welcome to the Forest - Amazon" + '\n'+ "prestented animals" + '\n' + "================");
        
        animals.add(new Lion("lion", 9,10,6, new Location(4,9)));
        animals.add(new Deer("Deer", 6, 5,9, new Location(7,10)));
        animals.add(new Tiger("Tiger", 8 ,7 ,3,new Location(4,6)));
        animals.add(new Fox("Fox", 3,5,8, new Location(4,1)));
        animals.add(new Giraffe("Giraffe", 5, 4, 10,new Location(5, 6)));
        animals.add(new Cheetah("Cheetah",7,7,8, new Location(5,8)));
        animals.add(new Elephant("elphant",9,6,6, new Location(6,2)));


    }
       public void showDetails(){
        for (int n=0; n<animals.size(); n++){
          animals.get(n).anmialData();
        
       }
      }
    public void animalFight(){
      
      Animal nearestAnimal = animals.get(0);
      Random ran1 = new Random();
      int random1 = ran1.nextInt(6);
      Animal firstAnimal = animals.get(random1);

      double distance1 = 1000;
   
      for(int t = 0; t<animals.size(); t++){ 
        if (animals.get(t) == firstAnimal) {
          System.out.println();
        }
          else{
      double square = Math.pow((animals.get(t).getLocation().getLocationx()-firstAnimal.getLocation().getLocationx()), 2);

      double square2 = Math.pow((animals.get(t).getLocation().getLocationy()-firstAnimal.getLocation().getLocationy() ) , 2);
      

      double distance2 = Math.sqrt((square2+square));

      if( distance2 < distance1 ){
        nearestAnimal = animals.get(t);
        distance1 = distance2;
      }}}
          
    
        System.out.println(firstAnimal.getName().toUpperCase()+ " meets " + nearestAnimal.getName().toUpperCase());
  
          if(firstAnimal instanceof Herbivores && nearestAnimal instanceof Herbivores){
            ((Herbivores)firstAnimal).herbiFight(nearestAnimal);
          System.out.println("both had a small fight");
          roamAnimal();
         }
         else if(firstAnimal instanceof Herbivores && nearestAnimal instanceof Carnivores){
          System.out.println(firstAnimal.getName()+ " escaped");
          roamAnimal();
         }


         else if(firstAnimal instanceof Carnivores && nearestAnimal instanceof Herbivores){
            ((Carnivores)firstAnimal).fight(nearestAnimal);
            if(((Herbivores)nearestAnimal).escapeFromEnemy() == false){
              System.out.println(firstAnimal.getName()+ " strength decresed to "+ firstAnimal.getStrength()  + 
              " hungerlevel decresed to "+ firstAnimal.getHungerLevel());
             System.out.println(nearestAnimal.getName()
             +" strength decresed to "+ nearestAnimal.getStrength() + " hungerlevel decresed to " + nearestAnimal.getHungerLevel());
            }

           
             
             roamAnimal();
    }
         
          else{
            ((Carnivores)firstAnimal).fight(nearestAnimal);
            System.out.println(firstAnimal.getName()+ " strength decresed to "+ firstAnimal.getStrength()  + 
           " hungerlevel decresed to "+ firstAnimal.getHungerLevel());
          System.out.println(nearestAnimal.getName()
          +" strength decresed to "+ nearestAnimal.getStrength() + " hungerlevel decresed to " + nearestAnimal.getHungerLevel());
          roamAnimal();
          }

    
         
         }
         
        

         public void roamAnimal(){
          Random ran = new Random();
          int random =  ran.nextInt(10);
          int random2 =  ran.nextInt(10);
          int random3 =  ran.nextInt(10);
          int random4 =  ran.nextInt(10);
          int random5 = ran.nextInt(10);
          int random6 =  ran.nextInt(10);
          int random7 = ran.nextInt(10);
            animals.get(0).setLocation(new Location(random, random5));
            animals.get(1).setLocation(new Location(random3, random));
            animals.get(2).setLocation(new Location(random6, random2));
            animals.get(3).setLocation(new Location(random2, random3));
            animals.get(4).setLocation(new Location(random5, random6));
            animals.get(5).setLocation(new Location(random2, random7));
            animals.get(6).setLocation(new Location(random4, random3));
            System.out.println("current locations:");
            for(int f=0; f<animals.size(); f++){
              animals.get(f).locationData();
            }
           
        }
     
     public void findWinner(){
           Animal largestStrength = animals.get(0);
           Animal largestHl = animals.get(0);


         for(int i = 0; i<animals.size(); i++){  
        
            if (animals.get(i).getStrength() > largestStrength.getStrength()){   
               largestStrength =  animals.get(i);       
               }
              
           }
              System.out.println(largestStrength.toString());
              
              
           
          } 
             
            
  }

