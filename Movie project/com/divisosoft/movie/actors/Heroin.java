package com.divisosoft.movie.actors;

import com.divisosoft.movie.movie.Dialogue;
public class Heroin{

public String Charactorname;

public int Age;



public Dialogue[] dia = new Dialogue[5];


public String toString(){
	
    int Dia=(int)(Math.random()*5);
	
	return  "Charactorname is"+Charactorname+"\n"+"charactor Age is" + Age+""+dia[Dia];
}




}