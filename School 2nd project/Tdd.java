import java.util.Scanner;

public class Tdd{
public static void main(String[]args){

Student[] student = new Student[2];
Scanner scanner = new Scanner(System.in);
int i = 0; 
String collectDetailsFromUser = "yes";
do{
	 student[i] = new Student();
	 
	 System.out.println("Enter Name: ");
	 student[i].name = scanner.nextLine();
	 
	 System.out.println("Enter Age: ");
	 student[i].age = scanner.nextInt();
	 scanner.nextLine();
	 
	 System.out.println("Enter Gender: ");
	 student[i].gender = scanner.nextLine();
	 
	 System.out.println("Enter Subject: ");
	 student[i].subject = scanner.nextLine();
	 
	 i++;
	 
	 if(i>=0){
	     System.out.println("Do you want to enter another record? (yes/no): ");
		 collectDetailsFromUser = scanner.nextLine();
	   }
	 if(i>=2 && collectDetailsFromUser.equals("yes")){
	     System.out.println("Student Details Completed"); 
	   }
     }

while(i<2 && collectDetailsFromUser.equals("yes"));


for (int q = 0; q <  i ; q++){
	   System.out.println("Do you want to change the subject" +(q + 1)+"? (yes/no): ");
	   String changeSubject = scanner.nextLine();
	   if (changeSubject.equals("yes")){
	     System.out.println("Enter new subject: ");
		 student[q].subject = scanner.nextLine();
		    
	   }
     }






}
}