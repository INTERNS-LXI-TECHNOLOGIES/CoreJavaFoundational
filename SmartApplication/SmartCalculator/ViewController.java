import java.util.Scanner;


public class ViewController extends Number
{
SmartCalculator smart = new SmartCalculator();
static Scanner scanner =new Scanner(System.in);

public void  createUI()
{
     
	 
    boolean check = true;
	
	while(check)
	{
		System.out.println("\t\t\t\t\t   " + "***Select your Options ***" + "\n");
		System.out.println("\t\t\t\t\t   " + "***press key  1 Do am operations ***" + "\n");
		System.out.println("\t\t\t\t\t   " + "***press key 0 to view view select operations ***" + "\n");
        System.out.println("\t\t\t\t\t   " + "*** press key 2 view last operations ***" + "\n");
		 System.out.println("\t\t\t\t\t   " + "***press key 3 to view continue or exit ***" + "\n");
		 
		 String calculator=scanner.nextLine();
         
         switch(calculator)
		 {
			 case "1":
			 doAmOperations();
			 break;
			 
			 case "0":
			  System.out.print("Enter the operation (+, -, *, /): ");
			 selectOperation();
			 break;
			 
			 case "2":
			 viewLastOperations();
			 break;
			 
			 case "3":
			 check=doYouWantToContinue();
			 break;
			 
			 default:
			 System.out.println("Invalid Error");
			 
		 }		 
	}
	
	
  }
          void doAmOperations()
		  {
			   System.out.println("Enter operand 1");
			                smart.getOperands()[0].setTwo(scanner.nextInt());
			   System.out.println("Enter operand 2" +"\n" );
			                smart.getOperands()[1].setThree(scanner.nextInt());
			  //System.out.println(" select operation ");
			   
			   //if else or switch expected for select operation.
		  }
		  
		  void selectOperation()
		  {
			  
			  
				  System.out.println(" select operation ");
			   String operation=scanner.nextLine();
			   int result=0;
			   
			   Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the first number: ");
                smart.getNumbers()[0].setNum1 (scanner.nextInt());

                 //sub.fees= Double.parseDouble(sc.nextLine()) ;  

               System.out.print("Enter the second number: ");
                smart.getNumbers()[1].setNum2(scanner.nextInt());
                
                 
			   switch(operation){
			   case "+":
               result = (getNum1() + getNum2());
               System.out.println(getNum1() + " + " + getNum2() + " = " + result);
               break;
			   
			  case "-":
			   result= getNum1() - getNum2();
			   System.out.println(getNum1()+ " - " + getNum2() + " = " + result);
			   break;
			   
			   case "*":
			   result = getNum1() * getNum2();
			   System.out.println(getNum1()  + " * " + getNum2()+ " = " + result);
			   break;
			   
			   case "/":
			   result = getNum1() / getNum2();
			   System.out.println(getNum1()  + " / " + getNum2() + " = " + result);
			   break;
			   }

				
		  }
		   void viewLastOperations()
		  {
			  System.out.println("show the past operation "+"\n");
			  
		  }
		  
		   boolean doYouWantToContinue()
		  {
			  System.out.println("Press y to continue and Press n to exit");
				String ccontinue = scanner.nextLine() ;
				if( ccontinue.equals("y"))
				{
					return true;
				}
				else {
					return false ;
				}
			  
		  }

}	

