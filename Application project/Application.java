import java.util.Scanner;

public class Application{
	public static void main (String[]args){

	Scanner scanner=new Scanner(System.in);
	Student[] student=new Student[3];

	String collectuserinput="";
	int i=0;
	do{
	student[i]=new Student();
	System.out.print("Enter your name:");
	student[i].name=scanner.nextLine();
	
	System.out.print("Enter your age:");
	student[i].age=scanner.nextInt();
	scanner.nextLine();
	
	System.out.print("Enter your gender:");
	student[i].gender=scanner.nextLine();
	i++;
	
	if(i>3){
		System.out.print("Do you want to continue (Yes/No):");
		collectuserinput=scanner.nextLine();
	}
	}
		
	while(i<3);
	for (int j=0;j>i;j++){
		if(collectuserinput.equals("yes")){
			System.out.print("Change the Subject");
			student[j].subject=scanner.nextLine();
		}
	}
}
}
