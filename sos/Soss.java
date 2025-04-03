import java.util.Scanner;
   public class Soss{
   static String[][] board = new String[3][3];
	public static void main(String []args){
		   fillBoard();
		   printBoard();
		   checkFilled();
		   
	      
		  
		
          

		
		 
		 Scanner sc = new Scanner(System.in);
		 for(int turn=0;turn<board.length*board.length;turn++){
		    printBoard();
			int r = 0 ;
			int c = 0 ;
			do
			{
		    System.out.print("Enter move (rowcol, e.g. 00): ");
		    String move = sc.nextLine();
			   
				r = move.charAt(0) - '0';//Convert first character to number
				c = move.charAt(1) - '0';//Convert second character to number
			}
			while( !board[r][c].equals(" -- "));

		     
		    String letter =  (turn % 2 == 0) ? "S" : "O" ;
		    board[r][c] = "  "+ letter + "  ";  
            if ( checkWhoWon().equals("  S  ") || checkWhoWon().equals("  O  "))
			{
				System.out.println( "Player" + checkWhoWon() + "has won the game") ;
				break ;
			}
			   
				
			}
			
			if( checkWhoWon().equals(" -- "))
		    {
			System.out.println("Game is drawn") ;
			}
			printBoard() ;

	           
			   
	}
	
	    static void fillBoard(){
		    for(int r=0;r<board.length;r++){
			    for(int c=0;c<board[r].length;c++){
					
					board[r][c]= " -- ";
				}	  
			}	
		}
        
		static void printBoard(){
		   for(int r=0;r<board.length;r++){
			   for(int c=0;c<board[r].length;c++){
				   
				 System.out.print(board[r][c]);   
			   }
			   System.out.println();
			}
		}
		static boolean checkFilled() {
    for (int r = 0; r < board.length; r++) {
        for (int c = 0; c < board[r].length; c++) {
            if (board[r][c].equals(" -- ")) { 
               System.out.println("The Board is Emty");
                return false;
            }
        }
    }
    System.out.println("The Board is completely filled!");
    return true;
	
	
}      
		
    static String checkWhoWon(){
	  	//---
		if(board[0][0].equals(board[0][1])&& board[0][0].equals(board[0][2])){
		
		return board[0][0];
		}
	 
		if(board[1][0].equals(board[1][1])&& board[1][0].equals(board[1][2])){
		return  board[1][0];		
		}
		
		if(board[2][0].equals(board[2][1])&& board[2][0].equals(board[2][2])){
		return  board[2][0];		
		}
		
		//second||| 
		if(board[0][0].equals(board[1][0])&& board[0][0].equals(board[2][0])){
		return board[0][0];	
		}
		if(board[0][1].equals(board[1][1])&& board[0][1].equals(board[2][1])){
		return board[0][1];		
		}
		if(board[0][2].equals(board[1][2])&& board[0][2].equals(board[2][2])){
		return  board[0][2];	
		//x line check	
		}
		if(board[0][0].equals(board[1][1])&& board[0][0].equals(board[2][2])){
		return  board[0][0];
		}
		if(board[0][2].equals(board[1][1])&& board[0][2].equals(board[2][0])){
	    return  board[0][2];
		}
		
		return " -- ";
	  }
	   
 
 
}