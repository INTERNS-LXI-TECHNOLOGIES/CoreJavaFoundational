public class Villan
{
String name;
String characterName;

public Villan(String name,String characterName)
{
this.name = name;
this.characterName = characterName;
}
void printVillan(String[] dialogues)
{
System.out.println("Name :" +name);
System.out.println("Character Name :" +characterName);

int i = (int) (Math.random()*18);
System.out.println("Villan:"+dialogues[i]); 

}
}

