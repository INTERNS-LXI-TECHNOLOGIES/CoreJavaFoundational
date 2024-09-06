/*package com.divisosoft.HungerGame.forest;
import com.divisosoft.HungerGame.players.Players;
import com.divisosoft.HungerGame.dice.Dice;
import com.divisosoft.HungerGame.dice.RollDicePlayer1;
import com.divisosoft.HungerGame.dice.RollDicePlayer2;
import com.divisosoft.HungerGame.dice.RollDicePlayer3;*/
import java.util.Scanner;

public class ForestModel{
	Scanner scanner=new Scanner(System.in);
	private Players[] player=new Players[3];
	private Dice dice = new Dice();
	boolean page=true;
	
	public ForestModel(){
        for (int i = 0; i < player.length; i++) {
            player[i] = new Players();
        }
    }
	
	public Players[] getPlayer() {
        return player;
    }
	public void setPlayer(Players[] player) {
        this.player = player;
    }
	
	public Dice getDice(){
		return dice;
	}
	public void setDice(Dice dice){
		this.dice=dice;
	}
	
	public void showMethod(){
		while(page){
			System.out.println("\n	----------> HUNGER GAME <----------	\n");	
			System.out.println("	~~~~~~~~~> LET'S START THE GAME<~~~~~~~~~	\n");	
			System.out.print(" CHOOSE NUMBER OF PLAYERS: 2 -- 3 -- [PRESS:- 0 TO EXIT]: ");
			int choice=scanner.nextInt();
			scanner.nextLine();			
			
			for(int i=0;i<getPlayer().length;i++){
				switch(choice){
					case 2:
                        if (i==0){
							getPlayer()[i].twoPlayers(this);
							
                            break;
                        }
                    case 3:
                        if (i==0){
                            getPlayer()[i].threePlayers(this);
                            break;
                        }
					case 0: 
					page=false;
					break;
						
					default:
					System.out.println(choice+" CONTESTANDS CANNOT BE PLAYED ON THIS GAME");
					page=false;
					break;
				}
				break;
			}
		}
	}
}