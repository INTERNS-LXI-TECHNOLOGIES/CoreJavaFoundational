package cricketgameproject.com.lxi.cricketgame.main;

import cricketgameproject.com.lxi.cricketgame.controller.TeamController;
import cricketgameproject.com.lxi.cricketgame.model.Country;

public class Test {
    
    public static void main(String[] args) {
        
        TeamController teamController=new TeamController();
        Country count=teamController.toss();
        System.out.println("The team "+ count.getCountry()+" has won the toss ");
        teamController.choosBatingOrBowling() ;
        System.out.println("The team "+ count.getCountry()+" has decided to "+ teamController. getBattingOrBowling());
        teamController.setTeamAScore() ;
        teamController.setTeamBScore() ;
        teamController.setTheWinner() ;
        
        System.out.println("The team"+teamController.getWinningCountry()+" won the game ");

    }

}
