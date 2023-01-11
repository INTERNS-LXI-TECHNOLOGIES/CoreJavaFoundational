package com.diviso.game;
import java.util.*;

public class Board
{
    private List <Cell> cells = new ArrayList<Cell>();

    public List<Cell> getCell()
    {
        return cells;
    }
    
    public void setCell(List<Cell> Cells)
    {
        this.cells = Cells;
    }
}
