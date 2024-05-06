import java.util.Scanner;
public class Tdd{
public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println(" enter student name:");
	String name=scanner.nextLine();
	System.out.println("Choose a mediam(malayalam/english)");
	String mediam=scanner.nextLine();
	System.out.println(" you select malayalam mediam:");
	if(mediam.equalsIgnoreCase("malayalam")){
			System.out.println(" malayalam mediam  subjects:");
	        System.out.println("malayalam"+"\n"+"english"+"\n"+"maths"+"\n"+"science"+"\n"+"social");	
			}
	else{
		System.out.println(" english mediam  subjects:");
	        System.out.println("grammer"+"\n"+"english"+"\n"+"maths"+"\n"+"science"+"\n"+"social"+"\n");	
		}
	System.out.println("\n"+ "Trkhss"+"\n"+ "galaxy"+"\n"+"carmel"+"\n"+"kv"+"\n"+ "mountseena");
	System.out.println("Choose a school");
	String school=scanner.nextLine();
	
      switch (school) {
            case "a":System.out.println("you selected Trkhss");
               
                  break;
			case "b":System.out.println("you selected galaxy");
			      
                break;
			case "c":System.out.println("you selected carmel");
			  
            	break;
			case "d":System.out.println("you selected km");
			      
                break;
			case "e":System.out.println("you selected mountseena");
			   
                break;	
				
	    default:
                System.out.println("Invalid .");
                break;
        }
		
			
	

	
	
}
}