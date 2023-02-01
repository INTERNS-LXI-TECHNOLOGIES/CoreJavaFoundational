public class Comedian
{
String name;
String characterName;

public Comedian(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}
void printComedian(String[] dialogues)
{
System.out.println("Name :" +name);
System.out.println("Character Name :" +characterName);

int i = (int) (Math.random()*18);
System.out.println("Comedian:"+dialogues[i]); 

}
}

