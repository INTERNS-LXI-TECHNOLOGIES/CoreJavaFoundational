import java.util.Scanner;

public class Application{
	public static void main (String[]args){

	Scanner scanner=new Scanner(System.in);
	Student[] student=new Student[10];

	int i=0;
	do{
	student[i]=new Student();
	System.out.print("Enter your name:");
	student[i].name=scanner.nextLine();
	
	System.out.print("Enter your age:");
	student[i].age=scanner.nextInt();
	scanner.nextLine();
	
	System.out.print("Enter your gender:");
	student[i].gender=scanner.nextLine();
	i++;
	}
	
	while(i<3);
	
	
	
		/*if (student[i].equals ("yes")){
		System.out.print("Yes toContinue");
		System.out.print("Enter your name:");
		student[i].name=scanner.nextLine();
	
		System.out.print("Enter your age:");
		student[i].age=scanner.nextInt();
		scanner.nextLine();
	
		System.out.print("Enter your gender:");
		student[i].gender=scanner.nextLine();
	i++;
	}
	scanner.close();
	
	}*/
	
	
}
}
