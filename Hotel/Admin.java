import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
class Admin{
	Scanner sc=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	Scanner sv=new Scanner(System.in);
	Scanner ss=new Scanner(System.in);
	Food fd=new Food();
	
	//Food[] ff=new Food[10];
	int x;
	int select,option;
	int edit,delete;
	String newFood;
	float newPrice;
	public void adminDetails(ArrayList<Food> food){
		Hotel hh=new Hotel();
		/* for(int i=0;i<10;i++){
		ff[i]=new Food();
		} */
		do{
		System.out.println("SELECT WHAT TO DO");
		System.out.println("1. EDIT");
		System.out.println("2. DELETE");
		System.out.println("3. ADD");
		System.out.println("4. EXIT");
		System.out.println("5. VIEW");
		select=sc.nextInt();
		switch (select){
			case 1:
				do{
			
			fd.printMenu(food);
			System.out.println("SELECT WHICH ITEM TO EDIT");
			edit=sr.nextInt();
			int j=edit-1;
			
				System.out.println("ENTER NEW FOOD ITEM");
				newFood=sn.nextLine();
				System.out.println("ENTER NEW PRICE");
				newPrice=sv.nextFloat();
				food.get(j).setFoodItem(newFood);
				food.get(j).setPrice(newPrice);
				//System.out.println(food.get(i).getFoodItem());
				fd.printMenu(food);
				
			
			System.out.println("DO YOU WISH TO EDIT MORE? 1.YES 2.NO");
		x=ss.nextInt();
			}while(x==1);
			
		 break;
			
			case 2:
				do{
			fd.printMenu(food);
			System.out.println("SELECT WHICH ITEM TO DELETE");
			delete=sr.nextInt();
			
				food.remove(delete-1);
				fd.printMenu(food);
			
			System.out.println("DO YOU WISH TO DELETE MORE? 1.YES 2.NO");
		x=ss.nextInt();
			
			}while(x==1);
			
			
		break;
		
		case 3:
			do{
				fd.printMenu(food);
			System.out.println("Enter how many items need to be added");
		int n=sc.nextInt();
		
		int j=food.size();
		 for(int i=0;i<n;i++)
			
		{ 
				
			
			
			System.out.println("Enter the food");
			String foo=sc.next();
			
			food.add(new Food());
			food.get(j).setFoodItem(foo);		
		
		
		
			System.out.println("Enter the Price for "+foo);
			float price=sc.nextFloat();
			food.get(j).setPrice(price);		
		fd.printMenu(food);
	

		j++;
		
		}	System.out.println("DO YOU WISH TO ADD MORE? 1.YES 2.NO");
		x=ss.nextInt();
			}while(x==1);
			
			break;
		case 4: 
			hh.displayHotel();
			
			 break;
			 
		case 5:
			fd.printMenu(food);
			break;
		}System.out.println("GO TO ADMIN PANEL? 1. Yes 2.No");
		option=ss.nextInt();
		}while(option==1);
		
	}
	
}