import java.util.Scanner;

public class GradeFinder{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
boolean restart=true;

	while(restart){
	System.out.print("ENTER YOUR NAME: ");
	String name=scanner.nextLine();
	System.out.print("ENTER YOUR SCORE OUT OF 10: ");
	int score=scanner.nextInt();

	char grade;

	switch(score){
		case 10:
			grade='A';
		break;
		
		case 9:
		case 8:
			grade='B';
		break;
	
		case 7:
		case 6:
			grade='C';
		break;	
		
		case 5:
		case 4:
			grade='D';
		break;	
		
		default:
			grade='F';
	}
	System.out.println("HI "+name+" YOUR SCORE IS "+score+" AND YOUR GRADE IS "+grade);
	
	scanner.nextLine();
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