package com.divisosoft.movie.lead;
import com.divisosoft.movie.dialogue.Dialogue;
public class Hero{
public String name;
public int age;
public Dialogue[] dialogue=new Dialogue[5];

public String toString()
{
	int d = (int) (Math.random() * dialogue.length);
	Dialogue dial = dialogue[d];

		
return "\n Hero name: \t"+name+"\n Hero age: \t"+age+"\n Dialogues: \t"+dial+"\n";

}

}