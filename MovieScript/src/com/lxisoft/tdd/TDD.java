package com.lxisoft.tdd;

import com.lxisoft.movie.*;
import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.sleep.*;

//Script,Dialogue,Scenes
public class TDD
{
public static void main(String[] args)
{

SleepStatement sl=new SleepStatement();

{
System.out.println("******************************************************************************************************");	
System.out.println("******************************************************************************************************");	
System.out.println("******************************************************************************************************");	
System.out.println("******************************************************************************************************");	
System.out.println("------------------------------------------MOVIE-SCRIPT------------------------------------------------");
System.out.println("******************************************************************************************************");	
System.out.println("******************************************************************************************************");
System.out.println("******************************************************************************************************");	
System.out.println("******************************************************************************************************");		
} 

                   sl.sleepThread();

Movie movie=new Movie();
movie.inputInitialDetails();

 
                      sl.sleepThread();


movie.printInitialDetails();
                     


                       sl.sleepThread();



        System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
                    
                     sl.sleepThread();

        System.out.println("/////////////////------------------------------THE END---------------------------/////////////////////");
                    
                    sl.sleepThread();

        System.out.println("******************************************************************************************************");	
        System.out.println("******************************************************************************************************");
  }


}

