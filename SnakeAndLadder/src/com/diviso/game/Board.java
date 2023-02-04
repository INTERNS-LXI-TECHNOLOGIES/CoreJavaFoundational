package com.diviso.game;
import java.util.ArrayList;
import java.util.List;

public class Board
{
    private List<Cell> cells = new ArrayList<>();
    private List<Snake> snakes = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();

    public void setSnakes(List<Snake> snakes) { this.snakes = snakes;}
    public List<Snake> getSnakes() { return snakes;}

    public void setLadders(List<Ladder> ladders) { this.ladders = ladders;}
    public List<Ladder> getLadders() { return ladders;}

    public void setCells(List<Cell> cells) { this.cells = cells;}
    public List<Cell> getCells(Cell cell) { return cells;}


}
