package com.diviso.game;

public class Snake extends GameTool
{
    private String snakeName;

    public void setSnakeName(String snakeName) { this.snakeName = snakeName;}
    public String getSnakeName() { return snakeName;}

    public Snake(String gtName, String snakeName, Cell headCell, Cell tailCell)
    {
        super(gtName, tailCell, headCell) ;
        this.snakeName = snakeName ;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Name : "+snakeName ;
    }

}
