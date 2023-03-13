package com.lxisoft.animal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class DataBase implements Utility{

    public TreeSet<Animal> Read() {
       
          TreeSet<Animal> animals= new TreeSet<Animal>();
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal", "root", "Nasih@123");
    
            java.sql.Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from animals");
             
          
    
            while (resultSet.next()){
                
                
               String name = resultSet.getString(1);
               int strength = resultSet.getInt(2);
               int hungerLevel=resultSet.getInt(3);
               int vision= resultSet.getInt(4);
               int locationx = resultSet.getInt(5);
               int locationy = resultSet.getInt(6);
              
               animals.add( new Lion(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
               animals.add( new Tiger(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
               animals.add( new Deer(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
               animals.add( new Fox(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
               animals.add( new Giraffe(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
               //System.out.println(animals);
               }
            
               animals.addAll(animals);
    
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return animals;

    }    
  
public void Write(Set<Animal> animals){
    // try{
    //     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/animal", "root", "Nasih@123");

    //     java.sql.Statement statement = connection.createStatement();
    // }
}}