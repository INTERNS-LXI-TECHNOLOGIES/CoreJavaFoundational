package com.lxisoft.game;
import java.util.*;

public class Cell
{  
    List<Snake> snakes;
    List<Ladder> ladders;
    List<Player> players; 
    public int cellID;  



    public Cell()
    {
        this.cellID = 0 ;
    }

    public Cell(int cellID){
        this.cellID = cellID+1 ;
    }
     
}

