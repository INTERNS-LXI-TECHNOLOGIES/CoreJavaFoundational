package com.lxisoft.launch;
import com.lxisoft.animal.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test{
  
    public static void main(String[] args){

      try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("kkk");
        writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
                                      
      Forest forest = new Forest();
    
      forest.animalDetails();
       forest.showDetails();
      for(int y =1; y<6; y++){
      System.out.println("======================="+'\n'+ "Round -> " + y +'\n' + "==========================");
      forest.animalFight();
      }
      System.out.println("======================="+'\n'+"current position"+'\n');
      forest.showDetails();
       System.out.println("========================");
      forest.findWinner();
       }
     } 
       