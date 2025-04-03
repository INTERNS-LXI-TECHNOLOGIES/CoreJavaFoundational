import java.util.Scanner;
public class Tdd{
	
	
	
	static String [][] board= new String[3][3];
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args){
		String winner;
        int turn;
       
		
		System.out.println(" Welcome to the sos Game ");
		fillBoard();
		turn= 0;
		do{
			printBoard();
			winner = " No winner yet";
			
		
			if (checkFilled()) {
				System.out.println("Game is drawn");
				break ;
			}
		
			takeTurn(turn);
		
			if (!checkWhoWon().equals(" -- "))
			{
				System.out.println( "Player "+checkWhoWon() + " won the game") ;
				break ;
			}
                                
			turn++;
		
		} while (turn < 9) ;
	
	
	 if (winner.equals("No winner yet")) {
                System.out.println("It's a draw!");
            }
	}
	public static void fillBoard()
		{
			for(int i= 0; i<board.length; i++)
			{
				for(int c=0; c< board[i].length; c++)
				{
					board[i][c]= " -- ";
				}	
			}
	}
	
	 static void printBoard()
	 {
				for(int i= 0; i<board.length; i++)
			{
				for(int c=0; c< board[i].length; c++)
				{
					System.out.print(board[i] [c]);
				}	
				System.out.println();
			}
	 }
	 
	 static boolean checkFilled()
	 {
		 
		 for(int r=0; r< board.length; r++)
		 {
			 for(int c=0; c< board[r].length; c++)
			 {
			 if (board[r][c].equals (" -- "))
			 {
				 return false ;
			 }
			
			 }
		 }
		 return true; 
	 }
	 
	 
	 static void takeTurn(int turn)
	 {
		 int row;
		 int column;
		 String s ;
		 
		  String player = (turn % 2 == 0) ? "S" : "O";
		  
		  do{
		   System.out.print("Enter row (0-2): ");
            s = sc.nextLine();
			row = Integer.parseInt(s) ;
            System.out.print("Enter column (0-2): ");
            s = sc.nextLine();
			column = Integer.parseInt(s) ;
		  }
		  while( !board[row][column].equals(" -- ") ) ;
		  board[row][column] = player ;
	 }
	 
	static String checkWhoWon()
	 {	
            if (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0])) {
            return  board[0][0];
        }
			
			if (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1])) {
            return  board[0][1];
        }
		
			if (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2])) {
            return  board[0][2];
        }
		
		if (board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]) ) {
            return  board[0][0];
        }
		if (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]) ) {
            return  board[1][0];
        }
		
		if (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]) ) {
            return  board[2][0];
        }
		
		if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) ) {
            return  board[0][2];
        }
		
		if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return  board[0][0];
        }
		

	   
	   return  " -- ";
	 }
}