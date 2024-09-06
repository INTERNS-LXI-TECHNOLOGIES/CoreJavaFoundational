import java.util.Scanner;

public class Players{
	Scanner scanner=new Scanner(System.in);

	public void playerDetails(){
		System.out.print("ENTER PLAYER 1 NAME: ");
		String playerName1=scanner.nextLine();
		
		System.out.print("ENTER PLAYER 2 NAME: ");
		String playerName2=scanner.nextLine();
		
		for(int i=0;i<cell.getPlayer.length;i++){
			if(cell.getPlayer[i]==null && cell.getPlayer[i]<2){
				player[i]=new Players();
				cell.setPlayer(playerName1);
				cell.setPlayer(playerName2);
			}
		}
	}
}

/*public void playerDetails(){
	if()
		System.out.print("ENTER PLAYER 1 NAME: ");
		String playerName1=scanner.nextLIne();
		
		System.out.print("ENTER PLAYER 2 NAME: ");
		String playerName2=scanner.nextLIne();
		
		System.out.print("ENTER PLAYER 3 NAME: ");
		String playerName3=scanner.nextLIne();
		
		System.out.print("ENTER PLAYER 4 NAME: ");
		String playerName4=scanner.nextLIne();
		
		System.out.print("ENTER PLAYER 5 NAME: ");
		String playerName5=scanner.nextLIne();
		
		switch(cell.getPlayers.length){
			case getPlayers[i]==null && getPlayers[i]<!=1 :
			setPlayers(playerName1);
			break;
			
			case getPlayers[i]==null && getPlayers[i]<!=2 :
			setPlayers(playerName2);
			break;
			
			case getPlayers[i]==null && getPlayers[i]<!=3 :
			setPlayers(playerName3);
			break;
			
			case getPlayers[i]==null && getPlayers[i]<!=4 :
			setPlayers(playerName4);
			break;
			
			case getPlayers[i]==null && getPlayers[i]<!=4 :
			setPlayers(playerName5);
			break;
		}
	}
}*/