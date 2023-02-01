public class Hero 
{
String name;
String characterName;

public Hero(String name, String characterName)
{
this.name = name;
this.characterName = characterName;
}

void sayHeroDialogue(String[] dialogues)
{
System.out.println("\n" + "--------HERO DETAILS--------" + "\n");
System.out.println("Hero Name: "  + name);
System.out.println("Hero Character Name:" + characterName);

int i = (int)(Math.random()*21);
System.out.println(name+": "+dialogues[i]);
}
}