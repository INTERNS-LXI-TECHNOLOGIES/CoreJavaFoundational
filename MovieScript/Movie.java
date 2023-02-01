public class Movie{
	String moviename;
	String director;
	String genre;
	String[] dailogs= new String[12];

   
	public Movie(String name,String director,String genre){
		this.moviename=name;
		this.director=director;
		this.genre=genre;

		
	}
void insertdailogue(){
	dailogs[0]="  gaghe...";
	dailogs[1]="  sunny enik avale thirich vennam";
	dailogs[2]="  gagha ippo povanda.....";
	dailogs[3]="  athentha pooyalu...?";
	dailogs[4]="  ayoghya nnayeee unne nnaa konnu un rathathe kudipe";
	dailogs[5]="  vidamatte...ni enne ighe irunth engheyum poogha vidamatte..?";
	dailogs[6]="  enne sherikum onnu nokkiye enik valla kuzhappom undo..?";
	dailogs[7]="  thampi aliyoo.....";
	dailogs[8]="  pinale varanda kuthum njan... ";
	dailogs[9]="naagavalli : nantha naagavalli..";
	dailogs[10]="Ganga : unne kolathuk thaa vanthen";
	dailogs[11]="Ganga : une vidamatte....";
	String comedianName="kilikkam";
	System.out.println("----Movie Details---- \n");
	System.out.println("Movie Name:"+moviename+"\n");
	System.out.println("Character Name:"+director+"\n");
	System.out.println("Character Name:"+genre+"\n");
  
	
	/*System.out.println("\n");
	 int a =(int)(Math.random()*12);
	 System.out.println(dailogs[a]);
		 		System.out.println("\n");
	 int b =(int)(Math.random()*11);
	 System.out.println(dailogs[b]);
		 		System.out.println("\n");
	 int c =(int)(Math.random()*11);
	 System.out.println(dailogs[c]);
		 		System.out.println("\n");*/
	

	
	
	
	
	String villanName="Shobana";
	String villanCharacterName="nnaga valli";
	Villan villan=new Villan( villanName,villanCharacterName);//object of villan
	
	
	 
	 
	String heroinName="shobana";
	String heroinCharacterName="Ganga";
	 Heroin heroinwords = new Heroin(heroinName,heroinCharacterName);
	
	
	
	String heroName="mohanlal";
	String heroCharacterName="sunny";
	Hero hero=new Hero(heroName,heroinCharacterName);
	
	
	String Cname="kuthira vattam pappu";
	String comedianCharacterName="kattuparaban";
	Comedian comedian=new Comedian(Cname,comedianCharacterName);
	
	villan.sayDailogueVillan(dailogs);
    heroinwords.sayDailogueHeroin(dailogs);
    hero.sayDialogHero(dailogs);
	comedian.sayComedy(dailogs);
	
   // comedian.sayComedy();*/

}	


	
	

	


	
}

	