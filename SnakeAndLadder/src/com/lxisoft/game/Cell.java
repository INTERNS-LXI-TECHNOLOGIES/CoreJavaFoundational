package com.lxisoft.game;

public class Cell
{  
    List<Snake> snakes;
    List<Ladder> ladders;
    List<Player> players; 
    int cellID;  



    public Cell()
    {
        this.CellID = 0 ;
    }

    public Cell(int cellID){
        this.cellID = cellID+1 ;
    }
     
}

