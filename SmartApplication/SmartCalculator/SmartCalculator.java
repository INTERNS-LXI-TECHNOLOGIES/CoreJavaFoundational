public class SmartCalculator
{
    private Operand[] operands = new Operand[2];
	
	private Number[] numbers = new Number[4];

   public Operand[] getOperands()
   {
	   return operands;
	   
   }
   
   public void setOperands(Operand[] operands)
   {
	   this.operands=operands;
	   
   }
   
   
   public Number[] getNumbers()
   {
	   return numbers;
	   
   }
   
   public void setNumbers(Number[] numbers)
   {
	   this.numbers=numbers;
	   
   }
   
   public SmartCalculator()
   {
	   for(int i =0; i<=1; i++)
	   {
	   operands[i]= new Operand();
	   }
	   
	   for(int j=0; j<=1; j++)
	   {
	   numbers[j]= new Number();
	   }
	   
   }
   
   public String ToString()
   {
	   String calc ="";
	   
	   
	   for(int a=0 ; a<1; a++)
	   {
	   calc = "operands"+a + operands;
	   }
	   
	   for(int b=0 ; b<1; b++)
	   {
	   calc = calc + "numbers"+b + numbers;
	   }
	   return calc;
	   
   }
   

}