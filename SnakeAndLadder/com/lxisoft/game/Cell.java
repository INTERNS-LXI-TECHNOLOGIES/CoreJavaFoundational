package com.lxisoft.game;
import com.lxisoft.game.Player;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cell {
	
	private int playerPosition;
	private Cell snlCell;
	
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


	// Creating Setter Below
	  
	 // Setter method for snake map and Player Name & Position
	 
    public void setSnakes(HashMap<Integer, Integer> gSnakes) {
        this.snakes = gSnakes;
    }
	
	public void setLadders(HashMap<Integer, Integer> gLadders) {
        this.ladders = gLadders;
    }

	public void setPosition(int playerPosition){
	this.playerPosition = playerPosition;
}
	
	// Creating Getter Below
	
	// Getters method for snake map and Player Name & Position
 
 public HashMap<Integer, Integer> gSnakes() {
        return snakes;
    }  
	
 public HashMap<Integer, Integer> gLadders() {
        return ladders;
    }  
	
	public int getPosition(){
	return this.playerPosition;
}

public void setCell(Cell snlCell){
	this.snlCell = snlCell;
}

public Cell getCell (){
	return this.snlCell;
}
	
	public void print()	{
	System.out.println("\n"+playerPosition+"\n"+this.snakes+"\n"+this.ladders+"\n");
}
}