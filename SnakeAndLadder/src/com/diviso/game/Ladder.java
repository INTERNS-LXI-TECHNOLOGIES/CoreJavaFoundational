package com.diviso.game;
import com.diviso.launch.SnakeAndLadder;

public class Ladder
{
    private Cell tailCell;
    private SnakeAndLadder game;

    public Cell getTailCell()
    {
        return tailCell;
    }

    public void setTailCell(Cell TailCell)
    {
        this.tailCell = TailCell;
    }

    public SnakeAndLadder getGame()
    {
        this.game = game;
    }

    public Ladder(Cell tailCell , SnakeAndLadder game)
    {
        this.tailCell = tailCell;
        this.game = game;

        Cell ladderBottom = game.getBoard().getCell().get(tailCell.getCellID());
        ladderBottom.getLadder().add(this);
    }
}
