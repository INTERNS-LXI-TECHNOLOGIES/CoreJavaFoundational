package com.divisosoft.HungerGame.dice;
import com.divisosoft.HungerGame.forest.ForestModel;
import java.util.Scanner;

public class RollDicePlayer3 implements Dice{
	Scanner scanner = new Scanner(System.in);
	private ForestModel fModel;
	boolean startAgain=true;

    public RollDicePlayer3(ForestModel fModel) {
        this.fModel = fModel;
    }
	
	public void throwDice(){
		while(startAgain){
			
			System.out.print(" PRESS 'T' TO THROW DICE: ");
			String choice=scanner.nextLine();
			if(choice.equalsIgnoreCase("T")){
				int dice=(int)(Math.random()*6)+1;
				System.out.println(" YOU ROLLED TO: " + dice);
				if(dice==1 || dice==6){
					System.out.println(" "+fModel.getPlayer()[2].getName()+" YOU CAN START THE GAME");
					startAgain=false;
				}
				else{
					System.out.println(" YOU HAVE TO GET EITHER '1 OR 6' TO START THE GAME");
				}
			}
			else{
				System.out.println(" WRONG CHOICE");
			}
		}
	}
}