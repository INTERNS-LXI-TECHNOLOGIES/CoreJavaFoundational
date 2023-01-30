public class Hero 
{
String[] dialogues = new String[3];
String name;
String characterName;

public Hero(String[] heroDialogues, String name, String characterName)
{
this.dialogues = heroDialogues;
this.name = name;
this.characterName = characterName;
}

void sayHeroDialogue()
{
System.out.println("\n" + "--------HERO DETAILS--------" + "\n");
System.out.println("Hero Name: "  + name);
System.out.println("Hero Character Name:" + characterName);

int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}
}