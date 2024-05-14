import java.util.Scanner;

public class View{

Scanner scanner =new Scanner(System.in);

public void viewmenu(){
	System.out.println("****Note Recording App");
	System.out.println("1. Create Notes");
	System.out.println("2. Read Notes");
	System.out.println("3. Update Notes");
	System.out.println("4. Delete Notes");
	System.out.println("5. Exit Notes");

}

public Note viewcreatedetails(){
	Note notes =new Note();
	System.out.println("Enter Id:");
	notes.setIdnumber(scanner.nextInt());
	scanner.nextLine();
	System.out.println("Enter notes");
	notes.setNotes(scanner.nextLine());
	System.out.println("Enter Author:");
	notes.setAuthor(scanner.nextLine());
	System.out.println("Enter Subject:");
	notes.setSubject(scanner.nextLine());
	return notes;
}


}