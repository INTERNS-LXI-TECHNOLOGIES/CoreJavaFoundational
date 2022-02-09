package com.lxisoft.movie;
import java.util.Scanner;

import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Villan;


enum Genre{

ACTION,COMEDY,ROMANTIC,THRILLER;


}



public class Movie  {

	Scanner sc = new Scanner(System.in);
 

 private String name;
 private Genre genre;
private String language;
private String director;
public int heroNo;
public int heroineNo;
public  int comedianNo;
public int villanNo;
int number;
int sum;



public String[] actors=new String[100];

Script script = new Script();




 public String getName()   {
	 return name;
 }
 public void setName(String newName)  {
	 this.name = newName;
 }
 
 
 public Genre getGenre() {
	 return genre;
 }
 public void setGenre(Genre newGenre)  {
	 this.genre = newGenre;
 }
 
 
 
 public String getLanguage()  {
	 return language;
 }
 public void setLanguage(String newLanguage)   {
	 this.language = newLanguage;
 }
 

public String getDirector()  {
	 return director;
 }
 public void setDirector(String newDirector)   {
	 this.director = newDirector;
 }
 
 
 public void movieDetails()   {
	 
	 
	 System.out.println("\t\t\t\t\t\t\tMOVIE DETAIL");
	 System.out.println("\t\t\t\t\t\t-------------------------");
		System.out.println("\t\tMovie Types");
		System.out.println("\t\t____________________");
		System.out.println("\n");

		System.out.println("1 = Action");
		System.out.println("2 = Romantic");
		System.out.println("3 = Comedy");
		System.out.println("4 = Thriller");
		System.out.println("\n");

		System.out.println("Enter The Number of Genre Type ");
		 number= sc.nextInt();

			sc.nextLine();

			switch  (number)  {

case 1 :

 Genre genreAction = Genre.ACTION;
	genre =genreAction;

break;


case 2: 

Genre genreRomantic = Genre.ROMANTIC;
genre =genreRomantic;

break;


case 3:

Genre genreComedy = Genre.COMEDY;
genre =genreComedy;

break;


case 4:

Genre genreThriller = Genre.THRILLER;
genre =genreThriller;

break;
	

			}


		System.out.println("Enter The Name Of Movie");
		name = sc.nextLine();
		System.out.println("\n");
	 System.out.println("only 1 Language available");
		System.out.println("*MALAYALAM");
		System.out.println("Select MALAYALAM Language Press 1 ");
		System.out.println("\n");
		System.out.println("Enter Number");
		number = sc.nextInt();
sc.nextLine();

if (number ==1)  {

language = ("MALAYALAM");

}

		if(number != 1)   {

			System.out.println("You Are Selected Wrong Number Press 1");

		}


		System.out.println("Enter The Director Name");
		director = sc.nextLine();


		System.out.println("\t\tName :" + this.name); 
	 System.out.println("\t\tDirctor :" + this.director);
		System.out.println("\t\tGenre :"+ this.genre);
		System.out.println("\t\tLanguage :" +this.language);
	 System.out.println("\n");
	
	System.out.println("\t\t\t\t\t\t\tACTORS DETAILS");
	System.out.println("\t\t\t\t\t\t______________________________");
	System.out.println("\n");



	System.out.println("Enter the number of Hero :");
heroNo = sc.nextInt();
sc.nextLine();

	for (int i = 1; i <=  heroNo; i ++)  {

		Hero hero = new Hero();

		System.out.println("Enter" +i +" Hero name :");
		hero.setName( sc.nextLine());

		System.out.println("Enter" + i + "Hero Character Name");
		hero.setCharacterName(sc.nextLine());

actors[i] = hero.getCharacterName();



		hero.actorDetails();

		System.out.println("\n");

	}


	System.out.println("Enter the Number of Heroine :");
heroineNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= heroineNo; i ++)  {

Heroine heroine = new Heroine();

System.out.println("Enter" + i + "Heroine Name :");
heroine.setName(sc.nextLine());
System.out.println("Enter"+i+"Character Name :");
heroine.setCharacterName(sc.nextLine());
System.out.println("\n");

actors[heroNo + i] = heroine.getCharacterName();

heroine.actorDetails();
System.out.println("\n");

}


System.out.println("Enter the Number of Comedian :");
comedianNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= comedianNo; i ++)  {

	Comedian comedian = new Comedian();

	System.out.println("Enter" + i + "Comedian Name :");
	comedian.setName(sc.nextLine());
	System.out.println("Enter" + i + "Comedian Character Name :");
	comedian.setCharacterName(sc.nextLine());

actors[heroNo + heroineNo + i] = comedian.getCharacterName();


	comedian.actorDetails();
	System.out.println("\n");

}


System.out.println("Enter the Number of Villan :");
villanNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= villanNo; i ++)  {

Villan villan = new Villan();

System.out.println("Enter" + i + "Villan Name ");
villan.setName(sc.nextLine());
System.out.println("Enter" + i + "Villan Character Name :");
villan.setCharacterName(sc.nextLine()); 

actors[heroNo + heroineNo + comedianNo +i] = villan.getCharacterName();

villan.actorDetails();
System.out.println("\n");

}

sum = heroNo + heroineNo + comedianNo + villanNo;

for (int i = 1; i<= sum; i ++ )  {


}

script.getSceneNo(); 


 }	 


}