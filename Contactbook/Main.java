import java.util.Scanner;
import java.io.*;

public class Main{

public static void main(String[] args){
	


         Scanner scanner = new Scanner(System.in);
         Contactbook[] contactbook = new Contactbook[8];
         System.out.println("Save Contacts");
            for(int i = 0; i < contactbook.length ; i++){
	          contactbook[i] = new Contactbook();
            }
         contactbook[0].setName("Ajay");
	     contactbook[0].setMobNumber(8590521357L);
	     contactbook[0].setMailId("ajay.krish@gmail.com");
	     contactbook[1].setName("Arjun");
	     contactbook[1].setMobNumber(7025054977L);
	     contactbook[1].setMailId("arjun345@gmail.com");
	     contactbook[2].setName("Farseena");
	     contactbook[2].setMobNumber(8289869894L);
	     contactbook[2].setMailId("farseena@gmail.com");
	     contactbook[3].setName("Sreeja");
	     contactbook[3].setMobNumber(9447533989L);
	     contactbook[3].setMailId("sree.sreeja@gmail.com");
	     contactbook[4].setName("Vignesh");
	     contactbook[4].setMobNumber(9446669993L);
	     contactbook[4].setMailId("vigneshambat@gmail.com");
	    
 
          for(int i = 5;i < contactbook.length ; i++){
	          System.out.println("Enter Name : ");
	          contactbook[i].setName(scanner.nextLine());
	          System.out.println("Enter Number : ");
	          contactbook[i].setMobNumber(scanner.nextLong());
	          scanner.nextLine();
              System.out.println("Enter Mail ID : ");
	          contactbook[i].setMailId(scanner.nextLine());
            }
	    
       

	File file = new File("E:\\java\\File\\Contactbook.csv");
	
try{ 
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

try (FileReader fileReader = new FileReader(file);
             Scanner scanner1 = new Scanner(fileReader)) {

            scanner.useDelimiter(",|\\n");
			
            while (scanner1.hasNext()) {
                String part = scanner1.next();
                System.out.println(part); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



   for(Contactbook contact : contactbook){
     contact.readContacts();
    }
}

}