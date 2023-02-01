public class Movie
{
String movieName;
String movieDirector;
String musicDirector;
String releaseDate;
String movieGenre;

String[] dialogues = new String[18];

public Movie(String movieName,String movieDirector,String musicDirector,String releaseDate,String movieGenre)
{

this.movieName = movieName;
this.movieDirector = movieDirector;
this.musicDirector = musicDirector;
this.releaseDate = releaseDate;
this.movieGenre = movieGenre;

}
Hero surya = new Hero("Surya","Advct. Chandru");
Hero vijay = new Hero("Vijay","Soldier Sidharth");
Heroine kajal = new Heroine("Kajal","Dr.Varsha");
Heroine thammanna = new Heroine("Thammanna","College Student Meera");
Comedian santhanam = new Comedian("Santhanam","Boss Kumar");
Comedian suraj = new Comedian("Suraj","Dhashamoolam Dhamu");
Villan prakashRaj = new Villan("PrakashRaj","Smuggler Raja Reddy");

void printmovie()
{
System.out.println("............MOVIE DETAILS.........\n");
System.out.println("Movie Name:" + "\t" + movieName); 
System.out.println("Movie Director:" + "\t" + movieDirector);
System.out.println("Music Director:" + "\t" + musicDirector);
System.out.println("Release Date:" + "\t" + releaseDate);
System.out.println("Movie Genre:" + "\t" + movieGenre); 

System.out.println("\n");
System.out.println("...........MOVIE CHARACTER DETAILS.......\n");

System.out.println("\n............HERO 1..........\n");
surya.printHero(dialogues);

System.out.println("\n............HERO 2.......\n"); 
vijay.printHero(dialogues);

System.out.println("\n..........HEROINE 1......\n");
kajal.printHeroine(dialogues);


System.out.println("\n.......HEROINE 2.......\n");
thammanna.printHeroine(dialogues);

System.out.println("\n............COMEDIAN 1......\n");
santhanam.printComedian(dialogues);

System.out.println("\n............COMEDIAN 2......\n");
suraj.printComedian(dialogues);

System.out.println("\n............VILLAN..............\n");
prakashRaj.printVillan(dialogues);

settingDialogue();

}
public void settingDialogue()
{

dialogues[0] = "i don't believe in luck...";
dialogues[1] = "i believe in truth...";
dialogues[2] = "Law is a very powerful weapon...";
dialogues[3]= "Just remember that...!!";
dialogues[4]= "Don't run back girls and buses...";
dialogues[5] = "Don't judge a book by it's cover....";
dialogues[3] = "hiii...";
dialogues[4] = "hloooo....";
dialogues[5] = "so cool....";       
dialogues[6] = "yesss...";
dialogues[7] = "i'm on the way";
dialogues[8] = "noooo....it's okey...";
dialogues[9] = "Building strong basement weak...";
dialogues[10] = "Nanu apdiyee shock ayiten..!!";
dialogues[11] = "dei nan yogiyenda...";
dialogues[12] = "Mappu vechitange aappu...";
dialogues[13] = "hello...";
dialogues[14] = "i will kill you...";
dialogues[15] = "There is no hero without a villan...";
dialogues[16] = "If you are bad i am your dad..."; 
dialogues[17] = "I don't like violence but violence like me...";


} 

}



















