package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;

public class Director{
  String directorName,movieName;
  Map<String,ArrayList<Actor>> cast=new HashMap<String,ArrayList<Actor>>();


  Scanner sc= new Scanner(System.in);
  public void castActors(ArrayList<Actor> actors){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    for(Actor a : actors){
        if(a instanceof Hero){
          cast.put("hero",actors);
        }

  }

}
}
