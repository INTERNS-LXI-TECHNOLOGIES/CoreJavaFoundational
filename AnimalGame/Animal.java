import java.util.ArrayList;
import java.util.Random;

public class Animal {
    
    String name;
    int strength;

    public Animal(){

    }

    public Animal(String name, int strength){
        this.name = name;
        this.strength = strength;

    }
    //getters and setters
    public String getName (){
     return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(double strength){
    }

    public void modStrength(){
    this.strength = this.strength/2;
    }

    public void highstrength(){
     
    }

}
