public class Comedian{
String name;
String characterName;

public Comedian(String name,String characterName){
	
	this.name=name;
	this.characterName=characterName;
	
}

void sayComedy(String[] comedy){
	System.out.println("---Comedian Details--- \n");
	System.out.println("Comedian Name:"+name+"\n");
	System.out.println("Character Name:"+characterName+"\n");
	 int i =(int)(Math.random()*12);
	 System.out.println("comedian: "+comedy[i]);
		 		
	
}

}