import java.util.*;
public class Hotel
{
	String name,place;
	Admin admin=new Admin();
	

	void setDetails()
	{
		System.out.println("\tWelcome to **CafeIn**");
		System.out.println("\tPlace: Thodupuzha");
		System.out.println("\t***************");

	}
	void select()
	{
		Scanner scan=new Scanner(System.in);
		int u;
		 System.out.println("Select the user");
		 System.out.println("1.Admin \n2.User");
		 u=scan.nextInt();
		  switch(u)
		  {
		  	case 1:System.out.println("Admin");
		  			admin.adminCheck();
		  			admin.adminChoice();
		  			break;
		  	case 2:System.out.println("User");
		  				//user();
		  				break;
		  	default:System.out.println("Error");

		  }
		  }
		void menu()
		{
			FoodItems[] food=new FoodItems[10];
			for(int i=0;i<5;i++)
			{
				food[i]=new FoodItems();
			}
			food[0].name="Biriyani";
			food[0].price=110;
			food[1].name="Porotta";
			food[1].price=50;
			food[2].name="Noodles";
			food[2].price=150;
			food[3].name="Masala Dosa";
			food[3].price=80;
			food[4].name="BBQ";
			food[4].price=150;
			System.out.println("\t****MENU*****");
			for(int i=0;i<5;i++) 
			{
						System.out.println(food[i].name);
						System.out.println("\t"+food[i].price);

			}
}
}