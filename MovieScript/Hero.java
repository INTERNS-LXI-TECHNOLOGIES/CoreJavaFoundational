public class Hero 
{
String[] dialogues = new String[3];
String name;
public Hero(String[] heroDialogues)
{
this.dialogues = heroDialogues;
}
void sayHeroDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}

public Hero(String[] heroDialogues, String name)
{
this.dialogues = heroDialogues;
this.name = name;

}
}
