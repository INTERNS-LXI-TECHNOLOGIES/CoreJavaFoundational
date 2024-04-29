import java.util.Scanner;

public class Tdd{
public static void main(String args[]){
	int i=0;
	int j=0;

	 School school=new School();
	 Teacher teacher=new Teacher();
	 
	
	Scanner scanner = new Scanner(System.in);

	do{
	
    System.out.println("Enter student name: ");
	school.name = scanner.nextLine();
	
	System.out.println("Enter Student class:");
    school.clas= scanner.nextInt();
	
	System.out.println("Enter student age:");
    school.age= scanner.nextInt();
	
	System.out.println("Enter student rollno:");
    school.rollno= scanner.nextInt();
	
	System.out.println("Enter student gender: ");
	school.gender= scanner.nextLine();
	 scanner.nextLine();
	
	
	System.out.println("Enter student subject: ");
	school.subject= scanner.nextLine();
	
	
	System.out.println("Do you want to enter another student? (yes/no): ");
    school.response = scanner.nextLine();
	
	
	 if(!school.response.equalsIgnoreCase("yes")) {
                break; 
            }
		i++;	
	} while(i<2);	

	do{
	System.out.println("Do you want to change subject? (yes/no): ");
    school.change = scanner.nextLine(); 
	
	if(!school.change.equalsIgnoreCase("yes")) {
                break; 
            }
		
	System.out.println("Enter new subject: ");
	school.subject1= scanner.nextLine();		
	
   j++;
		} while(j<2);

 do{
	 
    System.out.println("Enter Teacher name: ");
	teacher.name = scanner.nextLine();
	
	System.out.println("Enter Teacher class:");
   teacher.clas= scanner.nextInt();
	
	System.out.println("Enter Teacher age:");
    teacher.age= scanner.nextInt();
	
	System.out.println("Enter Teacher gender: ");
	teacher.gender= scanner.nextLine();
	 scanner.nextLine();
	 
	  
	 i++;
	}while(i<2);
		
}	
	
}

