public class Heroine
{

String name;
String characterName;

String[] dialogues = new String[3]; 

Heroine(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}
void printHeroine()
{

System.out.println("Name :" +name);
System.out.println("Character Name :" +characterName);
}
void sayDialogue()
{
int i =(int)(Math.random()*3);
System.out.println("Heroine:" + dialogues[i]);	
 
}
}

