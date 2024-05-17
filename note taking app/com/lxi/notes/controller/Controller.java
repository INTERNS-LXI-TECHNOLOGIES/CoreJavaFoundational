package com.lxi.notes.controller;
import com.lxi.notes.view.View;
import com.lxi.notes.model.Notes;
import java.util.Scanner;
public class Controller{
	static Scanner scanner = new Scanner(System.in);
	//Scanner scanner=new Scanner(System.in);
	Notes[] notes=new Notes[3];
public	View view =new View();
boolean flag=true;

public Controller(){
	for (int i = 0; i < notes.length; i++) {
		notes[i]=new Notes();
	}
	
}


public void create() {
	
   	 while(flag) {

        for (int i = 0; i < notes.length; i++) {
		
			if (notes[i].getAuthor() == null) {
                notes[i] = view.createnotes();
                System.out.println("Note created successfully.....");
				System.out.println("Do you want to continue (yes/no)?");
                String b = scanner.nextLine();

                if (b.equalsIgnoreCase("yes")) {
                    flag = true;
                    break;
                } else if (b.equalsIgnoreCase("no")) {
                    flag = false;
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}	
	  
     
public void read() {
    for (int i = 0; i < notes.length; i++) {
		
        if (notes[i].getAuthor() != null) { 
            System.out.println(notes[i]);
        }
    }
}





public void update(){
System.out.println("which author note do you want to change ");
		String x=scanner.nextLine();
		  for(int i=0;i<notes.length;i++){
		    if(notes[i].getAuthor().equalsIgnoreCase(x)){
			 notes[i]=view.updatenotes();  
			 System.out.println("you updateed new notes");
			 break;
		    }	
		  }
}

public void delete(){
System.out.println("which author note do you want to delete ");
		String r=scanner.nextLine();
		  for(int i=0;i<notes.length;i++){
		    if(notes[i].getAuthor().equalsIgnoreCase(r)){
			 notes[i]=null;  
			 System.out.println("you deleted");
			 break;
		    }	
		  }	
	
}



public void main(){
	boolean y = true;
while(y){
	 view.menu();
	 System.out.println("please select a option ");
		String num=scanner.nextLine();
           //scanner.nextLine();		
	
	
      switch (num) {
            case "1":
			 
			System.out.println("you selected create option ");
			
                  create();
		
				  
					break;
			case "2":System.out.println("you selected read option");
                     read();
					 
            	       break;
			case "3":System.out.println("you selected updete option");
			           update();
					  
                      break;
			case "4":System.out.println("you selected delete option");
                      delete();
					  
                        break;
			case "5":System.out.println("you selected exit");
			            y=false;
                          break;	
						  
						  default:
						  System.out.println("error");
				break;
	    
        }

}
}


}




