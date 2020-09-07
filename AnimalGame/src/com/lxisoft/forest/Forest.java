package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Forest{

    //Animal animals=new Animal();
    public ArrayList<Animal> animalList = new ArrayList<Animal>();
   // Animal animal=new Animal();
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();
    int choice=1;
    Animal winner;
    Animal temp;
    int count;
    int input;
   
    private int randomNumber;
    public void setRandomNumber(int a){
        this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }

    private int randomItem;
    public void setRandomItem(int a){
        this.randomItem=a;
    }
    public int getRandomItem(){
        return randomItem;
    }

   


    public void printDetails(){
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                    ANIMAL GAME                                       *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");

        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");

        System.out.println("                                WELCOME TO THE GAME                                              ");
        System.out.println("                                                                                                 ");


                    
    }




    public void forestDetails(){

        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
       
        System.out.println("                                 PARTICIPANTS OF GAME ARE                                       ");  
              
        animalList.add(new Deer());
        animalList.get(0).setAnimalName("Deer");
        animalList.get(0).setAnimalStrength(20);
        animalList.get(0).setAnimalAlive(true);
        animalList.get(0).setDistance(10);




        animalList.add(new Lion());
        animalList.get(1).setAnimalName("Lion");
        animalList.get(1).setAnimalStrength(100);
        animalList.get(1).setAnimalAlive(true);
         animalList.get(1).setDistance(15);

        animalList.add(new Rabbit());
        animalList.get(2).setAnimalName("Rabbit");
        animalList.get(2).setAnimalStrength(10);
        animalList.get(2).setAnimalAlive(true);
         animalList.get(2).setDistance(12);

        animalList.add(new Tiger());
        animalList.get(3).setAnimalName("Tiger");    
        animalList.get(3).setAnimalStrength(90);
        animalList.get(3).setAnimalAlive(true);
         animalList.get(3).setDistance(17);

        animalList.add(new Goat());
        animalList.get(4).setAnimalName("Goat");    
        animalList.get(4).setAnimalStrength(30);
        animalList.get(4).setAnimalAlive(true);
         animalList.get(4).setDistance(5);



        animalList.add(new Heyna());
        animalList.get(5).setAnimalName("Heyna");    
        animalList.get(5).setAnimalStrength(40);
        animalList.get(5).setAnimalAlive(true);
         animalList.get(5).setDistance(11);


        animalList.add(new Bear());
        animalList.get(6).setAnimalName("Bear");    
        animalList.get(6).setAnimalStrength(60);
        animalList.get(6).setAnimalAlive(true);
         animalList.get(6).setDistance(7);


        animalList.add(new Cheetha());
        animalList.get(7).setAnimalName("Cheetha");    
        animalList.get(7).setAnimalStrength(85);
        animalList.get(7).setAnimalAlive(true);
         animalList.get(7).setDistance(13);

        animalList.add(new Fox());
        animalList.get(8).setAnimalName("Fox");    
        animalList.get(8).setAnimalStrength(45);
        animalList.get(8).setAnimalAlive(true);
         animalList.get(8).setDistance(8);


        animalList.add(new Racoon());
        animalList.get(9).setAnimalName("Racoon");    
        animalList.get(9).setAnimalStrength(35);
        animalList.get(9).setAnimalAlive(true);
         animalList.get(9).setDistance(14);


        for(int i=0;i<animalList.size();i++){


        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println(" \n                                              "+animalList.get(i).getAnimalName()+"           ");
    }

         System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");

       
          
    }



    public void randomSelection(){


        System.out.println("PRESS 1 TO START THE GAME");
         int choice=scanner.nextInt();
         
        if(choice==1){
            count=this.workingOfLoop();

            while(count>1){
                count=this.workingOfLoop();
                setRandomNumber(random.nextInt(10));
                setRandomItem(random.nextInt(10));
                //System.out.println(getRandomNumber());
                //System.out.println(getRandomItem());
                if(getRandomNumber()==getRandomItem()){
                   setRandomItem(random.nextInt(inputToChangeRandom()));//
                    System.out.println("NEW RANDOM ITEM=    "+getRandomItem());
                    this.checkFight();
                  
                   
                   
                }
              



           
                else//(animalList.get(getRandomNumber())!=animalList.get(getRandomItem()))
                {
                    if(animalList.get(getRandomNumber()).getAnimalAlive() == true && animalList.get(getRandomItem()).getAnimalAlive() == true){
                        if(checkArea()==true){
                            this.checkFight();
                        }
                        else{
                            System.out.println("******************** DIFFERENT AREA");
                        }
                    }
                }
            }
            this.ultimateWinner();

        }    
    }

        public void checkFight(){
              if(animalList.get(getRandomNumber()).getAnimalAlive() == true && animalList.get(getRandomItem()).getAnimalAlive() == true){


                if(animalList.get(getRandomNumber()) instanceof Carnivoros && animalList.get(getRandomItem()) instanceof Carnivoros){
                System.out.println("BOTH ARE CARNIVOROS");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());

                if(animalList.get(getRandomNumber()).getAnimalStrength() >= animalList.get(getRandomItem()).getAnimalStrength()){
                    System.out.println("\n \nWINNER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                    animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()-20);
                    System.out.println(" \n NEW  STRENGTH     "+animalList.get(getRandomNumber()).getAnimalStrength());
                    System.out.println(" \n  LOOSER  "+animalList.get(getRandomItem()).getAnimalName());
                    System.out.println("**************************************");

                    animalList.get(getRandomItem()).setAnimalAlive(false);
                   
                    count=this.workingOfLoop();
                    this.Winner();
                }

                else{

                    System.out.println("\n \n WINNER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                    animalList.get(randomItem).setAnimalStrength(animalList.get(getRandomItem()).getAnimalStrength()-20);
                    System.out.println(" \n NEW  STRENGTH     "+animalList.get(getRandomItem()).getAnimalStrength());
                    System.out.println(" \n  LOOSER IS PLAYER1 "+animalList.get(getRandomNumber()).getAnimalName());
                    System.out.println("**************************************");
                    animalList.get(getRandomNumber()).setAnimalAlive(false);
                   
                      count=this.workingOfLoop();
                       this.Winner();

                }
                
                     
                       
                       

             }

             else  if(animalList.get(getRandomNumber()) instanceof Herbivoros && animalList.get(getRandomItem()) instanceof Herbivoros){

                System.out.println("BOTH ARE HERBIVOROS");

                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());


                System.out.println("\n DONT FIGHT");
                  System.out.println("**************************************");
                
                   count=this.workingOfLoop();
                   this.Winner();
             } 

             // *** LUCKFACTOR IMPLEMENTATION SETUP STARTS *** //

             else  if(animalList.get(getRandomNumber()) instanceof Carnivoros && animalList.get(getRandomItem()) instanceof Herbivoros){

                int luckyAnimal=determineLuckyAnimal();
                System.out.println(luckyAnimal);


                System.out.println("PLAYER 1 - CARNIVOROS");
                System.out.println("\nPLAYER 2 -HERBIVOROS");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());

                if(animalList.get(getRandomItem()) instanceof WeakAnimal){//luckFactor implementation
                    //if(luckyAnimal!=1)
                    //{

                        System.out.println("\n "+animalList.get(getRandomNumber()).getAnimalName()+"  cant hunt the"+animalList.get(getRandomItem()).getAnimalName());
                        System.out.println("\n "+animalList.get(getRandomItem()).getAnimalName()+" runs away");
                        animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()-20);
                        System.out.println( "\n NEW STRENGTH OF"+animalList.get(getRandomNumber()).getAnimalName()+"    "+animalList.get(getRandomNumber()).getAnimalStrength());
                          this.Winner();







                }
                    else{

                         System.out.println("\n WINNER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                            animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()+20);
                            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animalList.get(getRandomNumber()).getAnimalStrength());
                            System.out.println("\n LOOSER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                              System.out.println("**************************************");
                            animalList.get(getRandomItem()).setAnimalAlive(false);
                           
                              count=this.workingOfLoop();
                                this.Winner();
                        
                        }




             }  

             else if(animalList.get(getRandomNumber()) instanceof Herbivoros && animalList.get(getRandomItem()) instanceof Carnivoros){

               

              

                System.out.println("PLAYER 1 -HERBIVOROS");
                System.out.println("\nPLAYER 2 -CARNIVOROS");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());

                 
                    



                        System.out.println("\n WINNER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                        animalList.get(randomItem).setAnimalStrength(animalList.get(getRandomItem()).getAnimalStrength()+20);
                        System.out.println("\n WINNER S NEW STRENGTH"+"    "+animalList.get(getRandomItem()).getAnimalStrength());
                        System.out.println("\n LOOSER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                        animalList.get(getRandomNumber()).setAnimalAlive(false);
                        System.out.println("**************************************");
                     
                          count=this.workingOfLoop();
                          this.Winner();

                    
                    
            }


        }      
        
    }//checkfight

   

    private int workingOfLoop(){
         count=0;
        for(int i=0;i<animalList.size();i++){
           
            if(animalList.get(i).getAnimalAlive()==true){
            count++;
            // System.out.println("    "+count);
            
            }
              
        }
        return count;

    }

    public void ultimateWinner()
    {
        System.out.println("\n\n *** THE ULTIMATE WINNER LIST ***");
        System.out.println("    *************************");
             for(int i=0;i<animalList.size();i++)
            {
                if(animalList.get(i).getAnimalAlive()==true)
                {
                    System.out.println("\n\n");
                    System.out.println("=> THE ULTIMATE WINNER IS    " + animalList.get(i).getAnimalName());
                    System.out.println("\n \n");
                }
            }
    }

      public void Winner()
    {
        System.out.println("\n\n *** THE  WINNER LIST ***");
        System.out.println("    *********************");
             for(int i=0;i<animalList.size();i++)
            {
                if(animalList.get(i).getAnimalAlive()==true)
                {
                    System.out.println("\n\n");
                    System.out.println("=> THE  WINNER IS    " + animalList.get(i).getAnimalName());
                    System.out.println("\n \n");
                }
            }
    }

     private int inputToChangeRandom()
    {

            input=0;        
             for(int i=0;i<animalList.size();i++)
            {
                if(animalList.get(i).getAnimalAlive()==true)
                {
                   input++;
                }
            }
        return input;
    }

    private int determineLuckyAnimal(){
        Random random=new Random();
        int randomLuckyAnimal=random.nextInt(1);
        return randomLuckyAnimal;

    }

    public boolean checkArea()
    {
        int aX,aY,aX2,aY2;
        aX= 10 + (int) (Math.random()*50);
        aY= 10 + (int) (Math.random()*50);
        aX2= 10 + (int) (Math.random()*50);
        aY2= 10 + (int) (Math.random()*50);

        System.out.println("\t DISTANCE DETAILS ");
        System.out.println("   **************************");

        System.out.println("\n"+animalList.get(randomNumber).getAnimalName() +"=> \t( "+aX+", " +aY+")" + 
            "\t DISTANCE =  " +animalList.get(randomNumber).getDistance());
       System.out.println("\n"+animalList.get(randomItem).getAnimalName()+" => \t( "+aX+", " +aY+")" + 
        "\t DISTANCE =  " +animalList.get(randomItem).getDistance());

        int distanceCalculation = (int) (Math.sqrt(((aX - aX2)*(aX - aX2))+((aY - aY2)*(aY - aY2))));
        int radius = ((animalList.get(randomNumber).getDistance())+(animalList.get(randomItem).getDistance()));
        if(distanceCalculation<= radius)
        {

            System.out.println("\n\t\t=> "+animalList.get(randomNumber).getAnimalName() + " AND " +  animalList.get(randomItem).getAnimalName() +
             "  CAN FIGHT \n");
             return true;

           
        }
        
        else
        {
            if(((animalList.get(randomNumber)) instanceof Herbivoros) && ((animalList.get(randomItem)) instanceof Herbivoros))
            
                // System.out.println("\n\t\t=> "+" Both Are Herbivorus => No Fight Happens");
            
            //System.out.println("\n\t\t=> "+animals.get(r1).getAnimalName() + " AND " +  animals.get(r2).getAnimalName() + " are in DIFFERENT TERRITORY \n\t\t=> No FIGHT TAKES PLACE");
            System.out.println("DIFFERENT TERRITORY");
             return false; 

        }
        
   
            
     

    }


}




           