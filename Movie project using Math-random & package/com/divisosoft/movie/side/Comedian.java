package com.divisosoft.movie.side;
import com.divisosoft.movie.dialogue.Dialogue;
public class Comedian{
public String name;
public int age;
public Dialogue[]dialogue=new Dialogue[5];

public String toString()
{
	int d = (int) (Math.random() * dialogue.length);
	Dialogue dial=dialogue[d];
	
return "\n Comedian name: \t"+"\n Comedian age: \t"+name+"\n"+age+"\n Comedian dialogue: \t"+dial + "\n";

}
}