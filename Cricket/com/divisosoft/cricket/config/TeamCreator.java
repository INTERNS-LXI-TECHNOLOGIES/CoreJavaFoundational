package com.divisosoft.cricket.config;

import com.divisosoft.cricket.model.*;

public class TeamCreator {

    public Player[] aTeamPlayers = { new Player("Rohit sharma", "27", "21", 0),
            new Player("chahal", "26", "20", 0),
            new Player("Ishan kishan", "21", "23", 0),
            new Player("Jadeja", "26", "21", 0),
            new Player("Kohli", "29", "34", 0),
            new Player("yadav", "23", "32", 0),
            new Player("shami", "30", "21", 0),
            new Player("siraj", "21", "23", 0),
            new Player("Hardhik pandya", "25", "26", 0),
            new Player("Axar patel", "26", "21", 0),
            new Player("Kl Rahul", "24", "32", 0)

    };

    public Player[] bTeamPlayers = { new Player("Steven smith", "33", "23", 70),
            new Player("sean Abbot", "30", "32", 56),
            new Player("Ashton Agar", "29", "26", 24),
            new Player("Nathan ellis", "28", "29", 5),
            new Player("Alex Carey", "25", "31", 23),
            new Player("Travis Head", "33", "35", 43),
            new Player("Mitchel marshal", "30", "13", 3),
            new Player("Glenn Maxwell", "34", "29", 52),
            new Player("David Warner", "35", "50", 95),
            new Player("pat cummins", "23", "25", 3),
            new Player("Richardsons", "28", "41", 12)

    };
    public Country aTeam = new Country("India", "2", "Ravi Shashtri", aTeamPlayers);
    public Country bTeam = new Country("Australia", "4", "Ian John", bTeamPlayers);

}