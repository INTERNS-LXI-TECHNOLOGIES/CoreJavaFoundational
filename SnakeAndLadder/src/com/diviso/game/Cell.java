package com.diviso.game; 
import java.util.*;

public class Cell
{
    private List<Snake> snakes = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();
    private int cellID;

    public void setSnakes(List<Snake> snakes) { this.snakes = snakes;}
    public List<Snake> getSnakes() { return snakes;}

    public void setLadders(List<Ladder> ladders) { this.ladders = ladders;}
    public List<Ladder> getLadders() { return ladders;}

    public void setCellID(int cellID) { this.cellID = cellID;}
    public int getCellID() { return cellID;}

    public Cell() {}

    public Cell(int cellID)
    {
        this.cellID=cellID;
    }

    @Override
    public String toString()
    {
        return null;
    }

}
