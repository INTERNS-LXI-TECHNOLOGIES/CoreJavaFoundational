package com.diviso.game;
import com.diviso.launch.SnakeAndLadder;

public class Snake
{
    private Cell headCell;
    private SnakeAndLadder game;

    public Cell getHeadCell()
    {
        return headCell;
    }

    public SnakeAndLadder getGame()
    {
        this.game = game;
    }

    public Snake(Cell headCell , SnakeAndLadder game)
    {
        this.headCell = headCell;
        this.game = game;
        
        Cell snakeHead = game.getBoard().getCell().get(headCell.getCellID());
        snakeHead.getSnake().add(this);
    }
}
