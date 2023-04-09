//Packages
package com.lxisoft.tdd;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.game.Board;
import com.lxisoft.game.Dice;
import com.lxisoft.game.Cell;
import com.lxisoft.game.Player;
import com.lxisoft.game.SNLGame;

public class TDD {
	
	public static void main (String [] args){
		
		// Creating SNLGame Object and setting the Game Name
		SNLGame snlGame = new SNLGame();
		snlGame.setGameName("Game Name : Snake & Ladder");
		snlGame.print();
		
		// Creating Player Object and Creating player and Player Details
		
		List<Player> players = new ArrayList<Player>();

		Player player = new Player();
		player.setPlayerName("Santhosh");
		players.add(player);
				
		System.out.println("____Player DETAILS_____\n");
		System.out.println("Player Name: "+player.getPlayerName()+"\n");		
				
		player.setPlayerName("Paramesh");
		players.add(player);
					
		System.out.println("Player Name: "+player.getPlayerName()+"\n");

		// Starting Game
		
		Board board = new Board();
	
		board.startGame();	
		
	}
}

