import java.util.Scanner;
public class Tdd{
	public static void main(String[] args){
	
	School school=new School();
	
	Scanner scanner = new Scanner(System.in);

	do{
    System.out.println("Enter student name ");
	school.name = scanner.nextLine();
	
	System.out.println("Enter Student class");
    school.clas= scanner.nextInt();
	
	System.out.println("Enter student age");
    school.age= scanner.nextInt();
	
	System.out.println("Enter student rollno");
    school.rollno= scanner.nextInt();
	
	System.out.println("Enter student gender: ");
	school.gender= scanner.nextLine();
	 scanner.nextLine();
	
	
	System.out.println("Enter student subject: ");
	school.subject= scanner.nextLine();
	
	for(int i=0;i<5;i++){
	System.out.println("Do you want to change subject? (yes/no): ");
    school.change = scanner.nextLine(); 
	
	if(!school.change.equalsIgnoreCase("yes")) {
                break; 
            }
		
	System.out.println("Enter new subject: ");
	school.subject1= scanner.nextLine();		
	
	}
	
	System.out.println("Do you want to enter another student? (yes/no): ");
    school.response = scanner.nextLine();
	
	
	 if(!school.response.equalsIgnoreCase("yes")) {
                break; 
            }
		
	System.out.println("Enter new subject: ");
	school.subject1= scanner.nextLine();
	
	} while (true);
	
	
	}	
	
}

