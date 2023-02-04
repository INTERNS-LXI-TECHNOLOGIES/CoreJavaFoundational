package com.diviso.game;
import java.util.ArrayList;
import java.util.List;

public class GameTool
{
    private Board board;
    List <Snake> snakes = new ArrayList<>();
    List <Ladder> ladders = new ArrayList<>();

    public void setBoard(Board board) { this.board = board;}
    public Board getBoard() { return board;}

    public void setSnakes(List<Snake> snakes) { this.snakes = snakes;}
    public List<Snake> getSnakes() { return snakes;}

    public void setLadders(List<Ladder> ladders) { this.ladders = ladders;}
    public List<Ladder> getLadders() { return ladders;}

    public void addSnakesAndLadders()
    {
        snakes.add(new Snake(12,2));
        snakes.add(new Snake(24,15));
        snakes.add(new Snake(42,25));
        snakes.add(new Snake(62,45));
        snakes.add(new Snake(85,55));
        snakes.add(new Snake(99,38));

        ladders.add(new Ladder(3,13));
        ladders.add(new Ladder(14,27));
        ladders.add(new Ladder(20,44));
        ladders.add(new Ladder(39,54));
        ladders.add(new Ladder(61,84));
        ladders.add(new Ladder(86,98));
    }
}
