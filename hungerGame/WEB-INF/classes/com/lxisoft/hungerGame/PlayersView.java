/*package com.divisosoft.HungerGame.players;
import com.divisosoft.HungerGame.forest.ForestModel;
import com.divisosoft.HungerGame.dice.Dice;
import com.divisosoft.HungerGame.players.Players;*/
import java.util.Scanner;

public class PlayersView {
	RollDicePlayer1 player1Roll;
	RollDicePlayer2 player2Roll;
	RollDicePlayer3 player3Roll;
    Scanner scanner = new Scanner(System.in);

    public void twoPlayerDetails(ForestModel fModel) {
        System.out.print(" ENTER PLAYER 1 NAME: ");
        String player1Name=scanner.nextLine();
        fModel.getPlayer()[0].setName(player1Name);

        System.out.print(" ENTER PLAYER 2 NAME: ");
        String player2Name=scanner.nextLine();
        fModel.getPlayer()[1].setName(player2Name);

        System.out.println("	--> CREATED PLAYERS NAME SUCCESSFULLY <--	\n");
		player1Roll.throwDice1();
		
    }

    public void threePlayerDetails(ForestModel fModel) {
        System.out.print(" ENTER PLAYER 1 NAME: ");
        String player1Name=scanner.nextLine();
        fModel.getPlayer()[0].setName(player1Name);

        System.out.print(" ENTER PLAYER 2 NAME: ");
        String player2Name=scanner.nextLine();
        fModel.getPlayer()[1].setName(player2Name);

        System.out.print(" ENTER PLAYER 3 NAME: ");
        String player3Name=scanner.nextLine();
        fModel.getPlayer()[2].setName(player3Name);

        System.out.println("	--> CREATED PLAYERS NAME SUCCESSFULLY <--	\n");
		
    }
}
