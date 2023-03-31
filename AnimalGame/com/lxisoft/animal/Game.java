package com.lxisoft.animal;

import java.util.Scanner;

public class Game {
    
    public void startGame(){
        Forest forest = new Forest();
        System.out.println("welcome to the Forest - Amazon" + '\n'+ "prestented animals" + '\n' + "================");
        forest.animalDetails();
        forest.showDetails();
        // getting input from the user
        System.out.println("Please choose a level: easy(3), medium(5), hard(7)");
          Scanner scanner = new Scanner(System.in);
          
          int userLevel =  scanner.nextInt() ;
        if (userLevel == Level.easy.level){
          userLevel= Level.easy.level;
        }
       else if (userLevel == Level.medium.level){
          userLevel= Level.medium.level;
        }
        else if (userLevel == Level.hard.level){
          userLevel= Level.hard.level;
        }
        
  
        for(int y =1; y<userLevel; y++){
        System.out.println("======================="+'\n'+"Round -> "+ y +'\n'+"==========================");
        forest.animalFight();
        }
        System.out.println("======================="+'\n'+"current position"+'\n');
        forest.showDetails();
        System.out.println("========================");
        forest.findWinner();
     
         }
    }
