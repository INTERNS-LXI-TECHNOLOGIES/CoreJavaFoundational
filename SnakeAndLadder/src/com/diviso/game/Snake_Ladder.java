package com.diviso.game;
import java.util.*;

public class Snake_Ladder
{
    private Board board;
    private List<Snake>snakes = new ArrayList<Snake>();
    private List<Ladder>ladders = new ArrayList<Ladder>();

    public Board getBoard()
    {
        return board;
    }

    public void setBoard(Board Board)
    {
        this.board = Board;
    }

    public List<Snake> getSnake()
    {
        return snakes;
    }

    public void setSnake(List<Snake> Snakes)
    {
        this.snakes = Snakes;
    }

    public List<Ladder> getLadder()
    {
        return ladders;
    }

    public void setLadder(List<Ladder> Ladders)
    {
        this.ladders = Ladders;
    }

    public Snake_Ladder()
    {

    }

    public Snake_Ladder(Board board)
    {
        this.board = board;
        snakes.add(new Snake(board.getCells().get(12)));
        snakes.add(new Snake(board.getCells().get(26)));
        snakes.add(new Snake(board.getCells().get(56)));
        snakes.add(new Snake(board.getCells().get(75)));
        snakes.add(new Snake(board.getCells().get(97)));

        ladders.add(new Ladder(board.getCells().get(10)));
        ladders.add(new Ladder(board.getCells().get(13)));
        ladders.add(new Ladder(board.getCells().get(20)));
        ladders.add(new Ladder(board.getCells().get(57)));
        ladders.add(new Ladder(board.getCells().get(76)));
    }

    public int moveIfSnakeOrLadderExists(Cell currentCell)
    {
        System.out.println("Checking If Snake Or Ladder Exist");
        
        for(Snake s : currentCell.getSnakes())
        {
            System.out.println("Snakes Check ");

            if(s.getHeadCell().getCellID() == currentCell.getCellID())
            {
                System.out.println("Ouch snake bites Go Down...!");                    
                //return s.tailCell.cellID;
            }
        }

        for(Ladder l : currentCell.getLadders())
        {
            System.out.println("Ladder Check ");

            if(l.getTailCell().getCellID() =  currentCell.getCellID())
            {
                System.out.println("Yeah! You Got Ladders");
                //return l.headCell.cellID;
            }
        }
        return currentCell.getCellID();

    }
}
