package com.lxisoft.test;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Fileoperation;
import java.util.Scanner;
public class Tdd
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		
		
		boolean flag=true;
		
		do{

   			System.out.println("1 : Play movie \n2 : write dialogue\n3.exit\nEnter your choice:");
   			int num=scr.nextInt();
			switch(num)
			{
				case 1:
						try
						{
							Movie movie=new Movie();						
							movie.playScene();						
							
						}
						catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println("invalid number");
							
							
						}
						System.out.println("\n");
						break;
						
			
				case 2:

						Fileoperation fo=new Fileoperation();
						fo.writeIntoFile();						
						break;
				case 3:
						flag=false;break;


			}
						
		}while(flag);
				

	
 			
	}
}