package com.diviso.game;
import java.util.ArrayList;
import java.util.List;

public class Snake extends GameTool
{
    private Cell headCell;
    private Cell tailCell;

    public void setHeadCell(Cell headCell) { this.headCell = headCell;}
    public Cell getHeadCell() { return headCell;}

    public void setTailCell(Cell tailCell) { this.tailCell = tailCell;}
    public Cell getTailCell() { return tailCell;}

    public Snake() {}

    public Snake(Cell headCell, Cell tailCell)
    {
        this.headCell = headCell;
        this.tailCell = tailCell;
    }
}
