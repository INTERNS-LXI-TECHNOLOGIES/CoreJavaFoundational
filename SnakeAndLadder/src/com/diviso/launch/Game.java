package com.diviso.launch;
import com.diviso.game.*;
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
    private List<GameTool> GameTools = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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
        this.GameTools = GameTools;
    }

    public List<GameTool> getGameTools() {
        return GameTools;
    }

    public void gameDetails() {
        System.out.println("\n" + "\t\t\t\t\t\t\t" + "LXI SOFT PRESENTS" + "\n");
        System.out.println("\t\t\t\t\t\t     " + " Snake And Ladder Game  " + "\n");
        System.out.println("\t\t\t\t\t\t      " + "*** Instructions ***" + "\n");
        System.out.println("\t\t\t" + "This program will simulate a regular snakes and ladders game developed by LxiSoft India.");

        System.out.println("\t" + "You and the other opponents starts at Fresh Point at Cell 1 and while play you got Dice 6 you got one more chance to play");
        System.out.println("\t\t\t\t     " + "When reach End Point at Cell 100, Player Win Lets party!");

        System.out.println("\t\t\t\t\t      " + "©Copyright All Rights Reserved 2023." + "\n");
    }

    public void transferSnakesAndLadderIntoBoard()
    {
        for(GameTool gT : gameTools)
        {
            if (gT instanceof Snake)
            {
                ((Snake) gT).getHeadCell();
            }

            if (gT instanceof Ladder)
            {
                ((Ladder) gT).getTailCell();
            }
        }
    }

    public void createCells()
    {
        for (int i = 1; i <= 100; i++)
        {
            cells.add(new Cell(i));
            board.getCells(cell);

        }
    }

    public void configSnakesAndLadders()
    {
        Cell c = board.getCells().get(12);
        c = getSnakes().add(gameTool);
    }
    public static void main(String args[])
    {
        Game game = new Game();

        game.name = "Snake And Ladder Game";
    }
}
