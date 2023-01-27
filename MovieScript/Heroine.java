public class Heroine 
{
String[] dialogues = new String[3];
public Heroine(String[] heroineDialogues)
{
this.dialogues = heroineDialogues;
}
void sayHeroineDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(dialogues[i]);
}
}
