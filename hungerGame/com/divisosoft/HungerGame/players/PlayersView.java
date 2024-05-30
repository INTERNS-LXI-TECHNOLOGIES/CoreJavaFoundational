package com.divisosoft.HungerGame.players;
import java.util.Scanner;

public class PlayersView {
    Scanner scanner = new Scanner(System.in);

    public void twoPlayerDetails(ForestModel fModel) {
        System.out.print(" ENTER PLAYER 1 NAME: ");
        String player1Name=scanner.nextLine();
        fModel.getPlayer()[0].setName(player1Name);

        System.out.print(" ENTER PLAYER 2 NAME: ");
        String player2Name=scanner.nextLine();
        fModel.getPlayer()[1].setName(player2Name);

        System.out.println("	--> CREATED PLAYERS NAME SUCCESSFULLY <--	\n");
		fModel.getDice().throwDice();
		fModel.getDice().throwDice();
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
