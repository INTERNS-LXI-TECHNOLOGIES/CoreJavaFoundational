package com.lxisoft.game;
import com.lxisoft.game.Player;


public class Cell {
	
	private String playerName;
	private int playerPosition;
	

	// Setter and Getter
	
	public void setPlayerName(String playName){
	this.playerName = playName;
}

	public void setPosition(int playerPosition){
	this.playerPosition = playerPosition;
}
	public String getPlayerName(){
	return this.playerName;
}
	public int getPosition(){
	return this.playerPosition;
}

}