public class Hero 
{
String charactorName;
String realName;
Dialogue[] dialogues = new Dialogue[5]; //for creating 5 differnt dialogues in class hero
int age;

	public String toString()
	{
		String toString="";
		toString = toString+charactorName+""+"\n";
		toString = toString+realName+""+"\n";
		toString = toString+age+""+"\n";
		int i=(int)(Math.random()*5);
		toString = toString+dialogues[i].name;
		return toString;
	}
}