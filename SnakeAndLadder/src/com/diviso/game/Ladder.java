package com.diviso.game;
import com.diviso.snakeandladder.SnakeAndLadder;

public class Ladder
{
    private Cell tailCell;

    public Cell getTailCell()
    {
        return tailCell;
    }

    public void setTailCell(Cell TailCell)
    {
        this.tailCell = TailCell;
    }

    
    public Ladder(Cell tailCell)
    {
        this.tailCell = tailCell;

        Cell ladderBottom = SnakeAndLadder.getBoard().getCells().get(tailCell.getCellID());
        ladderBottom.getLadders().add(this);
    }
}
