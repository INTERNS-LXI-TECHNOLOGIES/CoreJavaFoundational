package com.diviso.game;
import java.util.*;

public class Cell
{
    private List<Player> players = new ArrayList<>();
    private List<Snake>  snakes  = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();
    private int cellID;

    public List<Snake> getSnakes()
    {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Ladder> getLadders()
    {
        return ladders;
    }
    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public int getCellID() {
        return cellID;
    }

    public void setCellID(int CellID) {
        this.cellID = CellID;
    }

    public Cell()
    {
        this.cellID = 0;
    }

    public Cell(int cellID)
    {
        this.cellID = cellID+1;
    }
}
