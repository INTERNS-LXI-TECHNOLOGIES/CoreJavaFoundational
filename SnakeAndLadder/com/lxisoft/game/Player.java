package com.lxisoft.game;
import java.util.List;

public class Player {
	
	private String playerName;
	private int playerPosition;
	//private int diceValue;
	
// Creating Setter below
	
	public void setPlayerName(String playName){
	this.playerName = playName;
}

	public void setPosition(int playPosition){
	this.playerPosition = playPosition;
}

// Creating Getter Below

	public String getPlayerName(){
	return this.playerName;
}

	public int getPosition(){
	return this.playerPosition;
}
	
public void print()	{
	System.out.println(playerName+"\n"+playerPosition+"\n");
}
	
}