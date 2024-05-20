package com.divisosoft.contactbook.controller;
import com.divisosoft.contactbook.view.View;
import com.divisosoft.contactbook.model.Contactbook;
import java.util.Scanner;
import java.io.*;

public class Controller{
	
	View view = new View();
	Scanner scanner = new Scanner(System.in);
	Contactbook[] contactbook = new Contactbook[100];
	
  public Controller(){
	   for(int i = 0; i < contactbook.length ; i++){
			contactbook[i] = new Contactbook();
		}
	}
 
  public void newContact(){
		
		boolean yes = true;
		
		while(yes){
		
	       for (int i = 0 ; i < contactbook.length ; i++){
			   if(contactbook[i] == null || contactbook[i].getName() == null){
				   contactbook[i] = view.newContact();
				   yes = true;
				   break;
				   
			   }
		    }
		
		   System.out.println("Do you want to add one more Contact (yes/no) : ");
		   String value = scanner.nextLine();
		
	       switch(value){
			   
		      case "yes":
				   yes = true;
				   break;
				   
			  case "no":
			       yes = false;
				   break;
				   
			  default:
			       yes = false;
		           System.out.println("...Error...Try Again.");
				   break;
		    }
		}
	}
	
	
	public void showContacts(){
		
	  System.out.println("\n\t<<<<  CONTACTS  >>>>\n");
		
		
	  for (int i = 0 ; i < contactbook.length ; i++){
		  if(contactbook[i] != null && contactbook[i].getName() != null){
			  System.out.println(contactbook[i]);
			}
		}
		
	}
	
	
	public void updateContact(){
		
		System.out.println("\n\t<<<<  CONTACTS  >>>>\n");
		
		
	  for (int i = 0 ; i < contactbook.length ; i++){
		  if(contactbook[i] != null && contactbook[i].getName() != null){
			  System.out.println(contactbook[i]);
			}
		}
		
		System.out.println("\n Enter the Name of the Contact you want to Edit : ");
		String name = scanner.nextLine();
		boolean edit = false;
		
	  for (int i = 0; i < contactbook.length; i++) {
           if (contactbook[i] != null && contactbook[i].getName().equals(name)) {
               contactbook[i] = view.editContact();
               edit = true;
               System.out.println("Contact with name " + name + " has been edited.");
               break;
		    }
        }

       if (!edit) {
          System.out.println("Error occurred. Please try again.");
        }
	}


   public void deleteContact(){
	   
	   System.out.println("\n\t<<<<  CONTACTS  >>>>\n");
		
		
	  for (int i = 0 ; i < contactbook.length ; i++){
		  if(contactbook[i] != null && contactbook[i].getName() != null){
			  System.out.println(contactbook[i]);
			}
		}
		
		System.out.println("\n Enter the Name of the Contact you want to Delete : ");
		String name = scanner.nextLine();
		boolean edit = false;
		
		for (int i = 0 ; i < contactbook.length ; i++){
		  if(contactbook[i] != null && contactbook[i].getName().equals(name)){
			  contactbook[i] = null;
			  edit = true;
			  System.out.println("Contact with name "+ name + " has been Deleted. ");
		      break; 
			}
		}
		  if(!edit){
			  System.out.println("Error occured. Please try again.");			   
		    }  
		
    }
	
	
  public void searchContact() {
      
	   System.out.println("\n \t <<<< SEARCH CONTACTS >>>>");
       System.out.println("\n Enter the Name or any letter to search Contact : ");			   
       String name = scanner.nextLine();
    
       boolean found = false;
    
      for (int i = 0 ; i < contactbook.length ; i++) {
           if (contactbook[i] != null && contactbook[i].getName() != null && contactbook[i].getName().contains(name)) {
                System.out.println(contactbook[i]);
                found = true;
            }
        }

       if (!found) {
           System.out.println("No contacts found matching: " + name);
        }
    }
	

    public void readFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bReader.readLine()) != null) {
                String[] fields = line.split(",");
                
                for (int i = 0; i < contactbook.length; i++) {
                    if (contactbook[i].getName() == null) {
                        contactbook[i].setName(fields[0]);
                        contactbook[i].setMobileNumber(Long.parseLong(fields[1]));
                        contactbook[i].setEmail(fields[2]);
                        break;
                    }
                }
            }
            
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }	
	
	public void writeFile(File file){
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fileWriter);
            for (Contactbook contact : contactbook) {
                writer.write(contact.csvFile());
				writer.newLine();
				writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }		
	
	}

   
   
   
   public void menu(){
	   
       File file = new File("E:\\java\\Contactbook project\\com\\divisosoft\\contactbook\\file\\Contactbook.csv");
	   readFile(file);
	   boolean menu = true;
       while (menu){
		  view.viewMenu();
		   System.out.println("\nEnter your Choice : ");
	      String index = scanner.nextLine();
		  
		  switch(index){
			  
			  case "1":
			      newContact();
				  break;
				  
			  case "2":
			      showContacts();
				  break;
				  
			  case "3":
			      updateContact();
				  break;
				  
			  case "4":
			      deleteContact();
				  break;
				  
			  case "5":
			       searchContact();
				   break;
				  
			  case "6":
			      menu = false;
				  System.out.println("Thank you for using Contacbook App.");
				  writeFile(file);
				  break;
				  
			  default :
		           System.out.println("Invalid input. Please set an option from the below menu.");
				   break;
		    }
	    }
	   
	   
    }

}