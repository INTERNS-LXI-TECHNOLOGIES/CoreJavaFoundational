import java.util.Scanner;
public class Sos{
  static String [][]board = new String[3][3];
     public static void main(String[]args){
	 
	      fillBoard();
		  printBoard();
		  checkFilled();
		 // checkWhoWon();
		  //takeTurn();
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.print(" ENTER PLAYER ONE CHOICE: ");
		  String name =sc.nextLine();
		  
		  System.out.print(" ENTER PLAYER TWO CHOICE: ");
		  String playerTwo =sc.nextLine();
		  
    }
  
  
    static void fillBoard(){
	    for(int r=0;r<board.length;r++){
				 for(int c=0;c<board.length;c++){
					 
					 board[r][c]= " -- ";
					 		 
				 }
		   System.out.println("");
		}	
		
		
    }

        static void printBoard(){
			
			
			for(int r=0;r<board.length;r++){ 
				for(int c=0;c<board.length;c++){
					
					System.out.print(board[r][c]);
				}
				System.out.println(""); 
			}
		}


             static boolean checkFilled(){
			  	 for(int r=0;r<board.length;r++){
				    for(int c=0;c<board[r].length;c++){
					  
					   if(board[r][c]==" -- "){
						   System.out.println("THE BOARD IS EMTY");
						    return false;  
					   }	   					   
					 }
				 }
				  System.out.println("SPACE FILLED"); 
				 return true;
			 }
			 
		/*	static String checkWhoWon(){
				
			   if(board[0][0].equals(board[0][1]))&&(board[0][0].equals(board[0][2])){
				   return board[0][0];
			   }
                    if(board[1][0].equals(board[1][1]))&&(board[1][0].equals(board[1][2])){
					   return board[1][0];	
					}
                        if(board[2][0].equals(board[2][1]))&&(board[2][0].equals(board[2][2])){
							
						}					
			}*/
			 
			 


}








