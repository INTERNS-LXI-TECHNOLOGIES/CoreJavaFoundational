public class Heroine
{

String name;
String characterName;

public Heroine(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}
void printHeroine(String[] dialogues)
{

System.out.println("Name :" +name);
System.out.println("Character Name :" +characterName);



int i = (int) (Math.random()*18);
System.out.println("Heroine:"+dialogues[i]); 





}
}

