package com.lxisoft.animal;
import java.util.ArrayList;
import java.util.Random;


public class Forest {
     ArrayList<Animal> animals = new ArrayList<Animal>();
  
//animal details
    public void animalDetails(){
        System.out.println("welcome to the Forest - Amazon" + '\n'+ "prestented animals" + '\n' + "================");
        
        
        animals.add(new Animal("lion", 8,10,6, new Location(4,9)));
        animals.add(new Animal("tiger", 8, 7,9, new Location(7,10)));
        animals.add(new Animal("fox", 4, 6,7, new Location(8, 5)));
        animals.add(new Animal("cheetah", 6, 9,8,new Location(9,7)));
        animals.add(new Animal("wolf", 6, 6,5, new Location(10,8)));
  } 
       public void showDetails(){
        for (int n=0; n<animals.size(); n++){
          animals.get(n).anmialData();
       }
      }
    public void animalFight(){
      
      Animal nearestAnimal = animals.get(0);
      Random ran1 = new Random();
      int random1 = ran1.nextInt(5);
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

          animals.get(random1).modStrength();
          nearestAnimal.modStrength();
          animals.get(random1).modHungerLevel();
          nearestAnimal.modHungerLevel();  

          System.out.println(animals.get(random1).getName()+ " strength decresed to "+ animals.get(random1).getStrength()  + 
           " hungerlevel decresed to "+ animals.get(random1).getHungerLevel());
          System.out.println(nearestAnimal.getName()
          +" strength decresed to "+ nearestAnimal.getStrength() + " hungerlevel decresed to " + nearestAnimal.getHungerLevel());
        }

         public void roamAnimal(){
          Random ran = new Random();
          int random =  ran.nextInt(10);
          int random2 =  ran.nextInt(10);
          int random3 =  ran.nextInt(10);
          int random4 =  ran.nextInt(10);
          int random5 = ran.nextInt(10);
            animals.get(0).setLocation(new Location(random, random5));
            animals.get(1).setLocation(new Location(random3, random));
            animals.get(2).setLocation(new Location(random, random2));
            animals.get(3).setLocation(new Location(random2, random3));
            animals.get(4).setLocation(new Location(random5, random4)); 
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

