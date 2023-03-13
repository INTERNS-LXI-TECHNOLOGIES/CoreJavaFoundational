package com.lxisoft.launch;
import com.lxisoft.animal.*;
import com.mysql.cj.xdevapi.Statement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;
import java.util.function.ToIntFunction;
import java.lang.Thread.State;
import java.sql.Connection;

public class Test{
  
    public static void main(String[] args){
                         
      Forest forest = new Forest();
      System.out.println("welcome to the Forest - Amazon" + '\n'+ "prestented animals" + '\n' + "================");
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
       