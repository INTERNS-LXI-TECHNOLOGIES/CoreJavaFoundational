package com.lxisoft.cricketproject.test;
import com.lxisoft.cricketproject.view.CountryView;
import com.lxisoft.cricketproject.controller.*;
import com.lxisoft.cricketproject.model.Country;

public class Main{
public static void main(String[] args){
 CountryView view = new CountryView();

 view.playerDisplay();
 CricketController controller = new CricketController();
 Country countryWonTheToss= controller.toss();
 System.out.println(countryWonTheToss.getCountryName()+" won the toss");
 
 controller.chooseBattingOrBowling();

 System.out.println(countryWonTheToss.getCountryName()+" choose" + controller.getBattingOrBowling() );
   
}
}