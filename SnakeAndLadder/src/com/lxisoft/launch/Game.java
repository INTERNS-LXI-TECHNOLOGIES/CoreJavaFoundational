package com.lxisoft.game;
import com.lxisoft.launch;
import java.util.*;

public class Game 
{  
    List<Player> players;
    List<Snake> snakes;
    List<Ladder> ladders;
    List<Cell> board;
   
    Dice dice;
    String gameControl;
    int totalPlayersList = players;

    Scanner sc = new Scanner(System.in);
    Cell cell ;
    for(int i = 0; i<=100; i++)
    {
        cell = new Cell(i);
        board.add(cell);
    }

    public void createPlayersAndDice()
    {
        System.out.println("How Many Players Need To Join");
        totalPlayersList=sc.nextInt(); 
      
        Dice dice = new Dice() ;
       
        for(int i = 0;  i < totalPlayersList; i++)
        {   
            System.out.println("Enter " + i + "Players Name : ");

            Player player = new Player();
            
            player.setName(sc.nextLine());
            players.add(player);
         }
    }
    
    public void gameLoop()
    {
        for(int i = 0; i < gameState.END; i++) 
        {       
            System.out.println("Press 'Enter' to roll dice"); 
            gameControl = sc.nextLine();  
            System.out.println(i + " please roll dice");
            
        
            /*+
                player.currentCell == ladder.headCell
                player.currentCell == snake.tailCell 
                (i%4)
            */
         }
    }    
    public static void main(String args[])
    {
        Game snakeAndLadder = new Game();
        SnakesAndLadders sl = new SnakeAndLadders(board) ;

        snakeAndLadder.createPlayersAndDice();
        snakeAndLadder.gameLoop();
        
    }
}

