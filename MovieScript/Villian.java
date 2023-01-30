public class Villian 
{
String[] dialogues = new String[3];
String name;
String characterName;
public Villian(String[] villianDialogues, String name, String characterName)
{
this.dialogues = villianDialogues;
this.name = name;
this.characterName = characterName;
}
void sayVillianDialogue()
{
int i = (int)(Math.random()*3);
System.out.println("\n" + "--------VILLIAN DETAILS--------" + "\n");
System.out.println("Villian Name: "  + name);
System.out.println("Villian Character Name:" + characterName);
System.out.println(name+": "+dialogues[i] + "\n");
}
}