import java.util.Scanner;
public class Tdd{
public static void main(String[] agrs){
	
School[] school=new School[2];
Scanner scanner = new Scanner(System.in);	
System.out.println("\n"+"        *****Student Details*****        "+"\n");
int i=0;
String collectInputFromUser= "yes";
 do {
	 school[i]=new School();
	
	 System.out.println("Enter name: ");
     school[i].name = scanner.nextLine();
	
	 System.out.println("Enter age: ");
     school[i].age = scanner.nextInt();
     scanner.nextLine();
	 
     System.out.println("Enter gender: ");
     school[i].gender = scanner.nextLine();
     	

     System.out.println("Enter subject: ");
     school[i].subject = scanner.nextLine();
	
     i++;	 
	  
	 if(i>=0){
		 System.out.println("Do you want to enter another record? (yes/no): ");
	     collectInputFromUser = scanner.nextLine();
	    }
    }
while( collectInputFromUser.equals("yes"));

 for (int j = 0; j < i; j++) {
            System.out.println("Do you want to change the subject for student " + (j + 1) + "? (yes/no): ");
            String changeSubject = scanner.nextLine();
            if (changeSubject.equalsIgnoreCase("yes")) {
                System.out.println("Enter new subject: ");
                school[j].subject = scanner.nextLine();
            }
        }


}
}  