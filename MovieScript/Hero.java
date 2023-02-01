public class Hero
{
String name;
String characterName;

public Hero(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}

void printHero(String[] dialogues)
{

System.out.println("Name:" +name);
System.out.println("Character Name:" +characterName);

int i = (int) (Math.random()*18);
System.out.println("Hero:"+dialogues[i]); 

}
}

