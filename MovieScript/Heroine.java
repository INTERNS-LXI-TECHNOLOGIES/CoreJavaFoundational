public class Heroine 
{
String[] dialogues = new String[3];
String name;
String characterName;

public Heroine(String[] heroineDialogues, String heroineName, String heroineCharacterName)
{
this.dialogues = heroineDialogues;
this.name = heroineName;
this.characterName = heroineCharacterName;
}

void sayHeroineDialogue()
{
System.out.println("\n" + "--------HEROINE DETAILS--------" + "\n");
System.out.println("Heroine Name: "  + name);
System.out.println("Heroine Character Name:" + characterName);	
	
int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}




}

