public class Villan
{

String name;
String characterName;

String[] dialogues = new String[3];

public Villan(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}
void printVillan()
{
System.out.println("Name :" +name);
System.out.println("Character Name :" +characterName);
}
void sayDialogue()
{
int i =(int)(Math.random()*3);
System.out.println("Villan:" + dialogues[i]);	
} 
}

