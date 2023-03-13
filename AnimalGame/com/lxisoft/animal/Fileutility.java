package com.lxisoft.animal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.management.loading.PrivateMLet;

public class FileUtility implements Utility{
    
    
    private TreeSet<Animal> Read(){
        TreeSet <Animal> animals = new TreeSet< Animal>();

    try{
        BufferedReader reader = new BufferedReader(new FileReader("animals.txt"));
        String data[];
        //ArrayList<Animal> animalList = new ArrayList<Animal>();
        String line = "";
        while((line = reader.readLine()) != null){
        data = line.split(",");

        if ("lion".compareTo(data[0]) == 0){
          animals.add(new Lion(data[0], Integer.parseInt( data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]),
           new Location(Integer.parseInt(data[4]),Integer.parseInt(data[5]))));
        }
        else if ("deer".compareTo(data[0]) == 0){
          animals.add(new Deer(data[0], Integer.parseInt( data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]),
           new Location(Integer.parseInt(data[4]),Integer.parseInt(data[5]))));
        }
        else if("tiger".compareTo(data[0])==0){
          animals.add(new Tiger(data[0],Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]),
           new Location(Integer.parseInt(data[4]) , Integer.parseInt(data[5]))));

        }
        else if("giraffe".compareTo(data[0])==0){
          animals.add(new Giraffe(data[0],Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]),
           new Location(Integer.parseInt(data[4]) , Integer.parseInt(data[5]))));
        }
        else if("fox".compareTo(data[0])==0){
          animals.add(new Fox(data[0],Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]),
           new Location(Integer.parseInt(data[4]) , Integer.parseInt(data[5]))));
        }
      
    }
  
    reader.close();

  }
   catch (IOException yy) {
          yy.printStackTrace();
          // TODO: exception
  }
    return animals;



}
@Override 
public void Write(Set<Animal> animals){
  ArrayList<String> names = new ArrayList<String>();
  for(Animal hh: animals){
 names.add(hh.toString());

 }
 try {
 BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
 writer.write("Results after the fights "+'\n'+"=========================");
  for(String an:names){

 writer.write('\n'+an);

  }
  
  TreeSet<Animal> animals3 = new TreeSet<Animal>();
    
         for(Animal y: animals){
          animals3.add(y);
         }
        Animal winner = animals3.last();
         
  writer.write('\n'+"===================="+'\n'+ "The winner is "+ winner.toString());
 writer.close();
} catch (Exception e) {
 // TODO: handle exception
}
  
}
}


