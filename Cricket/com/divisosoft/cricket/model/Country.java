package com.divisosoft.cricket.model;

public class Country {

    private String countryName;
    private String ranking;
    private String coach;

    private Player[] playersA = new Player[11];
    private Player[] playersB = new Player[11];

    public Country(String countryName, String ranking, String coach, Player[] aTeamPlayers) {
        this.countryName = countryName;
        this.ranking = ranking;
        this.coach = coach;
        this.playersA = aTeamPlayers;
        this.playersB = aTeamPlayers;

    }

    public Country(String name) {
        this.countryName = name;
    }

    public void setCountryName(String countryName) {

        this.countryName = countryName;
    }

    public String getCountryName() {

        return countryName;

    }

    public void setRanking(String ranking) {

        this.ranking = ranking;
    }

    public String getRanking() {

        return ranking;

    }

    public void setCoach(String coach) {

        this.coach = coach;
    }

    public String getCoach() {

        return coach;

    }

    public Player[] getPlayersA() {

        return playersA;

    }

    public Player[] getPlayersB() {

        return playersB;

    }

}
