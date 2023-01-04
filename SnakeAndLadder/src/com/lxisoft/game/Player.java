package com.lxisoft.game;
import java.util.*;

public class Player 
{  
    private String name;       
    public Cell currentCell = new Cell();
    public GameState state;
    
        
    public Player()
    {
        state = GameState.FRESH;
    }
    
    public String getName()
    {
        return name;          
    }
    
    public void setName(String Name)
    {
        this.name=Name;
    }    
    
    public int throwDice(Dice dice)
    {
        int diceResult;
        Random r = new Random();
        diceResult = r.nextInt(7);
        System.out.println("Dice Rolled : " + diceResult);
        return diceResult;       
   
        /*if(diceValue == 6 && onemore chance!)
        {
            //inside if, change state to gameplay.
            //insert do-while.
        }
        */
           
    }
}
