package com.diviso.game;

import com.diviso.snakeandladder.SnakeAndLadder;

public class Ladder
{
    private int headCell;
    private int tailCell;

    public int getHeadCell()
    {
        return headCell;
    }

    public void setHeadCell(int HeadCell)
    {
        this.headCell = HeadCell;
    }

    public int getTailCell()
    {
        return tailCell;
    }

    public void setTailCell(int TailCell)
    {
        this.tailCell = TailCell;
    }

    
    public Ladder(int headCell,int tailCell)
    {
        this.headCell = headCell;
        this.tailCell = tailCell;

        Cell ladderBottom = SnakeAndLadder.getBoard().getCells().get(tailCell.getCellID());
        ladderBottom.getLadders().add(this);
    }
}
