public class Hero
{
String[] dialogues = new String[3];
public Hero(String[] heroDialogues)
{
this.dialogues = heroDialogues;
}
void sayHeroDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(dialogues[i]);
}
}
