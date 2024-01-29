public class Tdd{
 
public static void main(String[]args){

Movie movie = new Movie();
movie.name = "AADU";
System.out.println("\t"+"Midhun Manuel Thomas Presents");
System.out.println("\t"+"\t"+movie.name);

movie.hero = new Hero();
movie.hero.name = "Hero Name : Shaji Pappan";
movie.hero.age = "Age : 37";

movie.hero.d = new Dialogue();
movie.hero.d.dialogue1 = "SP :എന്നാടാ ഈ ചെയ്യുന്നേ?";
movie.hero.d.dialogue2 =  "SP :കൊച്ചി പഴയ കൊച്ചിയെല്ലെന്നാരിയം... പക്ഷേ ബിലാൽ പഴയ ബിലാൽ തന്നെയാ";
movie.hero.d.dialogue3 = "SP :സാധനം കൈയിലുണ്ട്";
movie.hero.d.dialogue4 = "SP :കാനൻ ഒരു ലുക്ക് ഇല്ലണ്ണേ ഉള്ളു... ഭയങ്കര ബുദ്ധിയാ." ;
movie.hero.d.dialogue5 =  "SP :അടിച്ചു മോളേ!";

movie.comedian = new Comedian();
movie.comedian.name = "Comedian Name : Arakkal Abu";
movie.comedian.age = "Age : 39";

movie.comedian.d = new Dialogue();
movie.comedian.d.dialogue1 ="AA :മലയാളം സിനിമ ഡയലോഗ് പറഞ്ഞു കളിയ്ക്കുന്നു ഷാജിയേട്ടാ ..... നിങ്ങളും കൂടിക്കോ "; 
movie.comedian.d.dialogue2 = "AA :ഇതല്ല ഇത്നപ്പറമ്പ് ചാടി കടന്നവനനീ കെ കെ ജോസഫ്!";
movie.comedian.d.dialogue3 =  "AA :കേസ് കൊടുക്കാനം പിള്ളേച്ചാ!";
movie.comedian.d.dialogue4 = "AA :വർക്കിച്ചാ... യെവൻ പുളിയനു കേട്ട. പുലിയെന്നും പറഞ്ഞുവരും പുലി അല്ലാ... ഒരു സിംഹം!";
movie.comedian.d.dialogue5 = "AA :പോളണ്ടിനെ പട്ടി നീ ഒരക്ഷരം മിണ്ടരുത്! എനിക്കതു ഇഷ്ടല്ല.";

movie.heroine = new Heroine();
movie.heroine.name = "Heroine Name : Pinky";
movie.heroine.age = "Age : 30";

movie.heroine.d = new Dialogue();
movie.heroine.d.dialogue1 = "P :ഷാജിയേട്ടാ... തള്ളിമറച്ചോ......";
movie.heroine.d.dialogue2 =  "P :എൻ്റെ ഫോൺ നമ്പർ ഇരട്ട-രണ്ട് ഇരട്ട-അഞ്ച്";
movie.heroine.d.dialogue3 = "P :ഞാൻ ഒരു തേവിശിഷ്യ ആയത്തിൻ്റെ മഹത്വം ഇപ്പൊഴാനെനിക്ക് മനസ്സിലയത്!";
movie.heroine.d.dialogue4 = "P :ഞാനല്ല... എൻ്റെ ഗർഭം ഇങ്ങന അല്ല!";
movie.heroine.d.dialogue5 =  "P :ഷാജിയേട്ടാ...മുധു-ഗാവു!";

movie.villain = new Villain();
movie.villain.name = " Villain Name : Sarbath Shameer";
movie.villain.age = "Age : 40";

movie.villain.d = new Dialogue();
movie.villain.d.dialogue1 = "SS :നിന്നെക്കൊണ്ടൊന്നും പറ്റില്ല ഷാജി... പോയി തരത്തിൽ പോയി കളിക്ക്... ";
movie.villain.d.dialogue2 = "SS :ഓർമ്മയുണ്ടോ ഈ മുഖം?";
movie.villain.d.dialogue3 = "SS :അതു എന്നേ ഉദ്ദേശിച്ചനു… എന്നെ തന്നെ ഉദ്ദേശിച്ചനു… എന്നേ മാത്രം ഉദ്ദേശിച്ചനു!";
movie.villain.d.dialogue4 = "SS :വേലക്കാരി ആയിരുന്താലും നീയെൻ മോഹവല്ലി.";
movie.villain.d.dialogue5 = "SS :വട്ടനല്ലേ?";

System.out.println("\n"+"\t"+"Cast Details");
System.out.println(movie.hero.name+"\n"+movie.hero.age);
System.out.println(movie.heroine.name+"\n"+movie.heroine.age);
System.out.println(movie.comedian.name+"\n"+movie.comedian.age);
System.out.println(movie.villain.name+"\n"+movie.villain.age);
System.out.println("\n"+"\t"+"Coversation");
System.out.println(movie.hero.d.dialogue1);
System.out.println(movie.comedian.d.dialogue1);
System.out.println(movie.heroine.d.dialogue1);
System.out.println(movie.villain.d.dialogue1);
System.out.println(movie.hero.d.dialogue2);
System.out.println(movie.comedian.d.dialogue2);
System.out.println(movie.heroine.d.dialogue2);
System.out.println(movie.villain.d.dialogue2);
System.out.println(movie.heroine.d.dialogue5);
System.out.println(movie.hero.d.dialogue5);
System.out.println(movie.comedian.d.dialogue4);
System.out.println(movie.villain.d.dialogue4);
System.out.println(movie.hero.d.dialogue3);
System.out.println(movie.heroine.d.dialogue3);
System.out.println(movie.comedian.d.dialogue3);
System.out.println(movie.villain.d.dialogue5);
System.out.println(movie.heroine.d.dialogue4 );
System.out.println(movie.hero.d.dialogue4);
System.out.println(movie.villain.d.dialogue3);
System.out.println(movie.comedian.d.dialogue5);










  }




}

