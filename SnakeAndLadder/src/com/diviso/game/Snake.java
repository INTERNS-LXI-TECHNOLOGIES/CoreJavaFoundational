package com.diviso.game;
import com.diviso.launch.Game;

public class Snake
{
    private Cell headCell;
    private Game snakeAndLadderGame;

    public Cell getHeadCell()
    {
        return headCell;
    }

    public Game getGame()
    {
        return snakeAndLadderGame;
    }

    public Snake(Cell headCell , Game snakeAndLadderGame)
    {
        this.headCell = headCell;
        this.snakeAndLadderGame = snakeAndLadderGame;
        
        Cell snakeHead = snakeAndLadderGame.getBoard().getCell().get(headCell.getCellID());
        snakeHead.getSnake().add(this);
    }
}
