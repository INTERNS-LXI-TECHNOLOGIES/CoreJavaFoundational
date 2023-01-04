package com.lxisoft.game;
import java.util.*;

public class Ladder 
{   
    Cell headCell; 
    Cell tailCell;

    public Ladder(Cell headCell,Cell tailCell)
    {
        this.headCell = headCell;
        this.tailCell = tailCell;
        this.headCell.ladders.add(this);
        this.tailCell.ladders.add(this);
    }
}
