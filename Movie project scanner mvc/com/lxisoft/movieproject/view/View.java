package com.lxisoft.movieproject.view;
import java.util.Scanner;
import com.lxisoft.movieproject.model.Movie;
import com.lxisoft.movieproject.controller.Moviedatabase;

public class View
	{
		
	Scanner scanner = new Scanner(System.in);
	Moviedatabase moviedatabase = new Moviedatabase();

	public  void show(){
		
		//Scanner scanner = new Scanner(System.in);
		System.out.print("\n\n \t\t***** MOVIE *****");
		for(int i=0;i<4;i++)
		{
			
		System.out.println("\n\n 1.Add movie \n\n 2.Display all movies \n\n 3.Search movies bye genre \n\n 4.Exit");	
		String a =  scanner.nextLine();
		int option = Integer.parseInt(a);
		
		switch(option)
		{
			case 1: 
		
				moviedatabase.database();
				//addMovie();
							break;

			case 2:
				moviedatabase.display();
								break;

			case 3:
				moviedatabase.search();
				
				default:System.out.print("something went wrong");
				break;
			
			
			
			
		}
		}
		
	}
	
	
	public Movie addMovie(){
		
		Movie movie = new Movie();
		
		System.out.println("Enter movie name:");
		String name = scanner.nextLine();
		movie.setTitle(name);
			
			
		System.out.println("Enter movie genre:");
		name = scanner.nextLine();
		movie.setGenre(name);
			
			
		System.out.println("Enter movie rating:");
		double rating =Double.parseDouble(scanner.nextLine());
		movie.setRating(rating);
		
		
		return movie;
		
	}
	
	
	
}
	
