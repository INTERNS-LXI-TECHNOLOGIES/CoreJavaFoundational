public class Movie
{
String name;
String director;
String producer;
String musicDirector;
String releaseDate;

Villian villian;

Hero[] hero = new Hero[2];
Heroine[] heroine = new Heroine[2];
Comedian[] comedian = new Comedian[2];

public Movie(String movieName, String movieDirector, String producer, String musicDirector, String releaseDate, Villian villian,Hero[] hero,Heroine[] heroine,Comedian[] comedian)
{
this.name = movieName;
this.director = movieDirector;
this.producer = producer;
this.musicDirector = musicDirector;
this.releaseDate = releaseDate;


this.villian = villian;
this.hero = hero;
this.heroine = heroine;
this.comedian = comedian;
}

public void showMovieDetails()
{
System.out.println("--------MOVIE DETAILS--------" + "\n");	
System.out.println("Movie Name:"  + "\t" + name);
System.out.println("Director:"  + "\t" + director);
System.out.println("Producer:"  + "\t" + producer);
System.out.println("Music Director:"  + "\t" + musicDirector );
System.out.println("Release Date:"  + "\t" + releaseDate);


villian.sayVillianDialogue();

heroine[0].sayHeroineDialogue();
heroine[1].sayHeroineDialogue();

hero[0].sayHeroDialogue();
hero[1].sayHeroDialogue();

comedian[0].sayComedianDialogue();
comedian[1].sayComedianDialogue();
}
}