package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

import javax.xml.catalog.CatalogFeatures.Feature;


public class Forest {
     TreeSet<Animal> animals = new TreeSet<Animal>();
   
  
//animal details 
    public void animalDetails(){
      System.out.println("welcome to the Forest - Amazon" + '\n'+ "prestented animals" + '\n' + "================");
        
        animals.add(new Lion("lion", 9,10,6, new Location(4,9)));
        animals.add(new Deer("Deer", 6, 5,9, new Location(7,10)));
        animals.add(new Giraffe("Giraffe", 5, 4, 10,new Location(5, 6)));
        animals.add(new Cheetah("Cheetah",7,7,8, new Location(5,8)));
        animals.add(new Elephant("elphant",9,6,6, new Location(6,2)));
        animals.add(new Tiger("Tiger", 8 ,7 ,3,new Location(4,6)));
        animals.add(new Fox("Fox", 3,5,8, new Location(4,1)));
      
    }
       public void showDetails(){
        for (Animal n:animals){
          System.out.println(n);
        
    
       }
      }
    public void animalFight(){
      
      
      Animal nearestAnimal = animals.first();  
      Random ran1 = new Random();
      int random1 = ran1.nextInt(4);
      Animal firstAnimal = animals.first();

      double distance1 = 1000;
   
      for(Animal t: animals){ 
        if (t== firstAnimal) {
          System.out.println();
        }
          else{
      double square = Math.pow((t.getLocation().getLocationx()-firstAnimal.getLocation().getLocationx()), 2);

      double square2 = Math.pow((t.getLocation().getLocationy()-firstAnimal.getLocation().getLocationy() ) , 2);
      

      double distance2 = Math.sqrt((square2+square));

      if( distance2 < distance1 ){
        nearestAnimal = t;
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
            try{((Carnivores)firstAnimal).fight(nearestAnimal);}
            catch(LuckFactorException e){
              e.printStackTrace();
            }
            if(((Herbivores)nearestAnimal).escapeFromEnemy() == false){
              System.out.println(firstAnimal.getName()+ " strength decresed to "+ firstAnimal.getStrength()  + 
              " hungerlevel decresed to "+ firstAnimal.getHungerLevel());
             System.out.println(nearestAnimal.getName()
             +" strength decresed to "+ nearestAnimal.getStrength() + " hungerlevel decresed to " + nearestAnimal.getHungerLevel());
            }

           
             
             roamAnimal();
    }
                          
         
          else{
            try{
            ((Carnivores)firstAnimal).fight(nearestAnimal);}
            catch(LuckFactorException e){}
            System.out.println(firstAnimal.getName()+ " strength decresed to "+ firstAnimal.getStrength()  + 
           " hungerlevel decresed to "+ firstAnimal.getHungerLevel());
          System.out.println(nearestAnimal.getName()
          +" strength decresed to "+ nearestAnimal.getStrength() + " hungerlevel decresed to " + nearestAnimal.getHungerLevel());
          roamAnimal();
          }


         }
         
        

         public void roamAnimal(){
          
          Random ran = new Random();
        
         
            for(Animal f:animals){
              f.setLocation(new Location(ran.nextInt(10), ran.nextInt(10)));
            }
            System.out.println("current locations:");
            for(Animal f:animals){
              f.locationData();
            }
           
        }
     
     public void findWinner(){
          TreeSet<Animal> animals2 = new TreeSet<Animal>();
      
           for(Animal y: animals){
            animals2.add(y);
           }
           Animal winner = animals2.last();
           
         System.out.println(winner);
  

                // System.out.println("equal Animals"+'\n'+ "==============================");

                // for(int p=0; p<animals.size()-1; p++){
                //   for(int j=p+1;j<animals.size(); j++ ){
  
                //    if( animals.get(p).equals(animals.get(j))){
                //     System.out.println(animals.get(p).getName()+ " ====== "+ animals.get(j).getName());
              
                //   }
                      
               // }
                    
                }

              }
            