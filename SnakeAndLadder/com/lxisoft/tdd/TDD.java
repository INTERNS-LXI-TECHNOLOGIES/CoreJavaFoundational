//Packages
package com.lxisoft.tdd;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.game.Board;
import com.lxisoft.game.Dice;
import com.lxisoft.game.Cell;
import com.lxisoft.game.Player;

public class TDD {
	
	public static void main (String [] args){
		
		Board slGame = new Board();
		Dice dice=new Dice();
		Player player=new Player();
		
		// Printing Sections Board Details	
		slGame.setBoardName("SNAKE & LADDER GAME");
		
		System.out.println("\n"+"Board Name : "+ slGame	.getBoardName()+"\n");
		
		slGame.snakeNLadder(2);	
		dice.rollDice();	
		player.startGame();	
		
	}
}

