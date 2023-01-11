package com.diviso.game;
import java.util.*;

public class Board
{
    private List <Cell> cells = new ArrayList<Cell>();

    public List<Cell> getCells()
    {
        return cells;
    }
    
    public void setCells(List<Cell> Cells)
    {
        this.cells = Cells;
    }
}
