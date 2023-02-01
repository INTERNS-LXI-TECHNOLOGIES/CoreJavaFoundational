public class Heroin{
String name;
String characterName;
	
	public Heroin(String name,String characterName){
		
		this.name=name;
	    this.characterName=characterName;
		
}
		
	
	/*void sayActressDialog(){
		System.out.println("---Heroin Details--- \n");
		System.out.println("Hero Name:"+name+"\n");
	System.out.println("Character Name:"+characterName+"\n");
		System.out.println("\n");
		
}*/
void sayDailogueHeroin(String[] dailogs1){
	System.out.println("---Heroin Details--- \n");
	System.out.println("Hero Name:"+name+"\n");
	System.out.println("Character Name:"+characterName+"\n");
	int i =(int)(Math.random()*12);
    System.out.println(characterName+dailogs1[i]);
	System.out.println("\n");
}
}