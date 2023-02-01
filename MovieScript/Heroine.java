public class Heroine 
{
String name;
String characterName;

public Heroine(String name, String characterName)
{
this.name = name;
this.characterName = characterName;
}

void sayHeroineDialogue(String[] dialogues)
{
System.out.println("\n" + "--------HEROINE DETAILS--------" + "\n");
System.out.println("Heroine Name: "  + name);
System.out.println("Heroine Character Name:" + characterName);	
int i = (int)(Math.random()*21);
System.out.println(name+": "+dialogues[i]);
}




}

