package com.lxisoft.game;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.lxisoft.game.Board;

public class Player {
	
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
	
	public boolean isWin(int playerPosition) {
		return Player.WINPOINT==playerPosition;
	}
	 
	 	public void startGame() {
		int player1Position=0, player2Position=0;
		int currentPlayer=-1;		
		Scanner scan= new Scanner(System.in);
		String rPressed;
		int diceValue = 0;
		Dice Dice = new Dice();
		do {
		    System.out.println(currentPlayer == -1 
		    ? "\n\nFirst player's turn" : "\n\nSecond player's turn");
		    System.out.println("Press 'r' to roll Dice");
		    rPressed=scan.next();
		    diceValue=Dice.rollDice();

		    if (currentPlayer==-1) {
		      player1Position=calculatePlayerValue(player1Position, diceValue);
		      System.out.println("First Player Position:"+player1Position);
		      System.out.println("Second Player Position:"+player2Position);
		      System.out.println("-------------------------");
		      if (isWin(player1Position)) {
		         System.out.println("Congratulations! First player won");
		         return;
		      }
		      } else {
		        player2Position = calculatePlayerValue(player2Position, diceValue);
		        System.out.println("First Player Position:"+player1Position);
		        System.out.println("Second Player Position:"+player2Position);
		        System.out.println("-------------------------");
		        if (isWin(player2Position)) {
		          System.out.println("Congratulations! Second player won");
		          return;
		        }
		      }
		      currentPlayer = -currentPlayer;
		} while ("r".equals(rPressed));
	}
	
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