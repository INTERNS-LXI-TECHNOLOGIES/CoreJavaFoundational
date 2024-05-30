package com.divisosoft.HungerGame.players;
import java.util.Scanner;

public class Players {
    Scanner scanner = new Scanner(System.in);
    PlayersView pView =new PlayersView();
    private String name;

    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void twoPlayers(ForestModel fModel) {
        pView.twoPlayerDetails(fModel);
		fModel.getDice().throwDice();
    }

    public void threePlayers(ForestModel fModel) {
        pView.threePlayerDetails(fModel);
		fModel.getDice().throwDice();
    }
}
