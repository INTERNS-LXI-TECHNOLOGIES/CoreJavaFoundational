public class Comedian 
{
String[] dialogues = new String[3];
String name;
public Comedian(String[] comedianDialogues)
{
this.dialogues = comedianDialogues;
}
void sayComedianDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(name+": "+dialogues[i]);
}

public Comedian(String[] comedianDialogues, String name)
{
this.dialogues = comedianDialogues;
this.name = name;

}
}
