package com.lxisoft.hungergame.forest;

public class Player{
private String name;
private String playericon;
private boolean active;
private int cellcount=0;
private int hungerlevel=0;
private int diceResult;

public int getDiceResult() {
    return diceResult;
}

public void setDiceResult(int diceResult) {
    this.diceResult = diceResult;
}

public int getHungerlevel() {
    return hungerlevel;
}

public void setHungerlevel(int hungerlevel) {
    this.hungerlevel = hungerlevel;
}

public int getCellcount() {
    return cellcount;
}

public void setCellcount(int cellcount) {
    this.cellcount = cellcount;
}


public boolean isActive() {
    return active;
}

public void setActive(boolean active) {
    this.active = active;
}




    public String getPLayericon() {
	
        return playericon;
    }

    public void setPLayericon(String playericon) {
        this.playericon = playericon;
    }
	
	public String getName() {
	
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public Player(String name,String icon){
 this.playericon=icon;
 this.name=name;
}
public int rollDice(Dice d){
  this.diceResult = d.roll();
  return diceResult;
}

}