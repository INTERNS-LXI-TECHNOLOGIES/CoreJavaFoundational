 package cricketgameproject.com.lxi.cricketgame.model;

 public class Country {

    private String country;
    private String name;
    private Player[] team=new Player[11];

    
    public Country(String country, String name, Player[] team) {
        this.country = country;
        this.name = name;
        this.team = team;
    }

    public Country(String country) {
        this.country=country;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Player[] getTeam() {
        return team;
    }
    public void setTeam(Player[] team) {
        this.team = team;
    }

    
    
}