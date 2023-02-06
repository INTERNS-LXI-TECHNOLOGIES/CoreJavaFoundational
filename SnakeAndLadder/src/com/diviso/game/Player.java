package com.diviso.game; 

public class Player
{
    private String nameOne;
    private String nameTwo;

    public void setNameOne(String nameOne) { this.nameOne = nameOne;}
    public String getNameOne() { return nameOne;}

    public void setNameTwo(String nameTwo) { this.nameTwo = nameTwo;}
    public String getNameTwo() { return nameTwo;}

    @Override
    public String toString()
    {
        return "PlayerOne Name : " + getNameOne() +"\n" +
                "PlayerTwo Name : " + getNameTwo() ;
    }
}
