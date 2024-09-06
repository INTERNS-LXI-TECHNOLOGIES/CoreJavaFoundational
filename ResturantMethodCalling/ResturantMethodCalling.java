import java.util.Scanner;

public class ResturantMethodCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		boolean restart=true;
		
		while(restart){
			
		System.out.print("SHALL WE START: ");
		String option = scanner.nextLine();
			if(option.equalsIgnoreCase("yes")){
			
			System.out.print("Enter your Location: ");
			String location = scanner.nextLine();
				if(location.equalsIgnoreCase("palakkad")){
				out1();
				}
				else if(location.equalsIgnoreCase("ottapalam")){
				out2();
				}
			}
			else{
				restart=false;
			}
			
			if(option.equalsIgnoreCase("yes")){
		System.out.print("DO YOU WISH TO CONTINUE YES/NO: ");
		String check = scanner.nextLine();
		
		if(check.equalsIgnoreCase("YES")){
			restart=true;
		}
		else{
			restart=false;
		}		
		}	
		else{
			restart=false;
		}
		}
    }
		static void out1(){
			System.out.println("1.NOORJAHAN");
			System.out.println("2.NOORA MANDHI");
			System.out.println("3.ARABIAN");
			System.out.println("4.FRUIT 4");
		}
		static void out2(){
			System.out.println("1.APLHA");
			System.out.println("2.20-20");
			System.out.println("3.COOK-UP");
			System.out.println("4.JAK JAM");
		}
}