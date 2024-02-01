package cricketgameproject.com.lxi.cricketgame.model;

public class Team
{
  

    private Player[] aTeamPlayers={
        new Player("kholi",3),
        new Player("kholi",6),
        new Player("kholi",4),
        new Player("kholi",3),
        new Player("kholi",6),
        new Player("kholi",3),
        new Player("kholi",6),
        new Player("kholi",3),
        new Player("kholi",6),
        new Player("kholi",3),
        new Player("kholi",6),
    };
    
        private Player[] bTteamPlayers={
            new Player("dhoni",4),
            new Player("dhoni",5),
            new Player("dhoni",6),
            new Player("dhoni",4),
            new Player("dhoni",5),
            new Player("dhoni",4),
            new Player("dhoni",5),
            new Player("dhoni",4),
            new Player("dhoni",5),
            new Player("dhoni",4),
            new Player("dhoni",5),
        };
        
    Country aTeam = new Country("India", "2", aTeamPlayers) ;
    
   
    Country bTeam = new Country("Africa", "4",  bTteamPlayers) ;
    public Player[] getaTeamPlayers() {
        return aTeamPlayers;
    }
    public void setaTeamPlayers(Player[] aTeamPlayers) {
        this.aTeamPlayers = aTeamPlayers;
    }
    public Player[] getbTteamPlayers() {
        return bTteamPlayers;
    }
    public void setbTteamPlayers(Player[] bTteamPlayers) {
        this.bTteamPlayers = bTteamPlayers;
    }
    public Country getaTeam() {
        return aTeam;
    }
    public void setaTeam(Country aTeam) {
        this.aTeam = aTeam;
    }
    public Country getbTeam() {
        return bTeam;
    }
    public void setbTeam(Country bTeam) {
        this.bTeam = bTeam;
    }


}
