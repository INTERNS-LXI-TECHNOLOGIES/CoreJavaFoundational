package com.divisosoft.movie.lead;
import com.divisosoft.movie.dialogue.Dialogue;
public class Heroine{
public String name;
public int age;
public Dialogue[]dialogue=new Dialogue[5];

public String toString()
{
	int d = (int) (Math.random() * dialogue.length);
	Dialogue dial = dialogue[d];

return "\n Heroine name: \t"+name+"\n Heroine age: \t"+age+"\n Dialogue: \t"+dial+"\n";
}

}

