import java.util.Scanner;
public class Restaurant{
		Scanner scanner=new Scanner(System.in);

	 private String restaurentname;
	 boolean flag=true;
	 
	 
	 public String getRestaurantname(){
		 return restaurentname;
	 }
	 public void setRestaurantname(String name){
		 this.restaurentname=name;
	 }
	 public String toString(){
		return restaurentname;
		 
	 }
	 
	 
	public void malabardetails(){
	while(flag){
		System.out.println("Choose a food type(veg/nonveg)");
	    String fdtype=scanner.nextLine();
		
			if(fdtype.equalsIgnoreCase("veg")){
			System.out.println(" veg food details:");
	        System.out.println("masaladosa"+"\n"+"veg biriyani"+"\n"+"chappathi"+"\n"+"paneer"+"\n"+"kuruma");	
			}
			
		
	if(fdtype.equalsIgnoreCase("nonveg")){
			System.out.println("chicken biriyani"+"\n"+"fish kari"+"\n"+"chicken 65"+"\n"+"mandi"+"\n"+"alfam");	
			}
			
		System.out.println("Do you want to continue this restaurent(yes/no)");
	    String d=scanner.nextLine();
		if(d.equalsIgnoreCase("yes")){
		flag=true;
		}
        else{
		flag=false;	
		}	
	}
	}	
public void nehadidetails(){
	while(flag){
		System.out.println("Choose a food type(veg/nonveg)");
	    String fdtype=scanner.nextLine();
		
		if(fdtype.equalsIgnoreCase("veg")){
			System.out.println(" veg food details:");
	        System.out.println("dosa"+"\n"+"pulav"+"\n"+"chappathi"+"\n"+"idali"+"\n"+"sambar");	
			}
		if(fdtype.equalsIgnoreCase("nonveg")){
			System.out.println(" nonveg food details:");
			System.out.println("fish biriyani"+"\n"+"chicken kari"+"\n"+"chicken thantoori"+"\n"+"egg kari"+"/n"+"beef fry");	
	        
			}
	  	
		System.out.println("Do you want to continue this restaurent(yes/no)");
	    String d=scanner.nextLine();
		if(d.equalsIgnoreCase("yes")){
		flag=true;
		}
        else{
		flag=false;	
		}
	}
	}
    
    public void arabiandetails(){
		while(flag){
		System.out.println("Choose a food type(veg/nonveg)");
	    String fdtype=scanner.nextLine();
		
		if(fdtype.equalsIgnoreCase("veg")){
			System.out.println(" veg food details:");
	        System.out.println("putt"+"\n"+"sadhya"+"\n"+"pori"+"\n"+"sambar"+"\n"+"payasam");	
			}
		if(fdtype.equalsIgnoreCase("nonveg")){
			System.out.println(" nonveg food details:");
			System.out.println("egg biriyani"+"\n"+"chicken sanwich"+"\n"+"beef thantoori"+"\n"+"omlet"+"\n"+"fish fry");	
	        
			System.out.println("Do you want to continue this restaurent(yes/no)");
	    String d=scanner.nextLine();
		if(d.equalsIgnoreCase("yes")){
		flag=true;
		}
        else{
		flag=false;	
			}
			   }
	}}
	public void kmdetails(){
		while(flag){
		System.out.println("Choose a food type(veg/nonveg)");
	    String fdtype=scanner.nextLine();
		
		if(fdtype.equalsIgnoreCase("veg")){
			System.out.println(" veg food details:");
	        System.out.println("pazhampori"+"\n"+"veg puffs"+"\n"+"idali"+"\n"+"paneer"+"\n"+"chaya");	
			}
		if(fdtype.equalsIgnoreCase("nonveg")){
		
			System.out.println(" nonveg food details:");
			System.out.println(""+"\n"+"fish kari"+"\n"+"chicken 65"+"\n"+"mandi"+"\n"+"alfam");	
		}
			System.out.println("Do you want to continue this restaurent(yes/no)");
	    String d=scanner.nextLine();
		if(d.equalsIgnoreCase("yes")){
		flag=true;
		}
        else{
		flag=false;	
		}
			
		}
		}   
		
		
	public void restdetails(){
		while(flag){
		System.out.println("Choose a food type(veg/nonveg)");
	    String fdtype=scanner.nextLine();
		
		if(fdtype.equalsIgnoreCase("veg")){
			System.out.println(" veg food details:");
	        System.out.println("porotta"+"\n"+"vada"+"\n"+"noolpittu"+"\n"+"cauliflower fry"+"\n"+"kuruma");	
			}
		if(fdtype.equalsIgnoreCase("nonveg")){
			System.out.println(" nonveg food details:");
			System.out.println("chicken fried rice"+"\n"+"fish kari"+"\n"+"beef 65"+"\n"+"kuzimandi"+"\n"+"alfam");	
		}
	        System.out.println("Do you want to continue this restaurent(yes/no)");
	    String d=scanner.nextLine();
		if(d.equalsIgnoreCase("yes")){
		flag=true;
		}
        else{
		flag=false;	
		}
			}
			   }    			   
    			   
	}   

 
 