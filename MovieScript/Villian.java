public class Villian 
{
String[] dialogues = new String[3];
String name;
public Villian(String[] villiandialogues, String name)
{
this.dialogues = villiandialogues;
this.name = name;

}
void sayVillianDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}
}