public class Tdd 
{
public static void main(String[] args) 
{
String[] villianDialogues = new String[3];

villianDialogues[0] = "yen kadhai le naan villain da";
villianDialogues[1] = "nama koode erukkuravangala nama pathukitta nama mele erukuravan namala pathupan";
villianDialogues[2] = "eppovum oru prachana na";

String villianName = "Prakash Raj";

Villian villian = new Villian(villianDialogues, villianName);

String[] heroineDialogues = new String[3];
heroineDialogues[0] = "yara namburathunae";
heroineDialogues[1] = "innum enna endru ennai kelkkaadhe";
heroineDialogues[2] = "appadi sollathea";

String[] heroineDialogues2 = new String[3];
heroineDialogues2[0] = "idhula enna perumai";
heroineDialogues2[1] = "mannika therinjavan periya manushyan";
heroineDialogues2[2] = "mannippu kekka therinjavan atha vida periya manushyan";

String heroineName = "Tamanna";
String heroineName2 = "Asin";


Heroine[] heroineArray = new Heroine[2];
heroineArray[0] = new Heroine(heroineDialogues, heroineName);
heroineArray[1] = new Heroine(heroineDialogues2, heroineName2);

String[] heroDialogues = new String[3];
heroDialogues[0] = "Anga yedho vittutu vandha madhiri irukku";
heroDialogues[1] = "ah yenga velilayum onnum ilaye";
heroDialogues[2] = "enna vittutu poitteenga";

String[] heroDialogues2 = new String[3];
heroDialogues2[0] = "namakula odhuva irukurathu panam nu neenga soninga";
heroDialogues2[1] = "namakula podhuva irukurathu makkal";
heroDialogues2[2] = "naan enoda vote ah podrathukaga vandhu iruken";

String heroName = "Surya";
String heroName2 = "Vijay";

Hero[] heroArray = new Hero[2];
heroArray[0] = new Hero(heroDialogues, heroName);
heroArray[1] = new Hero(heroDialogues2, heroName2);

String[] comedianDialogues = new String[3];
comedianDialogues[0] = "athu pona masam..naan sonnathu intha masam";
comedianDialogues[1] = "ayyaio ayyaiooo";
comedianDialogues[2] = "Appappaaa ennadaa";

String[] comedianDialogues2 = new String[3];
comedianDialogues2[0] = "shangi mangi adangoooo";
comedianDialogues2[1] = "enna vecchi comedy pannalaiye";
comedianDialogues2[2] = "mamanukku eppa kanji oothapora";

String comedianName = "Vadivelu";
String comedianName2 = "Vivek";

Comedian[] comedianArray = new Comedian[2];
comedianArray[0] = new Comedian(comedianDialogues, comedianName);
comedianArray[1] = new Comedian(comedianDialogues2, comedianName2);


villian.sayVillianDialogue();

heroineArray[0].sayHeroineDialogue();
heroineArray[1].sayHeroineDialogue();

heroArray[0].sayHeroDialogue();
heroArray[1].sayHeroDialogue();

comedianArray[0].sayComedianDialogue();
comedianArray[1].sayComedianDialogue();

}
}