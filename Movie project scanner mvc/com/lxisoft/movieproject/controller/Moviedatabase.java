
package com.lxisoft.movieproject.controller;

import java.util.Scanner;
import com.lxisoft.movieproject.model.Movie;
import com.lxisoft.movieproject.view.View;

public class Moviedatabase{
	
	Scanner scanner = new Scanner(System.in);
		
	Movie[]  movie; 

	
		//private Movie movie;
		private View view;
	
		
		
		public void  database()
		{
			System.out.print("how many movies you want to print:");
			int number = Integer.parseInt(scanner.nextLine());
			movie=new Movie[number];
			for(int i=0;i<number;i++)
			{
			
			view = new View();
			
				
					movie[i]=view.addMovie();
					
					
			
			}
		}
		
		public void display()
		{
			for(int i=0;i<movie.length;i++)
			{
				System.out.print(movie[i]);
			}
		}
		
		
		
		public void search()
		{
		//Movie	movie=new Movie();
				System.out.print("\n\n enter the genre you want to search:");
				String genre =scanner.nextLine();
					
					for(Movie m : movie)
			{
							if(m.getGenre().equals(genre))
							{
								System.out.print(m);
							}
							
							
						}
		}		
		
		
		
			
} 


	
	


	
