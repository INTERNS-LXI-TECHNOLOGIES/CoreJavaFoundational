package com.diviso.snakeandladder;
import com.diviso.game.*;
import java.util.*;

public class SnakeAndLadder
{
    private Board board = new Board();
    private Cell cell;
    private Dice dice;
    private Snake_Ladder snakesLadders;
    private List<Player> players = new ArrayList<>();
    private List<Snake> snakes   = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();

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

    public Dice getDice()
    {
        return dice;
    }       

    public void setDice(Dice Dice)
    {
        this.dice = Dice;
    }
    
    public Snake_Ladder getSnakesLadders()
    {
        return snakesLadders;
    }       

    public void setSnakesLadders(Snake_Ladder SnakesLadders)
    {
        this.snakesLadders = SnakesLadders;
    }
    
    public List<Player> getPlayer()
    {
        return players;
    }

    public void setPlayer(List<Player> Players)
    {
        this.players = Players;
    }   

    public List<Ladder> getLadder()
    {
        return ladders;
    }

    public void setLadder(List<Ladder> Ladders)
    {
        this.ladders = Ladders;
    }   

    public List<Snake> getSnake()
    {
        return snakes;
    }

    public void setSnake(List<Snake> Snakes)
    {
        this.snakes = Snakes;
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
            board.getCell().add(cell);
        }
    }    

    public void createPlayersAndDice()
    {
        int totalPlayersList;
        System.out.println("How Many Players Need To Join");
        totalPlayersList = Integer.parseInt(sc.nextLine());

        createCell();
        Dice dice = new Dice();

        for(int i = 1; i <= totalPlayersList; i++)
        {
            Player player = new Player();
            players.add(player);
            System.out.println("Enter Player " + i + " Name : ");
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
                    System.out.println(p.getName() + "Please Roll Dice ");
                    diceResult = p.throwDice(dice);
                    System.out.println(diceResult);
                    if(p.getGameState() == GameState.GAMEPLAY)
                    {
                        p.getCurrentCell().setCellID(p.getCurrentCell().getCellID()+diceResult);
                        p.getCurrentCell().setCellID(snakesLadders.moveIfSnakeOrLadderExists(board.getCell().get(p.getCurrentCell().getCellID())));
                    }

                    if(p.getGameState() == GameState.FRESH)
                    {
                        if(diceResult == 1 || diceResult == 6)
                        {
                            p.setGameState(GameState.GAMEPLAY);
                            p.getCurrentCell().setCellID(1);
                            System.out.println("GameState changed to GAMEPLAY ");
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
        SnakeAndLadder game = new SnakeAndLadder();
        game.gameInit();
        game.createPlayersAndDice();
        game.snakesLadders= new Snake_Ladder(game.board);
        game.gameLoop();
    }
}
