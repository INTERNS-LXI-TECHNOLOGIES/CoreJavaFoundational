package com.diviso.game;
public class Ladder extends GameTool
{
    private String ladderName;

    public String getName() { return ladderName;}
    public void setName(String ladderName) { this.ladderName = ladderName;}

    public Ladder(String gTName,String ladderName, Cell tailCell, Cell headCell) {
        super(gTName, tailCell, headCell);
        this.ladderName = ladderName;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Name : " + ladderName;
    }

}
