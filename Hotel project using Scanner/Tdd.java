import java.util.Scanner;
public class Tdd{
	
	public static void main(String []args){
	
	boolean flag=true;
    
       while(flag){
		   
		   System.out.print("press 1 to show Hotels in palakad");
		   System.out.println("press sagar Show sagar hotel details");
		   System.out.println("press paragon to print details of paragon hotel");
		   
		
		  Scanner scanner = new Scanner(System.in);
		  String value = scanner.nextLine();
		
		  switch(value){
			  
			  case "1":
			  System.out.println("Sagar hotel"+"Paragon hoetl"+"Salkkara Hotel");
			  break;
			  
			  case "sagar":
			
              getcontinue();
			  
			  
			  
			  
				
			  System.out.println("Do you wants to cotinue yes or nor");
			  String x=scanner.nextLine();
			  if(x.equals("yes")){
				  
				  flag=true;
			  }
			  else{
				  flag=false;
			  }
			  break;
			  
			  case "paragon":
			 printParagon();
			   
			   System.out.println("Do you want to continue yes or No");
			   String con=scanner.nextLine();
			   if(con.equals("yes")){
				   
				   flag=true;
			   }
			   else{
				   flag=false;
			   }
			   
			   
			   
			   break;
			  
			  
			  
		  }
		   
	
	
	}	
	
}

public static void getcontinue(){
	
	System.out.println("Nonveg or veg");
}

public static void printParagon(){
	
	System.out.println("Non veg"+"Vegitarian"+"Juice");

}
}