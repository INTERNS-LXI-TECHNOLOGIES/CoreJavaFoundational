package cricketgameproject.com.lxi.cricketgame.controller;

import cricketgameproject.com.lxi.cricketgame.model.Country;
import cricketgameproject.com.lxi.cricketgame.model.Team;

public class TeamController {
  
    private int  teamAtotalScore;
	private int teamBtotalScore;
    private String battingOrBowling;
    private String winningCountry;

    Team team=new Team();



public int getTeamAtotalScore() {
        return teamAtotalScore;
    }


    public void setTeamAtotalScore(int teamAtotalScore) {
        this.teamAtotalScore = teamAtotalScore;
    }


    public int getTeamBtotalScore() {
        return teamBtotalScore;
    }


    public void setTeamBtotalScore(int teamBtotalScore) {
        this.teamBtotalScore = teamBtotalScore;
    }


    public String getBattingOrBowling() {
        return battingOrBowling;
    }


    public void setBattingOrBowling(String battingOrBowling) {
        this.battingOrBowling = battingOrBowling;
    }


    public String getWinningCountry() {
        return winningCountry;
    }


    public void setWinningCountry(String winningCountry) {
        this.winningCountry = winningCountry;
    }


    public Country getI() {
        return i;
    }


    public void setI(Country i) {
        this.i = i;
    }


Country i;
public Country toss()
	{

    int a=0;
    int b=1;
    int c=(int)(Math.random()*2);

    if(c==a)
    {
        Country country1=new Country("india");
        i=country1;
    }
    if(c==b)
    {
        Country country2=new Country("africa");
        i=country2;
    }

        return i;


	}


    public void choosBatingOrBowling()
    {

        int toss=0;
        int toos1=1;
        int toos2=(int)Math.random()*2;

        if(toos2==toss)
        {
            battingOrBowling="batting";

        }
        if(toos2==toos1)
        {
            battingOrBowling="bowling";
        }

    }


    public void setTeamAScore()

	{
    for(int i =0;i<11;i++)
    {
    int toss2=(int)(Math.random()*100);
    
    team.getaTeamPlayers()[i].setScore(toss2);
    teamAtotalScore=teamAtotalScore+team.getaTeamPlayers()[i].getScore();
    }
   
System.out.println(teamAtotalScore);
}

public void setTeamBScore()
{
for(int i =0;i<11;i++)
    {
    int toss2=(int)(Math.random()*100);
    
    team.getbTteamPlayers()[i].setScore(toss2);
    teamBtotalScore=teamBtotalScore+team.getbTteamPlayers()[i].getScore();
    }
   
System.out.println(teamBtotalScore);
}

public void setTheWinner()
{

if(teamAtotalScore<teamBtotalScore)
{

winningCountry=team.getaTeam().getCountry();
}
else
{
    winningCountry=team.getbTeam().getCountry();
    }


}
}
