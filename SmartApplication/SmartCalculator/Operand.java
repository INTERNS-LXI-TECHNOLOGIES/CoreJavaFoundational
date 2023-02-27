public class Operand
{

private int two;
private int three;


   public int getTwo()
   {
	   return two;
	   
   }
   
   public void setTwo(int two)
   {
	   this.two=two;
	   
   }
   
   public int getThree()
   {
	   return three;
	   
   }
   
   public void setThree(int three)
   {
	   this.three=three;
	   
   }
   

public Operand()
{
	
}

public String toString()
{
	
	int numberName;
	
	numberName =   two;
	numberName = numberName +  three;
	
	return "numberName " + numberName;
}


}