package com.diviso.game;
import java.util.*;

public class Player
{
    private String name;
    private GameState state;
    private boolean playerWon = false;

    private Cell currentCell = new Cell();

    public String getName()
    {
        return name;          
    }
    
    public void setName(String Name)
    {
        this.name=Name;
    }    

    public GameState getGameState()
    {
        return state;          
    }
    
    public void setGameState(GameState State)
    {
        this.state = State;
    }    

    public Cell getCurrentCell()
    {
        return currentCell;          
    }

    public Boolean getPlayerWon()
    {
        return playerWon;
    }

    public void setPlayerWon(Boolean PlayerWon)
    {
        this.playerWon = PlayerWon;
    }

    public  Player()
    {
        state = GameState.FRESH;
    }

        public int throwDice(Dice dice)
        {
            int diceResult;
            Random r = new Random();
            diceResult = r.nextInt(7);
            System.out.println("Dice Rolled : " + diceResult);
            return diceResult;   
        }

        public void printDetails()
        {
            System.out.println(this.name + "CurrentCell Is " + currentCell.cellID);
        }        
}
