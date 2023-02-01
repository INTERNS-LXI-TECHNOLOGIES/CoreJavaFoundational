public class Movie
{
String name;
String director;
String producer;
String musicDirector;
String releaseDate;

String[] dialogues = new String[22];

public Movie(String name, String director, String producer, String musicDirector, String releaseDate)
{
	
this.name = name;
this.director = director;
this.producer = producer;
this.musicDirector = musicDirector;
this.releaseDate = releaseDate;
}

Villian villian = new Villian("Prakash raj", "Muthupandi");

Hero hero1 = new Hero("Surya", "Deva");

Hero hero2 = new Hero("Vijay", "Jay");

Heroine heroine1 = new Heroine("Tamanna", "Anjali");

Heroine heroine2 = new Heroine("Asin", "Kalpana");

Comedian comedian1 = new Comedian("Vadivelu", "Velayudhan");

Comedian comedian2 = new Comedian("Vivek", "Maarimuthu");


void insertDialogue()
{

dialogues[0] = "I'm gonna kill you";
dialogues[1] = "You are going to die";
dialogues[2] = "This time i am not gonna leave you";
dialogues[3] = "I promise you that this time i will be with you";
dialogues[4] = "Come outside";
dialogues[5] = "I am waiting outside";
dialogues[6] = "You are my best decision";
dialogues[7] = "This is the right time";
dialogues[8] = "That was much more than i expected";
dialogues[9] = "I wish you could be with me";
dialogues[10] = "But why?";
dialogues[11] = "I will be back in a minute";
dialogues[12] = "For me too";
dialogues[13] = "I know";
dialogues[14] = "This is not too much";
dialogues[15] = "Im a joke to you?";
dialogues[16] = "This is not funny";
dialogues[17] = "I am gonna show you";
dialogues[18] = "Oh no! what is happening?";
dialogues[19] = "This guy is mad";
dialogues[20] = "Come....come";
dialogues[21] = "I will show you";

}


public void showMovieDetails()
{
System.out.println("--------MOVIE DETAILS--------" + "\n");	
System.out.println("Movie Name:"  + "\t" + name);
System.out.println("Director:"  + "\t" + director);
System.out.println("Producer:"  + "\t" + producer);
System.out.println("Music Director:"  + "\t" + musicDirector );
System.out.println("Release Date:"  + "\t" + releaseDate);

hero1.sayHeroDialogue(dialogues);
hero2.sayHeroDialogue(dialogues);

heroine1.sayHeroineDialogue(dialogues);
heroine2.sayHeroineDialogue(dialogues);

comedian1.sayComedianDialogue(dialogues);
comedian2.sayComedianDialogue(dialogues);

villian.sayVillianDialogue(dialogues);

}	
}
