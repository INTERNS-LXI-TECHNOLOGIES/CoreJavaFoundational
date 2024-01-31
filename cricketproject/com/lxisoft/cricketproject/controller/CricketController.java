package com.lxisoft.cricketproject.controller;
import com.lxisoft.cricketproject.model.*;
import com.lxisoft.cricketproject.view.CountryView;

public class CricketController {

    private String battingOrBowling;

    public String getBattingOrBowling()
    {
      return battingOrBowling;
    }

    Country c;

public Country toss(){
    int x = 0;
    int y = 1;
  int z = (int) (Math.random()*2); 

if(x==z){
Country c1 = new Country("India");
c = c1;
}

if(y==z){
Country c2 = new Country("Pakistan");
c = c2;

}
return c;
}


public void chooseBattingOrBowling(){
   
if(toss()==c)
{
    battingOrBowling="batting";
}

else
{
    battingOrBowling="bowling";
}
}
}