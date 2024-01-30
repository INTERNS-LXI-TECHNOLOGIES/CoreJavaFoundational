package com.divisosoft.movie.actors;
import com.divisosoft.movie.movie.Dialogue;
public class Villan{


public String Charactorname;

public int age;

public Dialogue[] di = new Dialogue[5];


public String toString(){
	
	
        int mathdialogue=(int)(Math.random()*5);
	
	return Charactorname+"\n" + "\n"+age+"\n"+"\n"+ di[mathdialogue];
	
	
	
}



}