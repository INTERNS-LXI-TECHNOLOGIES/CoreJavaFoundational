package com.divisosoft.movie.side;
import com.divisosoft.movie.dialogue.Dialogue;
public class Villain{
public String name;
public int age;
public Dialogue[]dialogue=new Dialogue[5];

public String toString()
{
	int d = (int) (Math.random() * dialogue.length);
	Dialogue dial=dialogue[d];

return "\n Villain name: \t"+name+"\n Villain age: \t"+age+"\n Dialogues: \t"+dial+"\n";
}
}