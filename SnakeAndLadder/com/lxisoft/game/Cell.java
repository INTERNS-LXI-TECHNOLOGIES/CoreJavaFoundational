package com.lxisoft.game;
import com.lxisoft.game.Player;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cell {
	
	private String playerName;
	private int playerPosition;
	
final static int WINPOINT = 30;
	
	private HashMap<Integer, Integer> snakes = new HashMap<>();
	private HashMap<Integer, Integer> ladders = new HashMap<>();
	{
		snakes.put(27, 1);
		snakes.put(21, 9);
		snakes.put(19, 7);
		snakes.put(17, 4);

		ladders.put(3, 22);
		ladders.put(5, 8);
		ladders.put(11, 26);
		ladders.put(20, 29);
	}

	
		public int calculatePlayerValue(int playerPosition, int diceValue) {
		int playerNewPosition=playerPosition+diceValue;

		if (playerNewPosition > WINPOINT)
			return playerPosition;		

		if (null !=snakes.get(playerNewPosition)) {
			System.out.println("Oops..swallowed by the snake..");
			playerNewPosition=snakes.get(playerNewPosition);
		}
		
		if (null !=ladders.get(playerNewPosition)) {
			System.out.println("YAY! climbing the ladder..");
			playerNewPosition=ladders.get(playerNewPosition);
		}
		
		return playerNewPosition;
	}



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


// Creating Setter Below
	  
	 // Setter method for snake map
	 
    public void setSnakes(HashMap<Integer, Integer> gSnakes) {
        this.snakes = gSnakes;
    }
	
	public void setLadders(HashMap<Integer, Integer> gLadders) {
        this.ladders = gLadders;
    }

	
	// Creating Getter Below
	
	// Getters method for snake map
 
 public HashMap<Integer, Integer> gSnakes() {
        return snakes;
    }  
	
 public HashMap<Integer, Integer> gLadders() {
        return ladders;
    }  
	
	public void print()	{
	System.out.println(playerName+"\n"+playerPosition+"\n"+this.snakes+"\n"+this.ladders+"\n");
}
}