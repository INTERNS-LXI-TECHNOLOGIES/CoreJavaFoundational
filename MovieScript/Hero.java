public class Hero
{
String name;
String characterName;

String[] dialogues = new String[3];

Hero(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}
void printHero()
{

System.out.println("Name:" +name);
System.out.println("Character Name:" +characterName);
}
void sayDialogue()
{

int i =(int)(Math.random()*3);
System.out.println("Hero:" + dialogues[i]);	
} 
}

