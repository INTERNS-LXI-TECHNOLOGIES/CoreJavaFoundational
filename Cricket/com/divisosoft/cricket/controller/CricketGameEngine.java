package com.divisosoft.cricket.controller;

import com.divisosoft.cricket.controller.CricketGameEngine;
import com.divisosoft.cricket.config.*;
import com.divisosoft.cricket.model.*;

public class CricketGameEngine {

	private TeamCreator team = new TeamCreator();
	private String battingOrBowling;

	private int totalTeamAScore;
	private int totalTeamBScore;
	private String winningCountry;

	public TeamCreator getTeam() {

		return team;
	}

	public int gettotalTeamAScore() {

		return totalTeamAScore;
	}

	public int gettotalTeamBScore() {

		return totalTeamBScore;
	}

	public String getWinningCountry() {

		return winningCountry;
	}

	Country c;

	public Country toss() {

		int x = 0;
		int y = 1;
		int z = (int) (Math.random() * 2);
		if (y == z) {
			Country country1 = new Country("India");
			c = country1;
		}

		if (x == z) {
			Country country2 = new Country("Australia");
			c = country2;
		}
		return c;

	}

	public String getBattingOrBowling() {
		return battingOrBowling;
	}

	public void chooseBattingOrBowling() {

		if (toss() == c) {
			battingOrBowling = "batting";
		} else {
			battingOrBowling = "bowling";
		}

	}

	public void setTeamAScore() {

		for (int x = 0; x < 11; x++) {

			team.aTeamPlayers[x].setBattingScoreInThisGame((int) (Math.random() * 200));
			totalTeamAScore = totalTeamAScore + team.aTeamPlayers[x].getBattingScoreInThisGame();
		}

		System.out.println("\n TEAM A SCORE:" + totalTeamAScore);

	}

	public void setTeamBScore() {

		for (int x = 0; x < 11; x++) {

			team.bTeamPlayers[x].setBattingScoreInThisGame((int) (Math.random() * 200));
			totalTeamBScore = totalTeamBScore + team.bTeamPlayers[x].getBattingScoreInThisGame();
		}

		System.out.println("\n TEAM B SCORE:" + totalTeamBScore);

	}

	public void setTheWinner() {

		if (totalTeamAScore > totalTeamBScore) {
			winningCountry = team.aTeam.getCountryName();
		} else {
			winningCountry = team.bTeam.getCountryName();

		}

	}

}
