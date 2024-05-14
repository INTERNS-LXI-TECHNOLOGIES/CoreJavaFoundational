import java.util.Scanner;

public class Controller{
Note[] note =new Note[100];
View view=new View();

Scanner scanner =new Scanner(System.in);

public void createnote(){
	
	/*for(int i=0;i<note.length;i++){
		note[i]=view.viewcreatedetails();
		
		System.out.println("Do you want to continue(yes/no)?");
		String add = scanner.nextLine();
		
		if (add .equals ("yes") ){
			
		}
		else{
			
			i=100;
			
		}
		
	}*/
	int i = 0;
	boolean check = true;
		while (check){
			note[i] = view.viewcreatedetails();
			System.out.print("Do you want to continue (yes/no)?");
			String add = scanner.nextLine();
				if (add.equals("no")) {
				check = false;
				}
			i++; 
		}
	}

	public void readnote() {
    for (int i = 0; i < note.length; i++) {
        if (note[i] != null && note[i].getNotes() != null) {
            System.out.println(note[i]);
        }
    }
}

	
}













