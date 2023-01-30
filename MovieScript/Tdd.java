public class Tdd 
{
public static void main(String[] args) 
{
Hero[] heros = new Hero[2];
Heroine[] heroines = new Heroine[2];
Comedian[] comedians = new Comedian[2];

String[] villianDialogues = new String[3];

villianDialogues[0] = "yen kadhai le naan villain da";
villianDialogues[1] = "nama koode erukkuravangala nama pathukitta nama mele erukuravan namala pathupan";
villianDialogues[2] = "eppovum oru prachana na";

String villianName = "Prakash Raj";
String villianCharacterName = "Muthupandi";
Villian villian = new Villian(villianDialogues, villianName, villianCharacterName);


String[] heroineDialogues = new String[3];
heroineDialogues[0] = "yara namburathunae";
heroineDialogues[1] = "innum enna endru ennai kelkkaadhe";
heroineDialogues[2] = "appadi sollathea";

String[] heroineDialogues2 = new String[3];
heroineDialogues2[0] = "idhula enna perumai";
heroineDialogues2[1] = "mannika therinjavan periya manushyan";
heroineDialogues2[2] = "mannippu kekka therinjavan atha vida periya manushyan";


String heroineName = "Tamanna";
String heroineCharacterName = "Anjali";
heroines[0] = new Heroine(heroineDialogues, heroineName, heroineCharacterName);

String heroineName2 = "Asin";
String heroineCharacterName2 = "Kalpana";
heroines[1] = new Heroine(heroineDialogues2, heroineName2, heroineCharacterName2);



String[] heroDialogues = new String[3];
heroDialogues[0] = "Anga yedho vittutu vandha madhiri irukku";
heroDialogues[1] = "ah yenga velilayum onnum ilaye";
heroDialogues[2] = "enna vittutu poitteenga";

String[] heroDialogues2 = new String[3];
heroDialogues2[0] = "namakula odhuva irukurathu panam nu neenga soninga";
heroDialogues2[1] = "namakula podhuva irukurathu makkal";
heroDialogues2[2] = "naan enoda vote ah podrathukaga vandhu iruken";

String heroName = "Surya";
String heroCharacterName = "Deva";
heros[0]= new Hero(heroDialogues, heroName, heroCharacterName);

String heroName2 = "Vijay";
String heroCharacterName2 = "jay";
heros[1]= new Hero(heroDialogues2, heroName2, heroCharacterName2);


String[] comedianDialogues = new String[3];
comedianDialogues[0] = "athu pona masam..naan sonnathu intha masam";
comedianDialogues[1] = "ayyaio ayyaiooo";
comedianDialogues[2] = "Appappaaa ennadaa";

String[] comedianDialogues2 = new String[3];
comedianDialogues2[0] = "shangi mangi adangoooo";
comedianDialogues2[1] = "enna vecchi comedy pannalaiye";
comedianDialogues2[2] = "mamanukku eppa kanji oothapora";

String comedianName = "Vadivelu";
String comedianCharacterName = "velayudhan";
comedians[0] = new Comedian(comedianDialogues, comedianName, comedianCharacterName);

String comedianName2 = "Vivek";
String comedianCharacterName2 = "Marimuthu";
comedians[1] = new Comedian(comedianDialogues2, comedianName2, comedianCharacterName2);

String name = "Ayan";
String director = "K.V Anand";
String producer = "M Saravanan";
String musicDirector = "Harris Jayaraj";
String releaseDate = "3 April 2009";

Movie movie = new Movie(name, director, producer, musicDirector, releaseDate, villian, heros, heroines, comedians);
movie.showMovieDetails();

}
}