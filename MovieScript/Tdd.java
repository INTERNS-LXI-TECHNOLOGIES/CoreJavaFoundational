public class Tdd{
public static void main(String [] args){
	
	String[] dailogs= new String[3];
	
	dailogs[0]="chello....!";
	dailogs[1]="Hey,chello....";
	dailogs[2]="i love you chello";
	
	Villan villan=new Villan(dailogs);//object of villan
	
	
	 String[] Heroindialg=new String[3];
	 Heroindialg[0]="hey am samantha";
	 Heroindialg[1]="hey iam acting in a new movie";
	 Heroindialg[2]="am a famous actor you know...?";
	 
	Heroin heroinwords = new Heroin(Heroindialg);
	
	String[] herodialogs = new String[3];
	herodialogs[0]="senjiduve....";
	herodialogs[1]="am waiting....";
	herodialogs[2]="kabali da....";
	
	Hero hero=new Hero(herodialogs);
	
	String[] Comediandia=new String[3];
	Comediandia[0]="ippo sheriaaki tharaam";
	Comediandia[1]="thaamarasheri choram.....";
	Comediandia[2]="appo dubai ille.....?";
	Comedian comedian=new Comedian(Comediandia);
	
	

	
	
	
villan.sayDailogue();
heroinwords.sayActressDialog();
hero.sayherodialog();
comedian.sayComedy();


}
}
