package com.lxisoft.cricketproject.controller;
import com.lxisoft.cricketproject.model.*;
import com.lxisoft.cricketproject.view.CountryView;
import com.lxisoft.cricketproject.view.TeamCreator;

public class CricketController {

    private String battingOrBowling;
    private int totalTeamAScore; 
	private int totalTeamBScore; 
	private String winningCountry;

    public int getTotalTeamAScore() {
        return totalTeamAScore;
    }

    public void setTotalTeamAScore(int totalTeamAScore) {
        this.totalTeamAScore = totalTeamAScore;
    }

    public int getTotalTeamBScore() {
        return totalTeamBScore;
    }

    public void setTotalTeamBScore(int totalTeamBScore) {
        this.totalTeamBScore = totalTeamBScore;
    }

    public String getBattingOrBowling() {
        return battingOrBowling;
    }

    Country c;

    public Country toss() {
        int x = 0;
        int y = 1;
        int z = (int) (Math.random() * 2);

        if (x == z) {
            Country c1 = new Country("India");
            c = c1;
        }

        if (y == z) {
            Country c2 = new Country("Pakistan");
            c = c2;
        }
        return c;
    }

    public void chooseBattingOrBowling() {
        if (toss() == c) {
            battingOrBowling = "batting";
        } else {
            battingOrBowling = "bowling";
        }
    }

    TeamCreator team = new TeamCreator();

    public void setTeamAScore() {
        this.totalTeamAScore = 0;

        for (int x = 0; x < 11; x++) {
            team.getPlayersA()[x].setScore((int) (Math.random() * 20));
            this.totalTeamAScore += team.getPlayersA()[x].getScore();
        }
        System.out.println("\n TEAM A SCORE:" + totalTeamAScore);
    }

    public void setTeamBScore() {
        this.totalTeamBScore = 0;

        for (int x = 0; x < 11; x++) {
            int i = (int) (Math.random() * 20);
            team.getPlayersB()[x].setScore(i);
            this.totalTeamBScore += team.getPlayersB()[x].getScore();
        }
        System.out.println("\n TEAM B SCORE:" + totalTeamBScore);
    }

    public void setTheWinner() {
        if (totalTeamAScore > totalTeamBScore) {
            winningCountry = team.getAteam().getCountryName();
            System.out.println(winningCountry + "\twon the match...........");
        } else {
            winningCountry = team.getBteam().getCountryName();
            System.out.println(winningCountry + "\twon the match..............");

        }
    }
}
