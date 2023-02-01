public class Comedian 
{
String name;
String characterName;

public Comedian(String name, String characterName)
{
this.name = name;
this.characterName = characterName;
}

void sayComedianDialogue(String[] dialogues)
{
System.out.println("\n" + "--------COMEDIAN DETAILS--------" + "\n");
System.out.println("Comedian Name: "  + name);
System.out.println("Comedian Character Name:" + characterName);

int i = (int)(Math.random()*21);
System.out.println(name+": "+dialogues[i]);

}
}