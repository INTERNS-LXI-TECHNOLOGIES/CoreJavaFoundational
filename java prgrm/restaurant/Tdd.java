import java.util.Scanner;
public class Tdd{
public static void main(String args[]){
	boolean flag=true;
	
	System.out.println("WELCOME PALAKKAD");
	
	Scanner scanner=new Scanner(System.in);
	Restaurant[] restaurant=new Restaurant[5];
	Restaurant r = new Restaurant();
	
	String rname[]={"1.Malabar","2.Nehadi","3.arabian","4.km","5.rest"};
	for(int i=0,j=0;i<5;i++){
	restaurant[i]=new Restaurant();
	restaurant[i].setRestaurantname(rname[j]);
	//System.out.println(restaurant[i]);
	j++;
	}
	
	while(flag){
		
		for(int i=0;i<5;i++){
			System.out.println(restaurant[i]);
		}
	
	System.out.println("Choose a restaurant");
	int number=scanner.nextInt();
	
      switch (number) {
            case 1:System.out.println("you selected Malabar");
               r.malabardetails();
                  break;
			case 2:System.out.println("you selected Nehadi");
			      r.nehadidetails();
                break;
			case 3:System.out.println("you selected arabian");
			   r.arabiandetails();
            	break;
			case 4:System.out.println("you selected km");
			      r.kmdetails();
                break;
			case 5:System.out.println("you selected rest");
			    r.restdetails();
                break;	
				
	    default:
                System.out.println("Invalid .");
                break;
        }
			
		System.out.println("Do you finish ?(yes/no)");
	    String e=scanner.nextLine();
		scanner.nextLine();
		if(e.equalsIgnoreCase("yes")){
		flag=false;
		}
        else{
		flag=true;	
		}	
	}
	}	
		
}
