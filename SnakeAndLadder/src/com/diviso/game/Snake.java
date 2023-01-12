package com.diviso.game;
import com.diviso.snakeandladder.SnakeAndLadder;

public class Snake
{
    private Cell headCell;
    SnakeAndLadder game2 = new SnakeAndLadder();
 
    public Cell getHeadCell()
    {
        return headCell;
    }

    public Snake(Cell headCell)
    {
        this.headCell = headCell;
        
        Cell snakeHead = game2.getBoard().getCell().get(headCell.getCellID());
        snakeHead.getSnake().add(this);
    }
}
