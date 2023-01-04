package com.lxisoft.launch;
import com.lxisoft.game.*;
import java.util.*;

public class Game 
{  
    List<Player> players;
    List<Snake> snakes;
    List<Ladder> ladders;
    static Board board = new Board() ;
    static SnakeAndLadder sl;
    Dice dice;
    
    char gameControl;
    

    Scanner sc = new Scanner(System.in);
    Cell cell ;
    public void createCell()
    {
        for(int i = 0; i<=100; i++)
        {
            cell = new Cell(i);
            board.cells.add(cell);
        }
    }

    public void createPlayersAndDice()
    {
        createCell() ;
        System.out.println("How Many Players Need To Join");
        int totalPlayers=sc.nextInt(); 
        
      
        Dice dice = new Dice() ;
       
        for(int i = 0;  i < totalPlayers; i++)
        {   
            System.out.println("Enter " + i + "Players Name : ");

            Player player = new Player();
   
            player.setName(sc.nextLine());
            players.add(player);
         }
    }
    
    public void gameLoop()
    {                   
        int diceResult ;
         boolean playerWon = false ;

          do
        {
            for(Player p : players)
            {
                diceResult = p.throwDice(dice);       
                do
                {         
                
                if(p.state == GameState.GAMEPLAY)
                {
                    p.currentCell.cellID = p.currentCell.cellID+diceResult;

                    p.currentCell.cellID = sl.moveIfSnakeOrLadderExists(p.currentCell);
                } 
                

                //currentcell = 100 change state to end;

                if(p.state == GameState.FRESH)
                {
                    if(diceResult == 6)
                    {
                        p.state=GameState.GAMEPLAY;
                        p.currentCell.cellID = 1;    
                    }                        
                }

                if(p.state == GameState.END)
                {
                    System.out.println("Congratulations! " + p.getName() + "player wins");
                    
                    if(p.currentCell.cellID == 100)
                    {
                        players.remove(p);        
                       playerWon = true;            
                    }                    
                   

                   
                }

                }
                while(diceResult == 6 && !playerWon);
                    
            }    
        }
        while(players.size()>1);
    }
    public static void main(String args[])
    {
            
        Game snakeAndLadder = new Game();
   

        snakeAndLadder.createPlayersAndDice();
        sl = new SnakeAndLadder(board) ;
        snakeAndLadder.gameLoop();
        
    }
            /*
            for(int i = 0; i < //gameState.END; i++) 
            {       
                System.out.println("Press 'Enter' to roll dice"); 
                gameControl = sc.nextLine();  
                System.out.println(i + " please roll dice");
            }*/
}

