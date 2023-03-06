package com.lxisoft.game;
//import com.lxisoft.game.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Board extends Dice {
	
	private String boardName;
	final static int WINPOINT = 30;
	
	static HashMap<Integer, Integer> snake = new HashMap<>();
	static HashMap<Integer, Integer> ladder = new HashMap<>();
	{
		snake.put(27, 1);
		snake.put(21, 9);
		snake.put(19, 7);
		snake.put(17, 4);

		ladder.put(3, 22);
		ladder.put(5, 8);
		ladder.put(11, 26);
		ladder.put(20, 29);
	}
		
		
	private List<Player> players = new ArrayList<Player>();
	private List<Board> boardsquare = new ArrayList<Board>();
	
 	public void snakeNLadder(int number){
		
		PlayerSanthosh santhosh = new PlayerSanthosh();
		Player santhosh1= santhosh.creatingPlayerSanthosh();
		players.add(santhosh1);
		
		System.out.println("____Player DETAILS_____\n");
		System.out.println("PlayerName: "+santhosh1.getPlayerName()+"\n");
		
		PlayerParamesh paramesh = new PlayerParamesh();
		Player paramesh1= paramesh.creatingPlayerParamesh();
		players.add(paramesh1);
		System.out.println("PlayerName: "+paramesh1.getPlayerName()+"\n"); 

	}	
	
	public int calculatePlayerValue(int playerPosition, int diceValue) {
		int playerNewPosition=playerPosition+diceValue;

		if (playerNewPosition > WINPOINT)
			return playerPosition;		

		if (null !=snake.get(playerNewPosition)) {
			System.out.println("Oops..swallowed by the snake..");
			playerNewPosition=snake.get(playerNewPosition);
		}
		
		if (null !=ladder.get(playerNewPosition)) {
			System.out.println("YAY! climbing the ladder..");
			playerNewPosition=ladder.get(playerNewPosition);
		}
		
		return playerNewPosition;
	}
	
	public boolean isWin(int playerPosition) {
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
		    diceValue=rollDice();

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
	
// Creating Setter Below
	  
	 // Setter method for snake map
	 
    public void setSnake(HashMap<Integer, Integer> gSnakes) {
        this.snake = gSnakes;
    }
	
	public void setLadder(HashMap<Integer, Integer> gLadders) {
        this.ladder = gLadders;
    }
	
	public void setBoardName(String sNLBoard){
	 this.boardName = sNLBoard;
	}
	
	// Creating Getter Below
	
	// Getters method for snake map
 
 public HashMap<Integer, Integer> gSnakes() {
        return snake;
    }  
	
 public HashMap<Integer, Integer> gLadders() {
        return ladder;
    }  
	
public String getBoardName(){
	 return this.boardName;
}

	public void print(){
		
		System.out.println (this.snake+"\n"+this.ladder+"\n"+this.boardName);
			
	}

}