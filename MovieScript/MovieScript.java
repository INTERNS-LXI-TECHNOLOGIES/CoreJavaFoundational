public class MovieScript
{
String movieName;
String movieDirector;
String musicDirector;
String releaseDate;
String movieGenre;


Villan villan;

Hero[] hero = new Hero[3];

Heroine[] heroine = new Heroine[3];


Comedian[] comedian = new Comedian[3];

public MovieScript(String movieName,String movieDirector,String musicDirector,String releaseDate,String movieGenre)
{

this.movieName = movieName;
this.movieDirector = movieDirector;
this.musicDirector = musicDirector;
this.releaseDate = releaseDate;
this.movieGenre = movieGenre;

}

void printmovieScript()
{
System.out.println("............MOVIE SCRIPT...........\n");
System.out.println("Movie Name:" + "\t" + movieName); 
System.out.println("Movie Director:" + "\t" + movieDirector);
System.out.println("Music Director:" + "\t" + musicDirector);
System.out.println("Release Date:" + "\t" + releaseDate);
System.out.println("Movie Genre:" + "\t" + movieGenre); 


for(int i=1; i<3; i++)
{
System.out.println("\n............HERO"+i +"...........\n");
hero[i].printHero();
hero[i].sayDialogue();

System.out.println("\n............HEROINE"+i +"...........\n");
heroine[i].printHeroine();
heroine[i].sayDialogue();

System.out.println("\n............COMEDIAN"+i +"...........\n");
comedian[i].printComedian();
comedian[i].sayDialogue();
}
System.out.println("\n............VILLAN...........\n");
villan.printVillan();
villan.sayDialogue();

}
}