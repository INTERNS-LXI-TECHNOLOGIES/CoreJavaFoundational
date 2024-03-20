import java.util.Scanner;
public class Tdd{

public static void main(String[]args){

Student[] student =new Student[10];
Scanner scan = new Scanner(System.in);

		
	int i=0;
	do{
		
		
		
		student[i] =new Student();
		
		System.out.println("Enter student");
	    String name=scan.nextLine();
	    System.out.println("Enter the Gender");
	    String gend=scan.nextLine();
		
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		
		
		System.out.println("Enter the Subject");
		scan.next();
		String subject=scan.nextLine();
		
		
		System.out.println("Do you want to continue");
		String collectInputFromUser= scan.nextLine();
	
	    student[i].Name=name;
		student[i].gender=gend;
		
		
	
			i++;	
		
	}
	while(i<student.length);
     

	

}
}