package com.lxisoft.animal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DataBase implements Utility{

    private Connection Connection;
    
    public  DataBase(Connection connection){ try {
        

    
        this.Connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/animal", "root", "Nasih@123");
    
     } catch (Exception e) {
        e.printStackTrace();
    }
     

}
    public TreeSet<Animal> Read() {
       
          TreeSet<Animal> animals= new TreeSet<Animal>();
        try{
            Connection conn = this.Connection;
    
            java.sql.Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from animals");
        
            while (resultSet.next()){
         
                   
               String name = resultSet.getString(1);
               
               int strength = resultSet.getInt(2);
               int hungerLevel=resultSet.getInt(3);
               int vision= resultSet.getInt(4);
               int locationx = resultSet.getInt(5);
               int locationy = resultSet.getInt(6);
              
               if("lion".equals(name)){
                animals.add(new Lion(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
            }
                else  if("deer".compareTo(name)==0){
                animals.add(new Deer(name, strength, hungerLevel, vision, new Location(locationx, locationy)));
            }
             else if("tiger".compareTo(name)==0){
             animals.add( new Tiger(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
             }
            else if("fox".compareTo(name)==0){
                 animals.add( new Fox(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
            }
    
            else if("giraffe".compareTo(name)==0){
            animals.add( new Giraffe(name,strength,hungerLevel,vision, new Location(locationx,locationy)));
            }
            else if ("cheetah".equals(name)){
                animals.add( new Cheetah(name, strength, hungerLevel, vision, new Location(locationx, locationy)));
            }
        
               }
            
               animals.addAll(animals);
    
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return animals;

    }    
  
public void Write(Set<Animal> animals){
   
    try{
        Connection conn = this.Connection;

       java.sql.Statement statement = conn.createStatement();

        
        String query2 ="TRUNCATE TABLE result";
        statement.executeUpdate(query2);
        
      
        String query1 = "INSERT INTO result VALUES (?,?,?,?)";
        PreparedStatement stmt =conn.prepareStatement(query1);
        int g = 1;
        for(Animal hh:animals){
           
            stmt.setInt(1, g++ );
            stmt.setString(2, hh.getName());
            stmt.setInt(3,(int) hh.getStrength());
            stmt.setInt(4, (int) hh.getHungerLevel());
        

          //  stmt.setInt(4, hh.getVision());

          stmt.execute();
        }
      

    
     // connection.close();
        
    } catch (SQLException e) {
    // TODO: handle exceptione
    e.printStackTrace();
  }
  
 }
}