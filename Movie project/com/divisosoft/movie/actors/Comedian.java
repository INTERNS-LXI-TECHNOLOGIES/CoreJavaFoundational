package com.divisosoft.movie.actors;
import com.divisosoft.movie.movie.Dialogue;
public class Comedian{

public String Charactorname;

public int age;
   




public Dialogue[] comedian= new Dialogue[5];

public String toString(){
	
     int x =(int)(Math.random()*5);
	 
	 
	 
	 
		
	
	return    "\n"+Charactorname+"\n"+age+"\n"+comedian[x];
	
}


}