public class Villian 
{
String name;
String characterName;
public Villian(String name, String characterName)
{
this.name = name;
this.characterName = characterName;
}
void sayVillianDialogue(String[] dialogues)
{
int i = (int)(Math.random()*21);
System.out.println("\n" + "--------VILLIAN DETAILS--------" + "\n");
System.out.println("Villian Name: "  + name);
System.out.println("Villian Character Name:" + characterName);
System.out.println(name+": "+dialogues[i] + "\n");
}
}