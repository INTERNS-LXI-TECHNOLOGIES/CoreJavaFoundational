package com.lxisoft.game;
import java.util.*;

public class SnakeAndLadder
{
        Board board;

        public SnakeAndLadder()
        {
        }

        public SnakeAndLadder(Board board)
        {        
            this.board = board;
            List <Snake> snakes = new ArrayList<Snake>() ;
            List <Ladder> ladders = new ArrayList<Ladder>() ;

            snakes.add(new Snake(board.cells.get(12), board.cells.get(4)));
            snakes.add(new Snake(board.cells.get(26), board.cells.get(14)));
            snakes.add(new Snake(board.cells.get(56), board.cells.get(29)));
            snakes.add(new Snake(board.cells.get(76), board.cells.get(59)));
            snakes.add(new Snake(board.cells.get(97), board.cells.get(81)));
        
            ladders.add(new Ladder(board.cells.get(10), board.cells.get(2))); 
            ladders.add(new Ladder(board.cells.get(38), board.cells.get(13)));
            ladders.add(new Ladder(board.cells.get(48), board.cells.get(20)));
            ladders.add(new Ladder(board.cells.get(77), board.cells.get(5)));
            ladders.add(new Ladder(board.cells.get(98), board.cells.get(57))); 
        }
            public int moveIfSnakeOrLadderExists(Cell currentCell)
            {
                for(Snake s : currentCell.snakes)
                {
                    System.out.println("Snake Bites!!");
                    if(s.headCell.cellID == currentCell.cellID)                    
                    {
                        return s.tailCell.cellID;                                
                    }
                }
                
                for(Ladder l : currentCell.ladders)
                {
                    System.out.println("Yeah You Got Ladders");                                        
                    if(l.tailCell.cellID == currentCell.cellID)                    
                    {
                        return l.headCell.cellID;                                
                    }
                }

                return currentCell.cellID ;


            }
}
