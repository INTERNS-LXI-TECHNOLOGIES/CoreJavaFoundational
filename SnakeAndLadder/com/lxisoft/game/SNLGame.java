package com.lxisoft.game;
import com.lxisoft.game.Player;

public class SNLGame{
	
private Board snlBoard;

private String gameName;

public void setGameName(String gName){
	this.gameName = gName;
}

public String getGameName(){
	return this.gameName;
}

public void setBoard(Board board){
	this.snlBoard = board;
}

public Board getBoard (){
	return this.snlBoard;
}

public void print()	{
	System.out.println("\n"+this.gameName+"\n");
	
}
	
}