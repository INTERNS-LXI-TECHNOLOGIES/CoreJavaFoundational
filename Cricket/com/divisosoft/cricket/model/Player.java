package com.divisosoft.cricket.model;

public class Player{

private String name;
private String age;
private String playerRanking;
private int battingScoreInThisGame;

public Player(String name,String age,String playerRanking,int battingScoreInThisGame)
{
	this.name = name;
	this.age = age;
	this.playerRanking = playerRanking;
	this.battingScoreInThisGame = battingScoreInThisGame;
	
	
}
  public void setName(String name){
	  
	  this.name = name;
  }

  public String getName(){
	  
	  return name;
	  
	  
  }
  
  public void setAge(String age){
	  
	  this.age = age;
  }

  public String getAge(){
	  
	  return age;
	  
	  
  }
  
  public void setPlayerRanking(String playerRanking){
	  
	  this.playerRanking = playerRanking;
  }

  public String getPlayerRanking(){
	  
	  return playerRanking;
	  
	  
  }
  
  public void setBattingScoreInThisGame(int battingScoreInThisGame){
	  
	  this.battingScoreInThisGame = battingScoreInThisGame;
  }

  public int getBattingScoreInThisGame(){
	  
	  return battingScoreInThisGame;
	  
	  
  }




}