package com.lxisoft.launch;
import com.lxisoft.animal.*;
import java.util.*;

public class Test{
    public static void main(String[] args){
                                      
      Forest forest = new Forest();
    
      forest.animalDetails();
      forest.showDetails();
      System.out.println("======================="+'\n'+"1st round"+'\n' + "==========================");
      forest.animalFight();
      forest.roamAnimal();
      System.out.println("======================="+'\n'+"2nd round"+'\n' + "==========================");
      forest.animalFight();
      forest.roamAnimal();
      System.out.println("======================="+'\n'+"3rd round"+'\n' + "==========================");
      forest.animalFight();
      forest.roamAnimal();
      System.out.println("======================="+'\n'+"current position");
      forest.showDetails(); System.out.println("========================");
      forest.findWinner();

       }
     } 
       