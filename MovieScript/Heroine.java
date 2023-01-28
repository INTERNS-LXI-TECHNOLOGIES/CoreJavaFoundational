public class Heroine 
{
String[] dialogues = new String[3];
String name;

public Heroine(String[] heroineDialogues)
{
this.dialogues = heroineDialogues;
}

void sayHeroineDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}

public Heroine(String[] heroineDialogues, String name)
{
this.dialogues = heroineDialogues;
this.name = name;
}
}
