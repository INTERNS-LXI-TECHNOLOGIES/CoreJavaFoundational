public class Tdd{
 
public static void main(String[]args){

Movie movie = new Movie();
movie.name = "AADU";
System.out.println("\t"+"Midhun Manuel Thomas Presents");
System.out.println("\t"+"\t"+movie.name);

movie.hero = new Hero();
movie.hero.name = "Hero Name : Shaji Pappan";
movie.hero.age = "Age : 37";

movie.hero.dialogue[0] = new Dialogue();
movie.hero.dialogue[0].dialog = "SP :എന്നാടാ ഈ ചെയ്യുന്നേ?";
movie.hero.dialogue[1] = new Dialogue();
movie.hero.dialogue[1].dialog =  "SP :കൊച്ചി പഴയ കൊച്ചിയെല്ലെന്നാരിയം... പക്ഷേ ബിലാൽ പഴയ ബിലാൽ തന്നെയാ";
movie.hero.dialogue[2] = new Dialogue();
movie.hero.dialogue[2].dialog = "SP :സാധനം കൈയിലുണ്ട്";
movie.hero.dialogue[3] = new Dialogue();
movie.hero.dialogue[3].dialog = "SP :കാനൻ ഒരു ലുക്ക് ഇല്ലണ്ണേ ഉള്ളു... ഭയങ്കര ബുദ്ധിയാ." ;
movie.hero.dialogue[4] = new Dialogue();
movie.hero.dialogue[4].dialog =  "SP :അടിച്ചു മോളേ!";

movie.comedian = new Comedian();
movie.comedian.name = "Comedian Name : Arakkal Abu";
movie.comedian.age = "Age : 39";

movie.comedian.dialogue[0] = new Dialogue();
movie.comedian.dialogue[0].dialog ="AA :മലയാളം സിനിമ ഡയലോഗ് പറഞ്ഞു കളിയ്ക്കുന്നു ഷാജിയേട്ടാ ..... നിങ്ങളും കൂടിക്കോ "; 
movie.comedian.dialogue[1] = new Dialogue();
movie.comedian.dialogue[1].dialog = "AA :ഇതല്ല ഇത്നപ്പറമ്പ് ചാടി കടന്നവനനീ കെ കെ ജോസഫ്!";
movie.comedian.dialogue[2] = new Dialogue();
movie.comedian.dialogue[2].dialog =  "AA :കേസ് കൊടുക്കാനം പിള്ളേച്ചാ!";
movie.comedian.dialogue[3] = new Dialogue();
movie.comedian.dialogue[3].dialog = "AA :വർക്കിച്ചാ... യെവൻ പുളിയനു കേട്ട. പുലിയെന്നും പറഞ്ഞുവരും പുലി അല്ലാ... ഒരു സിംഹം!";
movie.comedian.dialogue[4] = new Dialogue();
movie.comedian.dialogue[4].dialog = "AA :പോളണ്ടിനെ പട്ടി നീ ഒരക്ഷരം മിണ്ടരുത്! എനിക്കതു ഇഷ്ടല്ല.";

movie.heroine = new Heroine();
movie.heroine.name = "Heroine Name : Pinky";
movie.heroine.age = "Age : 30";

movie.heroine.dialogue[0] = new Dialogue();
movie.heroine.dialogue[0].dialog = "P :ഷാജിയേട്ടാ... തള്ളിമറച്ചോ......";
movie.heroine.dialogue[1] = new Dialogue();
movie.heroine.dialogue[1].dialog =  "P :എൻ്റെ ഫോൺ നമ്പർ ഇരട്ട-രണ്ട് ഇരട്ട-അഞ്ച്";
movie.heroine.dialogue[2] = new Dialogue();
movie.heroine.dialogue[2].dialog = "P :ഞാൻ ഒരു തേവിശിഷ്യ ആയത്തിൻ്റെ മഹത്വം ഇപ്പൊഴാനെനിക്ക് മനസ്സിലയത്!";
movie.heroine.dialogue[3] = new Dialogue();
movie.heroine.dialogue[3].dialog= "P :ഞാനല്ല... എൻ്റെ ഗർഭം ഇങ്ങന അല്ല!";
movie.heroine.dialogue[4] = new Dialogue();
movie.heroine.dialogue[4].dialog =  "P :ഷാജിയേട്ടാ...മുധു-ഗാവു!";

movie.villain = new Villain();
movie.villain.name = " Villain Name : Sarbath Shameer";
movie.villain.age = "Age : 40";

movie.villain.dialogue[0] = new Dialogue();
movie.villain.dialogue[0].dialog = "SS :നിന്നെക്കൊണ്ടൊന്നും പറ്റില്ല ഷാജി... പോയി തരത്തിൽ പോയി കളിക്ക്... ";
movie.villain.dialogue[1] = new Dialogue();
movie.villain.dialogue[1].dialog = "SS :ഓർമ്മയുണ്ടോ ഈ മുഖം?";
movie.villain.dialogue[2] = new Dialogue();
movie.villain.dialogue[2].dialog = "SS :അതു എന്നേ ഉദ്ദേശിച്ചനു… എന്നെ തന്നെ ഉദ്ദേശിച്ചനു… എന്നേ മാത്രം ഉദ്ദേശിച്ചനു!";
movie.villain.dialogue[3] = new Dialogue();
movie.villain.dialogue[3].dialog = "SS :വേലക്കാരി ആയിരുന്താലും നീയെൻ മോഹവല്ലി.";
movie.villain.dialogue[4] = new Dialogue();
movie.villain.dialogue[4].dialog = "SS :വട്ടനല്ലേ?";

System.out.println("\n"+"\t"+"Cast Details");
System.out.println(movie.hero.name+"\n"+movie.hero.age);
System.out.println(movie.heroine.name+"\n"+movie.heroine.age);
System.out.println(movie.comedian.name+"\n"+movie.comedian.age);
System.out.println(movie.villain.name+"\n"+movie.villain.age);
System.out.println("\n"+"\t"+"Coversation");
System.out.println(movie.hero.dialogue[0].dialog);
System.out.println(movie.comedian.dialogue[0].dialog);
System.out.println(movie.heroine.dialogue[0].dialog);
System.out.println(movie.villain.dialogue[0].dialog);
System.out.println(movie.hero.dialogue[1].dialog);
System.out.println(movie.comedian.dialogue[1].dialog);
System.out.println(movie.heroine.dialogue[1].dialog);
System.out.println(movie.villain.dialogue[1].dialog);
System.out.println(movie.heroine.dialogue[4].dialog);
System.out.println(movie.hero.dialogue[4].dialog);
System.out.println(movie.comedian.dialogue[3].dialog);
System.out.println(movie.villain.dialogue[3].dialog);
System.out.println(movie.hero.dialogue[2].dialog);
System.out.println(movie.heroine.dialogue[2].dialog);
System.out.println(movie.comedian.dialogue[2].dialog);
System.out.println(movie.villain.dialogue[4].dialog);
System.out.println(movie.heroine.dialogue[3].dialog );
System.out.println(movie.hero.dialogue[3].dialog);
System.out.println(movie.villain.dialogue[2].dialog);
System.out.println(movie.comedian.dialogue[4].dialog);










  }




}

