import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class Test{
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList();

        animals.add(new Animal("lion", 10));
        animals.add(new Animal("tiger", 8));
        animals.add(new Animal("fox", 4));
        animals.add(new Animal("cheetah", 6));

        
      int random1 = (int)(Math.random()*4);
      int random2 = (int)(Math.random()*4);
      if (random1 == random2){
        random1 =  random1 + 1;
      }

        else{
          animals.get(random1).modStrength();
          animals.get(random2).modStrength();
        }
  
        
         for(int i = 0; i<animals.size(); i++){
          
          
          if (animals.get(i).getStrength() < animals.get(0).getStrength()){
            System.out.println(animals.get(i));
          }
         }
        
        } 
    }
