package com.lxisoft.animal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

import javax.xml.catalog.CatalogFeatures.Feature;


public class Forest {
  TreeSet <Animal> animals = new TreeSet< Animal>();

     
  Utility fileutility = new FileUtility();
  Utility dataBase = new DataBase();
  
     
   
//animal details 
    public void animalDetails(){
     //animals = fileutility.Read();
    animals = dataBase.Read();
     
    }
    public void showDetails(){
     for(Animal n: animals){
      System.out.println(n);
     }
    }
    public void animalFight(){
      
      Random random1 = new Random();
       int counter1 =random1.nextInt(5);
       int counter =0;
      Animal nearestAnimal = animals.last();  
      Animal firstAnimal = animals.first();
   
      for(Animal nn:animals){
       
        if(counter == counter1){
          firstAnimal =nn;
        }
       
        counter++;
      }

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
           
         System.out.println("winner is "+winner);
        fileutility.Write(animals);


        
  

                // System.out.println("equal Animals"+'\n'+ "==============================");

                // for(int p=0; p<animals.size()-1; p++){
                //   for(int j=p+1;j<animals.size(); j++ ){
  
                //    if( animals.get(p).equals(animals.get(j))){
                //     System.out.println(animals.get(p).getName()+ " ====== "+ animals.get(j).getName());
              
                //   }
                      
               // }
                    
                }

              }
            