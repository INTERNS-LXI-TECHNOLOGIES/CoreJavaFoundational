public class Villain
{
String charactorName;
String realName;
Dialogue[] dialogues= new Dialogue[5];
int age;

	public String toString()
	{
		String toString="";
		toString = toString+charactorName+""+"\n"+realName+""+"\n"+age+""+"\n";
        int i=(int)(Math.random()*5);
		toString = toString+dialogues[i].name;
		return toString;
	}
}