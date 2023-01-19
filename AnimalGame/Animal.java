import java.util.ArrayList;
import java.util.Random;

public class Animal {
    
    String name;
    int strength;


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
    public void setStrength(int strength){

    }
    public int modStrength(int strength){
        return strength/2;
    }

}
