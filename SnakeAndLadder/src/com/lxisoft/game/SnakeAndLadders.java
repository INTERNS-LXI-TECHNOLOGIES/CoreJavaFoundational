public class SnakeAndLadders
{
        List<Cell> board ;

        public SnakeAndLadders()
        {
        }

        public SnakeAndLadders(List<Cell> board)
        {        
            this.board = board;
            snakes = new ArrayList<Snake>() ;
            ladders = new ArrayList<Ladder>() ;

            snakes.add(new Snake(board.get(12), board.get(4)));
            snakes.add(new Snake(board.get(26), board.get(14));
            snakes.add(new Snake(board.get(56), board.get(29));
            snakes.add(new Snake(board.get(76), board.get(59));
            snakes.add(new Snake(board.get(97), board.get(81));
        
            ladders.add(new Ladder(board.get(10), board.get(2)); 
            ladders.add(new Ladder(board.get(38), board.get(13));
            ladders.add(new Ladder(board.get(48), board.get(20));
            ladders.add(new Ladder(board.get(77), board.get(5));
            ladders.add(new Ladder(board.get(98), board.get(57)); 

            //FRESH,GAMEPLAY,END
    
            public Cell moveIfSnakeOrLadderExists(Cell currentCell)
            {
                for(Snake s : snakes)
                {
                    System.out.println("Snake Bites!!");
                    if(s.headCell == currentCell)                    
                    {
                        return s.tailCell;                                
                    }
                }
                
                for(Ladder l : ladders)
                {
                    System.out.println("Yeah You Got Ladders");                                        
                    if(l.tailCell == currentCell)                    
                    {
                        return l.headCell;                                
                    }
                }


            }
}
