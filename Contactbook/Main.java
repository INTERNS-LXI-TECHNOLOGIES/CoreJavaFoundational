import java.util.Scanner;
import java.io.*;

public class Main{

public static void main(String[] args){
	

    Scanner scanner = new Scanner(System.in);
    Contactbook[] contactbook = new Contactbook[8];
    System.out.println("*** Contacts ***");
   
	File file = new File("E:\\java\\File\\Contactbook.csv"); 
   for(int i = 0; i<8; i++){
			contactbook[i] = new Contactbook();
		}
	if (Contactbook.isFileBlank(file)) {
		
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
		
			try{ 
               FileWriter fileWriter = new FileWriter(file);

              for (Contactbook data : contactbook){
	               fileWriter.write(data.toCSVFile());
                }
             fileWriter.close();
            }
           catch(IOException e){
	            System.out.println( "An eroor occured : "+e.getMessage());
            }
    } 
	
  else {
           while(true){
	          System.out.println("Menu : ");
		      System.out.println("1. Add Contact ");
		      System.out.println("2. Edit Contact ");
			  System.out.println("3. Delete Contact ");
			  System.out.println("4. Search Contact ");
			  System.out.println("5. Show full contacts ");
			  System.out.println("6. Exit ");
			  System.out.println("Enter your choice : ");
			  int num = scanner.nextInt();
		      
		
		       switch(num){
		          case 1:
		              for(int i = 5;i < contactbook.length ; i++){
	                  System.out.println("Enter Name : ");
					  String name = scanner.nextLine();
					  scanner.next();
                      contactbook[i].setName(name);
	                  System.out.println("Enter Number : ");
					  long number = scanner.nextLong();
					  scanner.nextLine();
					  contactbook[i].setMobNumber(number);
                      System.out.println("Enter Mail ID : ");
					  String mail = scanner.nextLine();
					  scanner.next();
					  contactbook[i].setMailId(mail);
					  }
                     break;
		  
		          case 2:
		             System.out.println("Enter the index of the contact you want to edit (0-4):");
                     int index = scanner.nextInt();
                     scanner.nextLine();

                      if (index >= 0 && index < contactbook.length) {
                          System.out.println("Enter the new name:");
                          String newName = scanner.nextLine();
                          System.out.println("Enter the new phone number:");
                          long newPhoneNumber =scanner.nextLong();
						  scanner.nextLine();
                          System.out.println("Enter the new mailid:");
                          String newMail = scanner.nextLine();
						  
                          contactbook[index].setName(newName);
                          contactbook[index].setMobNumber(newPhoneNumber);
                          contactbook[index].setName(newMail);
						  
                          System.out.println("Contact updated successfully:");
                          System.out.println(contactbook[index]);
                        }
				      else {
                           System.out.println("Invalid index."); 
                        }
		              break;
					  
					   default:
                        System.out.println("Invalid option. Please enter 1 or 2.");
       					break;
						
				  case 3:
		              System.out.println("Enter the index of the contact you want to delete (0-4):");
                      int value = scanner.nextInt();
                      scanner.nextLine();
					  
                      if (value >= 0 && value < contactbook.length) {
                          contactbook[value] = null;
					  }
		          case 4:				  
		              System.out.println("Enter the name of contact :");
					  String name1 = scanner.nextLine();
					  scanner.next();
					  for (int i=0 ; i < contactbook.length ; i++){
					       if(contactbook[i].getName().equalsIgnoreCase(name1)){
							   System.out.println(contactbook[i]);
						   }
						   else{
							   System.out.println("This contact doesn't exist.");  
						   }
					    }
		
   }
 


   
}

}

}

}