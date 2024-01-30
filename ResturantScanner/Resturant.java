import java.util.Scanner;

public class Resturant{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
boolean restart=true;

	while(restart){
	System.out.print("Enter Your Location: ");
	String location=scanner.nextLine();
	
	String names="";
	
	switch(location){
		case ("palakkad"):
		names="\n"+"1.NOORA"+"\n"+"2.A TO Z"+"\n"+"3.ARABIAN";
		break;
		
		case ("ottapalam"):
		names="\n"+"1.EATBAY"+"\n"+"2.20-20";
		break;
		
		case ("pattambi"): 
		names="\n"+"1.FOOD4U"+"\n"+"2.MUNDI KADA";
		break;
		
		case ("alapuzza"):
		names="\n"+"1.SAHPPILE KARRY"+"\n"+"2.TODY FOOD";
		break;
		default:
		System.out.println("INVALID LOCATION");
		
	} 
	System.out.println("YOUR LOCATION "+location+" HAS FOLLOWING RESTURANTS: "+names);
	
	System.out.print("\n"+"DO WISH TO CONTINUE: YES/NO:- ");
	String check=scanner.nextLine();
	
	if(check.equalsIgnoreCase("YES")){
		restart=true;
	}
	else{
		restart=false;
	}
	
	}
}
}