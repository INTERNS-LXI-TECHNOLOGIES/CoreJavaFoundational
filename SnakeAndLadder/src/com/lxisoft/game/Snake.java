package com.lxisoft.game;
import java.util.*;
public class Snake
{
    Cell headCell;
    Cell tailCell;    

    public Snake(Cell headCell,Cell tailCell)
    {
        this.headCell = headCell;
        this.tailCell = tailCell;
        this.headCell.snakes.add(this) ;
        this.tailCell.snakes.add(this) ;
    }
}
