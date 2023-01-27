public class Comedian 
{
String[] dialogues = new String[3];
public Comedian(String[] comedianDialogues)
{
this.dialogues = comedianDialogues;
}
void sayComedianDialogue()
{
int i = (int)(Math.random()*3);
System.out.println(dialogues[i]);
}
}
