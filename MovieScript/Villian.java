public class Villian 
{
String[] dialogues = new String[3];
public Villian(String[] villiandialogues)
{
this.dialogues = villiandialogues;
}
void sayVillianDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(dialogues[i]);
}
}