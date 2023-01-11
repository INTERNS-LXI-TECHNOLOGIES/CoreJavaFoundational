package com.diviso.snakeandladder;
import com.diviso.game.*;
import java.util.*;

public class SnakeAndLadder
{
    private Board board;
    private Cell cell;
    private Snake_Ladder snakesLadders;
    private List<Player> players = new ArrayList<Player>();
    private int totalPlayersList;

    Scanner sc = new Scanner(System.in); 

    public Board getBoard()
    {
        return board;
    }       

    public void setBoard(Board Board)
    {
        this.board = Board;
    }

    public Cell getCell()
    {
        return cell;
    }       

    public void setCell(Cell Cell)
    {
        this.cell = Cell;
    }
        
    public int getTotalPlayersList()
    {
        return totalPlayersList;
    }       

    public void setTotalPlayersList(int TotalPlayersList)
    {
        this.totalPlayersList = TotalPlayersList;
    }

    public Snake_Ladder getSnakesLadders()
    {
        return snakesLadders;
    }       

    public void setSnakesLadders(Snake_Ladder SnakesLadders)
    {
        this.snakesLadders = SnakesLadders;
    }
    
    public List<Player> getPlayers()
    {
        return players;
    }

    public void setPlayers(List<Player> Players)
    {
        this.players = Players;
    }   
            
    public void gameInit()
    {
        System.out.println("\n" + "\t\t\t\t\t\t\t" + "LXI SOFT PRESENTS" + "\n");
        System.out.println("\t\t\t\t\t\t     " + " Snake And Ladder Game  " + "\n");
        System.out.println("\t\t\t\t\t\t      " + "*** Instructions ***" + "\n");
        System.out.println("\t\t\t" + "This program will simulate a regular snakes and ladders game developed by LxiSoft India.");
        
        System.out.println("\t" + "You and the other opponents starts at Fresh Point at Cell 1 and while play you got Dice 6 you got one more chance to play");         System.out.println("\t\t\t\t     " + "When reach End Point at Cell 100, Player Win Lets party!");
        
        System.out.println("\t\t\t\t\t      " + "©Copyright All Rights Reserved 2023." + "\n");
    }

    public void createCell()
    {
        for(int i =0; i <=100; i++)
        {
            cell = new Cell(i);
            setBoard(board.setCell().add(cell));
        }
    }    

    public void createPlayersAndDice()
    {
        System.out.println("How Many Players Need To Join");
        totalPlayersList = Integer.parseInt(sc.nextLine());
               
        createCell();
        Dice dice = new Dice();

        for(int i = 0; i < totalPlayersList; i++)
        {
            Player player = new Player();
            players.add(player);
            System.out.println("Enter " + i + "Name : ");
            player.setName(sc.nextLine());        
        }    
    }

    public void gameLoop()
    {
        int diceResult;        
        do
        {
            for(Player p : players)
            {
                p.printDetails();
                do
                {
                    System.out.println(p.getName() + "Please Roll Dice");                
                    diceResult = p.throwDice(dice);    
                    System.out.println(diceResult);
                    if(p.getGameState() == GameState.GAMEPLAY)
                    {
                        p.getCurrentCell().setCellID(p.getCurrentCell().getCellID()+diceResult);
                        p.getCurrentCell().setCellID(snakesLadders.moveIfSnakeOrLadderExists(board.getCells().get(p.getCurrentCell().getCellID())));
                    }
        
                    if(p.getGameState() == GameState.FRESH)
                    {
                        if(diceResult == 1 || diceResult == 6)
                        {
                            p.setGameState(GameState.GAMEPLAY);
                            p.getCurrentCell().setCellID(1);
                            System.out.println("GameState changed to GamePlay");                        
                        }
                    }    

                    if(p.getGameState() == GameState.END)
                    {
                        System.out.println("Congratulations! " + p.getName() + " Wins ");
                        if(p.getCurrentCell().getCellID() == 100)
                        {
                            players.remove(p);
                            p.setPlayerWon(true);
                        }
                    }
            
                    System.out.println("Do you want to continue? (Yes/No)");
                    String key = sc.nextLine();
                    switch(key)
                    {
                        case "Y" :
                        break;
                        
                        case "N" :
                        System.out.println("Exited!");
                        break;

                        default :
                        System.out.println("Wrong Statement");
                    }   
    
                }while(diceResult == 6 && !p.getPlayerWon());
            }
        }while(players.size()>1);
        
    }

    public static void main(String args[])
    {
        SnakeAndLaddder game = new SnakeAndLaddder();
        game.gameInit();
        game.createPlayersAndDice();
        snakesLadders = new Snake_Ladder(board);  
        game.gameLoop();
    }
}
