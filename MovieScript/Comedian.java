public class Comedian 
{
String[] dialogues = new String[3];
String name;
String characterName;

public Comedian(String[] comedianDialogues, String name, String characterName)
{
this.dialogues = comedianDialogues;
this.name = name;
this.characterName = characterName;
}

void sayComedianDialogue()
{
System.out.println("\n" + "--------COMEDIAN DETAILS--------" + "\n");
System.out.println("Comedian Name: "  + name);
System.out.println("Comedian Character Name:" + characterName);

int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}
}