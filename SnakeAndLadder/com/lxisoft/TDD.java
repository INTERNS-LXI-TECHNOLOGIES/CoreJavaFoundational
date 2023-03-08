//Packages
package com.lxisoft.tdd;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.game.Board;

public class TDD {
	
	public static void main (String [] args){
		
		Board slGame=new Board();
		
		// Printing Sections Board Details	
		slGame.setBoardName("SNAKE & LADDER GAME");
		
		System.out.println("\n"+"Board Name : "+ slGame	.getBoardName()+"\n");
		
		slGame.snakeNLadder(2);	
		slGame.rollDice();	
		slGame.startGame();	
	}
}

