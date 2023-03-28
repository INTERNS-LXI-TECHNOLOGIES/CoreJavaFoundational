package com.lxisoft.game;
//import com.lxisoft.game.Player;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.game.Dice;

public class Board{
	
	private String boardName;
		
		
	private List<Player> players = new ArrayList<Player>();
	private List<Board> boardsquare = new ArrayList<Board>();
	
 	public void snakeNLadder(int number){
		
		Player player = new Player();
		player.setPlayerName("Santhosh");
		players.add(player);
		player.setPlayerName("Paramesh");
		players.add(player);
					
		System.out.println("____Player DETAILS_____\n");
		System.out.println("PlayerName: "+player.getPlayerName()+"\n");

		//players.add(paramesh1); 
		System.out.println("PlayerName: "+player.getPlayerName()+"\n"); 

	}	
	
	
/* 	public boolean isWin(int playerPosition) {
		return WINPOINT==playerPosition;
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
	} */
		
public void setBoardName(String sNLBoard){
	 this.boardName = sNLBoard;
	}

public String getBoardName(){
	 return this.boardName;
}

public void print()	{
	System.out.println(boardName+"\n"+this.boardName+"\n");
	
}


}