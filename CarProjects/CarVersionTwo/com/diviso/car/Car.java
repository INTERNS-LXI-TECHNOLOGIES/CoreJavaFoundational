public class Car
{
  String name;
  Door[] doors = new Door[4];
  Tyre[] tyres = new Tyre[4];
  Steering steering;
  
  
public String toString()
  {
	  
	  String toString="";
	  toString=toString+"Car Name is:"+name+"";
	  
	  for(int i=0; i<3; i++){
	  toString=toString+doors[i]+"";
	  }
	   for(int j=0;j<3;j++){
          toString=toString+tyres[j]+"";
		   
	   }
	   toString=toString+steering+"";
	   return toString;
	  
  } 
}




