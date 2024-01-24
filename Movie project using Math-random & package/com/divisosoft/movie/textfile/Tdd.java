package com.divisosoft.movie.textfile;
import com.divisosoft.movie.movie.Movie;
import com.divisosoft.movie.dialogue.Dialogue;
import com.divisosoft.movie.lead.*;
import com.divisosoft.movie.side.*;
public class Tdd
	{
public static void main (String[]args)
		{
		
		Movie m = new Movie();
		
		m.name="Big B";
		

		//System.out.println("\n Name: \t"+m.name);
		
		
		m.hero=new Hero();
		m.hero.name="Bilal John Kurishingal";
		m.hero.age=71;
		//System.out.println("\n character Name: \t"+m.hero.name);
		//System.out.println("Character Age: \t"+m.hero.age);
		m.hero.dialogue[0]=new Dialogue();
		m.hero.dialogue[0].dialogue="Kochi pazhaya kochiyallennari ­yaam..pakshe Bilal pazhaya Bilal tanneaa..";
		//System.out.println(" Hero Dialogue1: \t"+m.hero.dialogue[0].dialogue);
			
		m.hero.dialogue[1]=new Dialogue();
		m.hero.dialogue[1].dialogue="Neeyokke aratrousrittond Ajanthel Adhipapam kandondu nadakkana timeil nammalee seen vittathaa ninteyokke ikkanodokke chodhichal ariyaam..";
		//System.out.println("Hero Dialogue2: \t"+m.hero.dialogue[1].dialogue);
			
		m.hero.dialogue[2]=new Dialogue();
		m.hero.dialogue[2].dialogue="Colonynnalla avante ummaante gharbhapaatratheennanelum pokkiyirikkum..";
		//System.out.println(" Hero Dialogue3: \t"+m.hero.dialogue[2].dialogue);
			
		m.hero.dialogue[3]=new Dialogue();
		m.hero.dialogue[3].dialogue="Sire..gerorge ­..marippinulla vadem chaayem njan tharunnund.ippozhalla pinne..";
		//System.out.println(" Hero Dialogue4: \t"+m.hero.dialogue[3].dialogue);
			
		m.hero.dialogue[4]=new Dialogue();
		m.hero.dialogue[4].dialogue="Pazhaya Bilalinu vendi mark cheyyan pattatha eth colonyaada kocheelullath.";
		//System.out.println(" Hero Dialogue5: \t"+m.hero.dialogue[4].dialogue);
			
			
		//System.out.println(" \n \t Heroine Details" );
		m.heroine=new Heroine();
		m.heroine.name="Mary John Kurishingal";
		m.heroine.age=56;
		//System.out.println(" Heroine Character name: \t"+m.heroine.name);
		//System.out.println(" Heroine Character age: \t"+m.heroine.age);
		
		m.heroine.dialogue[0]=new Dialogue();
		m.heroine.dialogue[0].dialogue="Pazhaya Bilalinu vendi mark cheyyan pattatha eth colonyaada kocheelullath.";
		//System.out.println("Heroine Dialogue1: \t"+m.heroine.dialogue[0].dialogue);
			
		m.heroine.dialogue[1]=new Dialogue();
		m.heroine.dialogue[1].dialogue="ee saayipp Toniye ninakkariyille. ­.pandu nee panjikkitta oru basterd ..";
		//System.out.println("Heroine Dialogue2: \t"+m.heroine.dialogue[1].dialogue);
		
		m.heroine.dialogue[2]=new Dialogue();
		m.heroine.dialogue[2].dialogue="Bol chothiye kisne suthaari ki";
		//System.out.println(" Heroine Dialogue3: \t"+m.heroine.dialogue[2].dialogue);
			
		m.heroine.dialogue[3]=new Dialogue();
		m.heroine.dialogue[3].dialogue="Ippozhathe pilleru kollaam..enthaa ­ kali..";
		//System.out.println(" Heroine Dialogue4: \t"+m.heroine.dialogue[3].dialogue);
			
		m.heroine.dialogue[4]=new Dialogue();
		m.heroine.dialogue[4].dialogue="Pazhaya Bilalinu vendi mark cheyyan pattatha eth colonyaada kocheelullath.";
		//System.out.println(" Heroine Dialogue5: \t"+m.heroine.dialogue[4].dialogue);
		
		
		//System.out.println(" \n \t Villain Details" );
		m.villain=new Villain();
		m.villain.name="Sayip Tony";
		m.villain.age=36;
		//System.out.println(" Villain Character name: \t"+ m.villain.name);
		//System.out.println(" Villain Character age: \t"+ m.villain.age);
		
		m.villain.dialogue[0]=new Dialogue();
		m.villain.dialogue[0].dialogue="സാധനം കൈയിൽ ഉണ്ടോ";
		//System.out.println("Villain Dialogue1: \t"+m.villain.dialogue[0].dialogue);
		
		m.villain.dialogue[1]=new Dialogue();
		m.villain.dialogue[1].dialogue="കേസ് കൊടുക്കണം പിള്ളേച്ചാ!";
		//System.out.println("Villain Dialogue2: \t"+m.villain.dialogue[1].dialogue);
		
		
		m.villain.dialogue[2]=new Dialogue();
		m.villain.dialogue[2].dialogue="നമുക്ക് ഗ്രാമങ്ങളിൽ ചെന്നു രാപ്പാർക്കാം...";
		//System.out.println("Villain Dialogue3: \t"+m.villain.dialogue[2].dialogue);
		
		m.villain.dialogue[3]=new Dialogue();
		m.villain.dialogue[3].dialogue="സാഗർ... അപരനാമം... ജാക്കി";
		//System.out.println("Villain Dialogue4: \t"+m.villain.dialogue[3].dialogue);
		
		m.villain.dialogue[4]=new Dialogue();
		m.villain.dialogue[4].dialogue="സാഗർ... അപരനാമം... ജാക്കി";
		//System.out.println("Villain Dialogue5: \t"+m.villain.dialogue[4].dialogue);
		
		//System.out.println("\n \t Comedian Details");
		m.comedian=new Comedian();
		m.comedian.name="Tommy Parekkadan";
		m.comedian.age=66;
		//System.out.println("Villain Character name: \t"+m.comedian.name);
		//System.out.println("Villain Character age: \t"+m.comedian.age);
		
		m.comedian.dialogue[0]=new Dialogue();
		m.comedian.dialogue[0].dialogue="ഇതല്ല ഇത്നപ്പറമ്പ് ചാടി കടന്നവനനീ കെ കെ ജോസഫ്!";
		//System.out.println("Comedian dialogue1: \t"+m.comedian.dialogue[0].dialogue);
		
		m.comedian.dialogue[1]=new Dialogue();
		m.comedian.dialogue[1].dialogue="എന്റെ ഫോൺ നമ്പർ ഇരട്ട-രണ്ട് ഇരട്ട-അഞ്ച്!";
		//System.out.println("Comedian dialogue2: \t"+m.comedian.dialogue[1].dialogue);
		
		m.comedian.dialogue[2]=new Dialogue();
		m.comedian.dialogue[2].dialogue="നാളേയ് കാവിലെ പാട്ടുമൽസരത്തിന് കാണാം!";
		//System.out.println("Comedian dialogue3: \t"+m.comedian.dialogue[2].dialogue);
		
		m.comedian.dialogue[3]=new Dialogue();
		m.comedian.dialogue[3].dialogue="അടിച്ചു മോളേ";
		//System.out.println("Comedian dialogue4: \t"+m.comedian.dialogue[3].dialogue);
		
		m.comedian.dialogue[4]=new Dialogue();
		m.comedian.dialogue[4].dialogue="ഓർമ്മയുണ്ടോ ഈ മുഖം?";
		//System.out.println("Comedian dialogue5: \t"+m.comedian.dialogue[4].dialogue);
		System.out.println(m);
		
		}
		}