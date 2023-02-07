package com.diviso.game;

public class Ladder extends GameTool
{
    private Cell tailCell;
    private Cell headCell;

    public void setTailCell(Cell tailCell) { this.tailCell = tailCell;}
    public Cell getTailCell() { return tailCell;}

    public void setHeadCell(Cell headCell) { this.headCell = headCell;}
    public Cell getHeadCell() { return headCell;}

    public Ladder() {}

    public Ladder(Cell tailCell, Cell headCell)
    {
        this.headCell = headCell;
        this.tailCell = tailCell;
    }

    @Override
    public String toString()
    {
        return null;
    }

}
