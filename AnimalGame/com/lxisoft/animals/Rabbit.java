package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;
import java.util.*;
import java.*;
import com.lxisoft.*;

public class Rabbit extends Animal implements Herbivores {

      

       public Rabbit(String animalName,int starvage,int strength,int distance ,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
             
       }
       private int luckFactor;

      
        
                                               //luckFactor
       public int getLuckFactor()
       {
              Random rand = new Random();
              luckFactor=rand.nextInt(10);
              return luckFactor;
       }
       
    //   int x = rand.nextInt(20);
      // int y = rand.nextInt(20);
      void eatFood(Animal player1,Animal player2){
       if(player1 instanceof Herbivores || player2 instanceof Herbivores){
              System.out.println("The Player is eating Grass............!");
       }
       else{
              System.out.println("player nothing eats at now");
       }
}

}
