import java.util.Scanner;

public class Tdd{
	public static void main(String [] args){
	Scanner scanner=new Scanner(System.in);
	boolean page=true;
	Forest forest= new Forest();
	
	while (page){
		System.out.println("	LET'S START THE GAME	\n");
		
		System.out.print("CHOOSE NUMBER OF PLAYERS: 2 -- 3 -- 4 -- 5");
		int choice=scanner.nextInt();
		
		switch(choice){
			case 2:
			//forest.player =new p1();
			//forest.player.playerDetails();
			forest.startMethod();
		}
	}
	
	
	}
}
