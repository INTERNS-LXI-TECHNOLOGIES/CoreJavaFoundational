package com.lxisoft.cast;

public class Actors extends Cast
{
	
	String heroName,heroineName,comedianName;   //real names of actors
	
	String heroCharName,heroineCharName,comedianCharName; // character name of actors in the movie
	
	//Setters
	
	public void setHeroName(String heroName)
	{
		this.heroName=heroName;
	}
	
	public void setHeroineName(String heroineName)
	{
		this.heroineName=heroineName;
	}
	
	public void setComedianName(String comedianName)
	{
		this.comedianName=comedianName;
	}
	
	public void setHeroCharName(String heroCharName)
	{
		this.heroCharName=heroCharName;
	}
	
	public void setHeroineCharName(String heroineCharName)
	{
		this.heroineCharName=heroineCharName;
	}
	
	public void setComedianCharName(String comedianCharName)
	{
		this.comedianCharName=comedianCharName;
	}
	
	//Getters
	
	public String getHeroName()
	{
		return heroName;
	}
	
	public String getHeroineName()
	{
		return heroineName;
	}
	
	public String getComedianName()
	{
		return comedianName;
	}
	
	
	
	public String getHeroCharName()
	{
		return heroCharName;
	}
	
	public String getHeroineCharName()
	{
		return heroineCharName;
	}
	
	public String getComedianCharName()
	{
		return comedianCharName;
	}
	
}