import java.util.ArrayList;
import java.util.Random;

public class Test{
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList();

        animals.add(new Animal("lion", 10));
        animals.add(new Animal("tiger", 8));
        animals.add(new Animal("fox", 5));
        animals.add(new Animal("cheetah", 7));

      

    
      int random1 = (int)(Math.random()*4);
      int random2 = (int)(Math.random()*4);
      animals.get(random1).modStrength(8);
    
      
      

    
      if (random1 == random2){
      random1 =  random1 + 1;}

     
       

    
        
        } 
    }
