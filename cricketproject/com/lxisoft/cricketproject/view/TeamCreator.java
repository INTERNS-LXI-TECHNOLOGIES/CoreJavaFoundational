package com.lxisoft.cricketproject.view;
import com.lxisoft.cricketproject.model.*;

public class TeamCreator {

    private Player[] aTeamPlayers = {
            new Player("Rohit Sharma",  0),
            new Player("Chahal", 0),
            new Player("Ishan Kishan", 0),
            new Player("Jadeja", 0),
            new Player("Kohli", 0),
            new Player("Yadav", 0),
            new Player("Shami", 0),
            new Player("Siraj", 0),
            new Player("Hardik Pandya",0),
            new Player("Axar Patel", 0),
            new Player("KL Rahul", 0)
    };

    private Player[] bTeamPlayers = {
            new Player("Steven Smith",  70),
            new Player("Sean Abbot", 56),
            new Player("Ashton Agar", 24),
            new Player("Nathan Ellis",  5),
            new Player("Alex Carey", 23),
            new Player("Travis Head", 43),
            new Player("Mitchell Marsh", 3),
            new Player("Glenn Maxwell", 52),
            new Player("David Warner", 95),
            new Player("Pat Cummins", 3),
            new Player("Richardson", 12)
    };

    private Country aTeam = new Country("India");
    private Country bTeam = new Country("Pakistan");


    public Player[] getPlayersA() {
        return aTeamPlayers;
    }

    public Player[] getPlayersB() {
        return bTeamPlayers;
    }

    public Country getAteam() {
        return aTeam;
    }

    public Country getBteam() {
        return bTeam;
    }
}
