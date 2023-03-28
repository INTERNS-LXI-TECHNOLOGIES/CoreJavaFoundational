package com.lxisoft.game;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.lxisoft.game.Board;
import com.lxisoft.game.Cell;

public class Player {
	
	private String playerName;
	private int playerPosition;
	
	Cell cell=new Cell();
	
	public boolean isWin(int playerPosition) {
		return Cell.WINPOINT==playerPosition;
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
		      player1Position=cell.calculatePlayerValue(player1Position, diceValue);
		      System.out.println("First Player Position:"+player1Position);
		      System.out.println("Second Player Position:"+player2Position);
		      System.out.println("-------------------------");
		      if (isWin(player1Position)) {
		         System.out.println("Congratulations! First player won");
		         return;
		      }
		      } else {
		        player2Position = cell.calculatePlayerValue(player2Position, diceValue);
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

	public int getPosition(){
	return this.playerPosition;
}

}