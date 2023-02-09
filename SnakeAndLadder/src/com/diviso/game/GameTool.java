package com.diviso.game;

public  class GameTool
{
    private String name ;
    private Cell tailCell;
    private Cell headCell;

    public GameTool() {
    }

    public GameTool(String name, Cell tailCell, Cell headCell)
    {
        this.name = name ;
        this.tailCell = tailCell ;
        this.headCell = headCell ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setTailCell(Cell tailCell) { this.tailCell = tailCell;}
    public Cell getTailCell() { return tailCell;}

    public void setHeadCell(Cell headCell) { this.headCell = headCell;}
    public Cell getHeadCell() { return headCell;}

    @Override
    public String toString()
    {
        return "GameTool gT Has Snakes And Ladders";
    }
}
