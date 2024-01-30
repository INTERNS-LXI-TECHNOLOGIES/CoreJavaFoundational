package com.divisosoft.movie.actors;
import com.divisosoft.movie.movie.Dialogue;
public class Hero {


public String charactorName;
public int Age;



public Dialogue[] Dia = new Dialogue[5];

public String toString(){

       int ab =(int)(Math.random()*5);
	return    "Charactorname is"+"\n"+charactorName+"\n"+"Charactor Age is"+ Age+"\n"+Dia[ab];
}





}