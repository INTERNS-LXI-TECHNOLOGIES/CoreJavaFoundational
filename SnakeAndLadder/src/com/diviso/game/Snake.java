package com.diviso.game;

import com.diviso.snakeandladder.SnakeAndLadder;

public class Snake
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

    public Snake(int headCell,int tailCell)
    {
        this.headCell = headCell;
        this.tailCell = tailCell;

        Cell snakeHead = SnakeAndLadder.getBoard().getCells().get(headCell.getCellID());
        snakeHead.getSnakes().add(this);
    }
}
