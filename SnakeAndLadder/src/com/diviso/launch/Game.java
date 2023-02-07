package com.diviso.launch;
import com.diviso.game.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private String name;
    private Cell cell = new Cell();
    private Dice dice;
    private Board board = new Board();
    private List<Snake> snakes = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();
    private List<Player> players = new ArrayList<>();
    private List<GameTool> gameTools = new ArrayList<>();
    public GameTool gameTool = new GameTool();

    Scanner sc = new Scanner(System.in);

    public void setName(String name) { this.name = name;}
    public String getName() { return name;}

    public void setBoard(Board board) {
        this.board = board;
    }
    public Board getBoard() {
        return board;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
    public Cell getCell() {
        return cell;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }
    public Dice getDice() {
        return dice;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }
    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }
    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setGameTools(List<GameTool> GameTools) {
        this.gameTools = GameTools;
    }
    public List<GameTool> getGameTools() {
        return gameTools;
    }

    /*public void gameDetails() {
        System.out.println("\n" + "\t\t\t\t\t\t\t" + "LXI SOFT PRESENTS" + "\n");
        System.out.println("\t\t\t\t\t\t     " + " Snake And Ladder Game  " + "\n");
        System.out.println("\t\t\t\t\t\t      " + "*** Instructions ***" + "\n");
        System.out.println("\t\t\t" + "This program will simulate a regular snakes and ladders game developed by LxiSoft India.");

        System.out.println("\t" + "You and the other opponents starts at Fresh Point at Cell 1 and while play you got Dice 6 you got one more chance to play");
        System.out.println("\t\t\t\t     " + "When reach End Point at Cell 100, Player Win Lets party!");

        System.out.println("\t\t\t\t\t      " + "©Copyright All Rights Reserved 2023." + "\n");
    }*/

    @Override
    public String toString()

    {
        return "Game Name : " + name + "\n"
            + "Game Has GameTool " + gameTool + "\n"
            + "Game Has Board " + board + "\n"
            + "Board Has Cell " + cell + "\n"
            + "Cell Has CellID " + "\n"
            + "Game Has Players " + players + "\n";
    }

    public void createPlayers()
    {
        Player p = new Player();

        players.add(p);

        System.out.println("Enter PlayerOne Name");
        p.setNameOne(sc.nextLine());
        System.out.println("Enter PlayerTwo Name");
        p.setNameTwo(sc.nextLine());

        System.out.println(p);
    }

    public void createCells()
    {
        for (int i = 1; i <= 100; i++)
        {
            cell = new Cell(i);
            board.getCells().add(cell);
        }
    }

    public void addSnakesAndLadders()
    {
        snakes.add(new Snake(new Cell(12), new Cell(2)));
        snakes.add(new Snake(new Cell(24), new Cell(15)));
        snakes.add(new Snake(new Cell(42), new Cell(25)));
        snakes.add(new Snake(new Cell(62), new Cell(45)));
        snakes.add(new Snake(new Cell(85), new Cell(55)));
        snakes.add(new Snake(new Cell(99), new Cell(38)));

        ladders.add(new Ladder(new Cell(3), new Cell(13)));
        ladders.add(new Ladder(new Cell(14), new Cell(27)));
        ladders.add(new Ladder(new Cell(20), new Cell(44)));
        ladders.add(new Ladder(new Cell(39), new Cell(54)));
        ladders.add(new Ladder(new Cell(61), new Cell(84)));
        ladders.add(new Ladder(new Cell(86), new Cell(98)));
    }

    public void transferSnakesAndLadderIntoBoard()
    {
        for(GameTool gT : gameTools)
        {
            if (gT instanceof Snake)
            {
                ((Snake) gT).getHeadCell().getCellID();
                board.getCells().get(((Snake) gT).getHeadCell().getCellID()).getSnakes().add((Snake)gT);
            }

            if (gT instanceof Ladder)
            {
                ((Ladder) gT).getTailCell().getCellID();
                board.getCells().get(((Ladder) gT).getTailCell().getCellID()).getLadders().add((Ladder)gT);
            }
        }
    }

    public static void main(String args[])
    {
        Game game = new Game();
        game.name = "Snake And Ladder 4.0";

        //Calling Complete Game toString()
        System.out.println(game);

        game.createPlayers();
        game.createCells();
        game.transferSnakesAndLadderIntoBoard();
        game.addSnakesAndLadders();
    }
}