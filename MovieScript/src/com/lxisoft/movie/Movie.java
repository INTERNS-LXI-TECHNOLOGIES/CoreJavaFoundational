package com.lxisoft.movie;
import com.lxisoft.actors.*;
import com.lxisoft.director.*;
import java.io.IOException;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Movie{
  private String movieName;
    ArrayList<Actor>actors= new ArrayList<Actor>();
  public void setMovieName(String movieName){
    this.movieName=movieName;
  }
  public String getMovieName(){
    return movieName;
  }
  Director director=new Director();
  ScriptWriter writer=new ScriptWriter();
  Scanner sc= new Scanner(System.in);
  public  void startMovie() {
    System.out.println("ENTER MOVIE NAME ");
    setMovieName(sc.next());
    System.out.println("ENTER NUMBER OF HEROES");
  int numOfHeroes=sc.nextInt();//  a.setNumOfActors(sc.nextInt());
    for(int i=0;i<numOfHeroes;i++){
      System.out.println("ENTER THE NAME OF HERO ");
      String actorName=sc.next();


      System.out.println("ENTER THE CHARACTER NAME : ");
      String charName=sc.next();
      actors.add(new Hero(actorName,charName));
    }
    /*  for(Actor a : actors){
        if(a instanceof Hero){
          cast.put("hero",actors);
        }
      }*/

    System.out.println("ENTER NUMBER OF HEROINES");
    int numOfHeroines=sc.nextInt();
    for(int i=0;i<numOfHeroines;i++){
      System.out.println("ENTER THE NAME OF HEROINE ");
      String actorName=sc.next();



      System.out.println("ENTER THE CHARACTER NAME OF : ");
      String charName=sc.next();
        actors.add(new Heroine(actorName,charName));
      }
        /*for(Actor a : actors){
          if(a instanceof Heroine){
            cast.put("heroine",actors);
          }
        }*/

    System.out.println("ENTER NUMBER OF COMEDIANS");
    int numOfComedians=sc.nextInt();
    for(int i=0;i<numOfComedians;i++){
      System.out.println("ENTER THE NAME OF COMEDIAN ");
      String actorName=sc.next();

      System.out.println("ENTER THE CHARACTER NAME OF : ");
      String charName=sc.next();
      actors.add(new Comedian(actorName,charName));
    }
    /*  for(Actor a : actors){
        if(a instanceof Comedian){
          cast.put("comedian",actors);
        }
      }
*/

    System.out.println("ENTER NUMBER OF VILLAINS");
    int numOfVillains=sc.nextInt();
    for(int i=0;i<numOfVillains;i++){
      System.out.println("ENTER THE NAME OF VILLAIN ");
      String actorName=sc.next();



      System.out.println("ENTER THE CHARACTER NAME : ");
      String charName=sc.next();
      actors.add(new Villain(actorName,charName));
    }
  /*    for(Actor a : actors){
        if(a instanceof Hero){
          cast.put("villain",actors);
        }
      }

  */  /*  for(Map.Entry m : cast.entrySet()){
        if(cast.containsKey("hero")){

            System.out.println(m.getValue());

        }
      }*/
      System.out.println("ACTORS\n");
      for(int i=0;i<actors.size();i++){
        System.out.println("ACTOR NAME  "+actors.get(i).getActorName()+" : CHARACTER NAME  "+actors.get(i).getCharName());
      }

    director.castActors(actors);
try{
    writer.writeScript();
  }
  catch(IOException e){
  e.printStackTrace();
  }
  }






  }
