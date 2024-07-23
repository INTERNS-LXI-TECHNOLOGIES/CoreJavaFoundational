package com.lxi.hungergame.player;
import com.lxi.hungergame.dice.Dice;

public class Player{
private String playerimg;
private String  name;
private int cellposition=0;
private boolean isactive;
private int hungerlevel=0;
private int result;



public Player(String playerimg,String name) {
        this.playerimg = playerimg;
		this.name=name;
		this.isactive=isactive;
		this.cellposition=cellposition;
		   }

public int rolldices(Dice d)	{
	  result=d.roll();
	 return result;
 }		   
		   
		   
	
public int getHungerlevel(){
	return hungerlevel;
}
public void setHungerlevel(int hungerlevel){
	this.hungerlevel=hungerlevel;
}
public int getResult(){
	return result;
}
public void setResult(int result){
	this.result=result;
}
public int getCellposition(){
	return cellposition;
}
public void setCellposition(int cellposition){
	this.cellposition=cellposition;
}
public String getName(){
	return name;
}	
public void setName(String name){
	this.name=name;	
}

public String getPlayerimg() {
        return playerimg;
    }

 public void setPlayerimg(String playerimg) {
        this.playerimg = playerimg;
    }
public boolean getIsactive() {
        return isactive;
    }

 public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }	
 
 
	
} 