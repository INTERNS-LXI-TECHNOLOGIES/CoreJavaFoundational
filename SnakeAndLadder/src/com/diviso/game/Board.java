package com.diviso.game;
import java.util.ArrayList;
import java.util.List;

public class Board
{
    private List<Cell> cells = new ArrayList<>();

    public void setCells(List<Cell> cells) { this.cells = cells;}
    public List<Cell> getCells() { return cells;}

    @Override
    public String toString()
    {
        return "Board " + "\n" ;

    }

}
