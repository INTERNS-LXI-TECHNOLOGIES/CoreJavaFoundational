public class Hero{
	String name;
    String characterName;
	
	public Hero( String name,String characterName){
		
		this.name=name;
	    this.characterName=characterName;
	}
	
 void sayDialogHero(String[] dailogs3){
	 System.out.println("---Hero Details--- \n");
	 System.out.println("Hero Name:"+name+"\n");
	System.out.println("Character Name:"+characterName+"\n");
	
	 int i =(int)(Math.random()*12);
	 System.out.println(dailogs3[i]);
		 		System.out.println("\n");

	
}
}