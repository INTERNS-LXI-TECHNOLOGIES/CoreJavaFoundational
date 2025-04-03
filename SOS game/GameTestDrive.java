import java.util.Scanner;
public class GameTestDrive
    {
	static String[][] board = new String[3][3];
	
public static void main(String[]args)
    {
System.out.println("******************** KICK OUT THE XO GAME ******************");
System.out.println("");
System.out.println("!!!!!!! GET READY TO PLAY !!!!!!!");
System.out.println("");

makeBoard();
printBoard();
checkFilled();	
takeTurn(); 



}
static void makeBoard()
{
    for(int r=0;r<board.length;r++)
   {
	for(int c=0;c<board[r].length;c++)
	{
		board[r][c]=" -- ";
}
}
}
	
static void printBoard()
{
	for(int r=0;r<board.length;r++)
	{
		for(int c=0;c<board[r].length;c++)
		{
			System.out.print(board[r][c]);
		}
		System.out.println("");
	}
}

static boolean checkFilled()
{
	for(int r=0;r<board.length;r++)
	{
		for(int c=0;c<board[r].length;c++)
		{
			if(board[r][c].equals(" -- "))
			{
				System.out.println("the box is empty");
				return false;
			}
			
		
		}
		
	}
	System.out.println("spaces filled");
	return true;
}

static String checkWhoWon()
{
	
			if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]))
			{
			return board[0][0];
			}

		if(board[0][1].equals(board[1][1])&& board[0][1].equals(board[2][1]))
		{
			return board[0][1]; 

		}
				if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]))
				{
					return board[0][2];
				}
				if(board[0][0].equals(board[0][1])&& board[0][0].equals(board[0][2]))
				{
					return board[0][0];
				}
								if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]))
								{
									return board[1][0];

								}
				if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]))
				{
					return board[2][0];
				}
				if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))
				{
				return board[0][2];	
				}
				if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))
				{
					return board[0][0];
				}
				
return " -- "; 
}


static void takeTurn()
{ 
Scanner sc = new Scanner(System.in);
int turncount =0;                   //turncount keeps track of whose turn it is (even = Player 1, odd = Player 2).              
int row = 0 ;
                                   //row and column store the player's chosen position.
int column = 0 ;

outside : 
for(int r=0;r<board.length;r++)
{
	inside: 
	for(int c=0;c<board[r].length;c++)
	{
		

	do
	{
	System.out.print("enter the row eg.(0-2) :");
	String s = sc.nextLine();
	row=Integer.parseInt(s);
	System.out.println("enter the column eg.(0-2) :");
	String t = sc.nextLine();
	column = Integer.parseInt(t);
	}
	while( !board[row][column].equals(" -- ")) ;
	
				
                if (turncount % 2 == 0) 
				{
                    board[row][column] = " s ";
                } else 
				{
                    board[row][column] = " o ";
                }
                turncount++;
				
				
	printBoard();
	if( !checkWhoWon().equals(" -- "))
	{
			System.out.println(" Player " + checkWhoWon() + " won the game") ;
			break outside ;
	}
	
	
}


}
 if( checkWhoWon().equals(" -- "))
  {
	  System.out.println("The Game is drawn") ;
  }

}
}

 

		
	


