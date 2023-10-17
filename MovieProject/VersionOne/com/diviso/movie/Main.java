public class Main
{
public static void main(String[]args)
 {
	System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~~~MOVIE NAME~~~~~~~~~~~~~~~~~~~~~~~~");
  Movie movie = new Movie();
  movie.name= "lucifer";


  Hero hero = new Hero();
    hero.charactorName = "khureshi";
    hero.realName = "mohanlal";
    hero.age = 55;
    hero.dialogues[0]=new Dialogue();
    hero.dialogues[0].name = "ഉപദേശം കൊള്ളാം വർമ്മ സാറേ പക്ഷേ ചെറിയൊരു പ്രശനമുണ്ട് .. തൻ്റെ തന്ത അല്ല എൻ്റെ തന്ത ";
    hero.dialogues[1]=new Dialogue();
    hero.dialogues[1].name = "പണിവരുന്നുണ്ട് അവറാഛോ..";
    hero.dialogues[2]=new Dialogue();
    hero.dialogues[2].name = "ജോർജ്ജ് സാറ് പണ്ടേ ഇങ്ങനാ… ഞങ്ങളെയൊക്കെ കാണുമ്പൊ ഭയങ്കരനാണവാ..";
    hero.dialogues[3]=new Dialogue();
    hero.dialogues[3].name = "കാണാനൊരു ലുക്കില്ലെന്നെയുള്ളു ഭയങ്കര ബുദ്ധിയാ.";
    hero.dialogues[4]=new Dialogue();
    hero.dialogues[4].name = "ഈ പടചോനുണ്ടല്ലൊ.. ഭയങ്കര സംഭവമാ.. ചില സ്വപ്നങ്ങൾ നമ്മൾ മറന്നാലും ആളുമറക്കൂല്ലാ.";
   


  Heroin heroin = new Heroin();
    heroin.charactorName = "priyadarshini";
    heroin.realName = "manjuWarrier";
    heroin.age = 44;
    heroin.dialogues[0]=new Dialogue();
    heroin.dialogues[0].name = "എന്നെ അറിയാവുന്നവരോട് ഞാൻ പണ്ടേ പറഞ്ഞിട്ടുണ്ട്  -സ്റ്റീഫൻ നെടുമ്പള്ളി";
    heroin.dialogues[1] =new Dialogue();
    heroin.dialogues[1].name = "മതി മതി ഇങ്ങോട്ടൊന്നും പറയണ്ടാ..!!";
    heroin.dialogues[2]=new Dialogue();
    heroin.dialogues[2].name = "ഒന്നും തോന്നരുത് സഹിക്കാൻ പറ്റാത്തതു കൊണ്ടാ..";
    heroin.dialogues[3] =new Dialogue();
    heroin.dialogues[3].name = "എങ്കിൽ എന്നോട് പറ ഐ ലൗവ് യൂന്ന്..";
    heroin.dialogues[4] =new Dialogue();
    heroin.dialogues[4].name = "ചുമ്മാ നിന്ന് വിരിയാടാതെടാ ചെക്കാ..."; 
   



  Villain villain = new Villain();
    villain.charactorName = "bobby";
    villain.realName = "vivel";
    villain.age = 48;
    villain.dialogues[0]=new Dialogue();
    villain.dialogues[0].name= "ഉപദേശം കൊള്ളാം വർമ്മ സാറേ പക്ഷേ ചെറിയൊരു പ്രശനമുണ്ട് .. ";
    villain.dialogues[1]=new Dialogue();
    villain.dialogues[1].name= "കെയ്തത് അവരാണെങ്കിലും... ആ നെല്ല് നമുക്കുള്ളതാ.";
    villain.dialogues[2]=new Dialogue();
    villain.dialogues[2].name= "പുരുഷുവിന് ഇപ്പൊ യുദ്ധം ഒന്നും ഇല്ലേ...?";
    villain.dialogues[3]=new Dialogue();
    villain.dialogues[3].name= "ഇറങ്ങി വാടാ തൊരപ്പ...!";
    villain.dialogues[4]=new Dialogue();
    villain.dialogues[4].name= "ഞാൻ എന്റെ വിഗാരം പ്രകടിപ്പിച്ചതാ..";
  


  Comedian comedian = new Comedian();
    comedian.charactorName = "murugan";
    comedian.realName = "baiju";
    comedian.age = 40;
    comedian.dialogues [0]= new Dialogue();
    comedian.dialogues [0].name= "ഉപദേശം കൊള്ളാം വർമ്മ സാറേ പക്ഷേ ചെറിയൊരു പ്രശനമുണ്ട് .. ";
    comedian.dialogues [1]= new Dialogue();
    comedian.dialogues [1].name= "പടച്ചോനെ ഞ്ഞമ്മള് കാത്തോളി..";
    comedian.dialogues [2]= new Dialogue();
    comedian.dialogues [2].name= "ഇപ്പ ശെരിയാക്കി തരാ";
    comedian.dialogues [3]=new Dialogue();
    comedian.dialogues [3].name= "ശ്ശൊ ഈ ചെക്കന്റയൊരു കാര്യം..";
    comedian.dialogues [4]=new Dialogue();
    comedian.dialogues [4].name= "വെൽ ടണ് മിസ്റ്റർ പെരേര.";
  
  System.out.println( movie);
  System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~~~HERO~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println(hero);
  System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~~~HEROIN ~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println(heroin);
  System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~VILLAIN~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println(villain);
  System.out.println("\t\t\t\t"+"~~~~~~~~~~~~~~~~~~~~COMEDIAN~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println(comedian);
//Dialogue dialogue = new Dialogue();
  }
}
