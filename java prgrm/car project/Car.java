public class Car{
String name;
String color;
int numberplate;
boolean isenginestart;
String state;



public void star()
{

     if(!isenginestart)
      {
	    System.out.println("press the clutch"+"\n"+"engine is start");
	    isenginestart=true;
      }
    else
      {
	   System.out.println("engine is already started");
      }
}

public void stop()
{

    if(isenginestart)
      {
	    System.out.println("engine is stoped" );
	    isenginestart=false;
      }
    else
      {
	    System.out.println("engine is  already stoped");
      }	
}

public String toString()
{
return "car name:"+name   + "\n"   +  "car color:"+color      + "\n"     +    "car numberplate:"+numberplate    +  "\n"   +     " car state:"     +   (isenginestart ? "start" : "stop");
}

}
