package com.lxi.hungergame.model ;

public class Player{
private String name;
private String pimage;
private boolean isActive;
private int cellCount=0;
private int hungerlevel=0;
private int diceResult;

public Player(String name,String pimage){
	this.name=name;
	this.pimage=pimage;
}

    public int getDiceResult()
    {
        return this.diceResult ;
    }

    public void setDiceResult(int diceResult)
    {
        this.diceResult = diceResult ;
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPImage(){
        return pimage;
    }

    public void setPImage(String pimage) {
        this.pimage = pimage;
    }
	
	public boolean getisActive() {
        return isActive;
    }

    public void setisActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getCellCount() {
        return cellCount;
    }

    public void setCellCount(int cellCount) {
        this.cellCount = cellCount;
    }

    public int getHungerlevel() {
        return hungerlevel;
    }

    public void setHungerlevel(int hungerlevel) {
        this.hungerlevel = hungerlevel;
    }

    public int rollDice(Dice d){
        this.diceResult = d.roll() ;
        return this.diceResult ;
    }

}