package com.lxisoft.movieproject.model;

public class Movie{
	
private String title;
private String genre;
private double rating;
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
 
	public String getTitle()
	{
		return title;
	}
	
	
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
 
	public String getGenre()
	{
		return genre;
	}
	
	
	public void setRating(double rating) 
	{
		this.rating = rating;
	}
 
	public double getRating()
	{
		return rating;
	}
	
	public String toString(){
		
		return "\n"+title+"\n"+genre+"\n"+rating;
		
	}
}
