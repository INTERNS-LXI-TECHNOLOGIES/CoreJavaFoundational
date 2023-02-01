public class Villan{
String name;
String characterName;

	
	public Villan(String name,String characterName)
 {
	
	this.name=name;
	this.characterName=characterName;
	 
 }
 
 
	
void sayDailogueVillan(String[] dailogs2){
	System.out.println("----Villan Details---- \n");
	System.out.println("Villan Name:"+name+"\n");
	System.out.println("Character Name:"+characterName+"\n");
	int i =(int)(Math.random()*12);
   System.out.println("Villan:"+dailogs2[i]);
	System.out.println("\n");
}
		
}
		