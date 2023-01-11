package com.diviso.game;
import com.diviso.snakeandladder.SnakeAndLadder;

public class Snake
{
    private Cell headCell;
 
    public Cell getHeadCell()
    {
        return headCell;
    }

    public void setHeadCell(Cell HeadCell)
    {
        this.headCell = HeadCell;
    }

    public Snake(Cell headCell)
    {
        this.headCell = headCell;
        
        Cell snakeHead = SnakeAndLadder.getBoard().getCell().get(headCell.getCellID());
        snakeHead.getSnakes().add(this);
    }
}
