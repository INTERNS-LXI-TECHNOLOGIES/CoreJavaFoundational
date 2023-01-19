package com.diviso.game;
import com.diviso.launch.Game;

public class Ladder
{
    private Cell tailCell;
    private Game snakeAndLadderGame;
    
    public Cell getTailCell()
    {
        return tailCell;
    }

    public void setTailCell(Cell TailCell)
    {
        this.tailCell = TailCell;
    }

    public Game getGame()
    {
        return snakeAndLadderGame;
    }

    public Ladder(Cell tailCell , Game snakeAndLadderGame)
    {
        this.tailCell = tailCell;
        this.snakeAndLadderGame = snakeAndLadderGame;

        Cell ladderBottom = snakeAndLadderGame.getBoard().getCell().get(tailCell.getCellID());
        ladderBottom.getLadder().add(this);
    }
}
