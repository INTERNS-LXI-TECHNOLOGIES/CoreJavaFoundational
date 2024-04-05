import java.util.Scanner;
import java.io.*;

public class Main{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
Contactbook[] contactbook = new Contactbook[2];
 System.out.println("Save Contacts");
for(int i = 0; i < contactbook.length ; i++){
	 contactbook[i] = new Contactbook();
	 System.out.println("Enter Name : ");
	 contactbook[i].name = scanner.nextLine();
	 System.out.println("Enter Number : ");
	 contactbook[i].mobNumber = scanner.nextLong();
	 scanner.nextLine();
	 System.out.println("Enter Mail ID : ");
	 contactbook[i].mailId = scanner.nextLine();
}
try{
File file = new File("E:\\java\\File\\DemoProject.csv");
 
FileWriter fileWriter = new FileWriter(file);

for (Contactbook data : contactbook){
	fileWriter.write(data.toCSVFile());
}
 fileWriter.close();
 System.out.println("Successfully copied to file.");
}
catch(IOException e){
	System.out.println( "An eroor occured : "+e.getMessage());
}


}

}