package com.divisosoft.cricket.test;

import com.divisosoft.cricket.controller.CricketGameEngine;
import com.divisosoft.cricket.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\t   ---------------------------------------Welcome to Cricket Game-------------------------------------------------\n");
        System.out.println(
                "\t   ---------------------------------------------------2024 WORLDCUP --------------------------------------------------------------\n");
        CricketGameEngine engine = new CricketGameEngine();
        Country countryWonTheToss = engine.toss();
        System.out.println("The team " + countryWonTheToss.getCountryName() + " has won the toss ");
        engine.chooseBattingOrBowling();
        System.out.println(
                "The team " + countryWonTheToss.getCountryName() + " has decided to " + engine.getBattingOrBowling());
        engine.setTeamAScore();

        engine.setTeamBScore();

        engine.setTheWinner();

        System.out
                .println("\t          The team" + " " + engine.getWinningCountry() + " won the game.......!!!! ");

    }
}