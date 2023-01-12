package com.diviso.game;
import com.diviso.snakeandladder.SnakeAndLadder;

public class Ladder
{
    private Cell tailCell;
    SnakeAndLadder game1 = new SnakeAndLadder();
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

        Cell ladderBottom = game1.getBoard().getCell().get(tailCell.getCellID());
        ladderBottom.getLadder().add(this);
    }
}
