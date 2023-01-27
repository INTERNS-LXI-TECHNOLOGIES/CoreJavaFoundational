public class Villan{
 String[] dialogues=new String[3];
	
	public Villan(String[] dialoges)
 {
	this.dialogues=dialoges;
	 
 }
 
 
	
void sayDailogue(){
	System.out.println("\n");
	int i =(int)(Math.random()*3);
    System.out.println("Villan: "+dialogues[i]);
	System.out.println("\n");
 
}
		
}
		