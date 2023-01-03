package com.lxisoft.game;
import com.lxisoft.launch;
import java.util.*;

public class Game 
{  
    List<Player> players;
    List<Snake> snakes;
    List<Ladder> ladders;
    List<Cell> board;
    SnakesAndLadders sl ;
   
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
        do
        {
            for(Player p : players)
            {
                p.throwDice();

                if(p.state == GameState.GAMEPLAY)
                {

                    p.currentCell 
                      = p.currentCell+diceResult;

                    p.currenctCell = sl.moveIfSnakeOrLadderExists(p.currentcell);
                } 
                

                currentcell = 100 change state to end;

                if(p.state == GameState.FRESH)
                {

                    if(p.throwDice() == 6)
                    {
                        p.state=GAMEPLAY;
                        p.currentCell = 1;    
                    }                        
                }

                if(p.state == GameState.END)
                {
                    //players.currentCell=;
                    System.out.println("Congratulations! " + i + "player wins");
                    //remove player from players
                    if(p == 100)
                    {
                        p.remove();                    
                    }                    
                    boolean playerwon = true;

                    if(/*6 && not playerwon */)
                    {
                        //he/she gets one more chance to throw dice;
                    }
                }
            }    
        }
        while(players.size()>1)
    
    public static void main(String args[])
    {
        Game snakeAndLadder = new Game();
        sl = new SnakeAndLadders(board) ;

        snakeAndLadder.createPlayersAndDice();
        snakeAndLadder.gameLoop();
        
    }

    /*+
                player.currentCell == ladder.headCell
                player.currentCell == snake.tailCell 
                (i%4)
            */

    /*for(int i = 0; i < //gameState.END; i++) 
            {       
                System.out.println("Press 'Enter' to roll dice"); 
                gameControl = sc.nextLine();  
                System.out.println(i + " please roll dice");
            }*/
}

