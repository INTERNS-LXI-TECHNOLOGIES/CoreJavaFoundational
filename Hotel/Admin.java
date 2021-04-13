import java.util.*;
import java.util.Scanner;
class Admin
 {
    Scanner sc=new Scanner(System.in);
	
	String aName="Sai Krishna",uname,pwd;
    int option,select,v,si;
   ArrayList<Drink> drinks = new ArrayList<Drink>();
   ArrayList<Food> food = new ArrayList<Food>();
   
   Food f=new Food();
   Drink d=new Drink();
	
	public void authenticate()
	{

		System.out.println("Enter the Username of the Admin");
		uname=sc.nextLine();
		if(uname.equals("saiskp"))
		{
			System.out.println("Username Authenticated!!!");
			System.out.println("Enter the Admin Password");
			pwd=sc.nextLine();

			if(pwd.equals("sai"))
			{
				System.out.println("Password Perfect !!! Admin name is : "+aName);
				adminOperate();
			}
			else
			{
				System.out.println("Incorrect Password !!!");
			}
		}
		else
		{
			System.out.println("Username Invalid !!! Try Again !!!");
		}
	}
public void adminOperate()
{
	System.out.println("What operation do you want to perform ? ");
	System.out.println("--------------------------------------------------");
	System.out.println("1.Add item");
	System.out.println("2.Update/Edit Item");
	System.out.println("3.Remove Item");
	System.out.println("4.View Menu Card");
    System.out.println("---------------------------------------------------");
	option=sc.nextInt();
	switch(option)
	                  {
						  case 1://add
						                     System.out.println("Admin can add ..........1.Food Item.........2.Drink");
											 select=sc.nextInt();
											 if(select==1)
											 {
												 addFood(food);
											 }
											 else if(select==2)
											 {
											      addDrink(drinks);	 
											 }
											 else
											 {
											System.out.println("Invalid Input!!!!!!!!!!");	 
											 }
									break;
						  case 2://update
												  updateItems(food,drinks);
									break;
						  case 3://remove
						                             System.out.println("remove");
						            break;
						  case 4://view
						                viewList(food,drinks);
							         break;
					  }
	
}
//Addition of food items & Drinks
int num,qty;
float price;
String fud,drk;

public void addFood(ArrayList<Food> food)
{
	System.out.println("Enter the number of food items to be added");
    num=sc.nextInt();

	si=food.size();

	for(int i=0;i<food.size();i++)
	{
		System.out.println("Enter name of Food :");
		fud=sc.nextLine();
		food.add(new Food());
		food.get(si).setFoodName(fud);
		
		System.out.println("Enter Quantity of Food :");
		qty=sc.nextInt();
		food.get(si).setFoodQty(qty);
		
		System.out.println("Enter price of Food :");
		price=sc.nextFloat();
		food.get(si).setFoodPrice(price);
		
		si++;
	}
	
}
public void addDrink(ArrayList<Drink> drinks)
{
	System.out.println("Enter the number of drinks to be added");
    num=sc.nextInt();

	si=drinks.size();

	for(int i=0;i<drinks.size();i++)
	{
		System.out.println("Enter name of Drink :");
		drk=sc.nextLine();
		drinks.add(new Drink());
		drinks.get(si).setDrinkName(drk);
		
		System.out.println("Enter Quantity of Drink :");
		qty=sc.nextInt();
		drinks.get(si).setDrinkQty(qty);
		
		System.out.println("Enter price of Drink :");
		price=sc.nextFloat();
		drinks.get(si).setDrinkPrice(price);
		
		si++;
	}	
}

//Updating the list
int n,m,nfq,ndq;
float prc,dpr;
String newFud,newDrk;

public void updateItems(ArrayList<Food> food , ArrayList<Drink> drinks)
{
System.out.println("Enter the List you want to update.............1.Food........2.Drink");
select=sc.nextInt();
switch(select)
{
           case 1:
                         //Food Update/Edit
                          System.out.println("Enter the number to be edited");
                          n=sc.nextInt();
                          m=n-1;//index starts from zero
                            
							System.out.println("Enter new Food Item :");
							newFud=sc.next();
							
							System.out.println("Enter quantity of new Food Item :");
							nfq=sc.nextInt();
							
							System.out.println("Enter Price of new Food Item :");
							prc=sc.nextFloat();
							
							
                           food.get(m).setFoodName(newFud);							
						   food.get(m).setFoodQty(nfq);
                           food.get(m).setFoodPrice(prc);						   
                       break;				

            case 2:
                         //Drinks Update/Edit
                          System.out.println("Enter the number to be edited");
                          n=sc.nextInt();
                          m=n-1;//index starts from zero
                            
							System.out.println("Enter new Drink name:");
							newDrk=sc.next();
							
							System.out.println("Enter quantity of new Drink :");
							ndq=sc.nextInt();
							
							System.out.println("Enter Price of new Drink :");
							dpr=sc.nextFloat();
							
							
                           drinks.get(m).setDrinkName(newDrk);							
						   drinks.get(m).setDrinkQty(ndq);
                           drinks.get(m).setDrinkPrice(dpr);						   
                       break;									   
}
}

public void viewList(ArrayList<Food> food, ArrayList<Drink> drinks)
{
	
	System.out.println("Which List do you want to view......1.Food Items........2.Drinks.....");
									  v=sc.nextInt();
									  if(v==1)                          //Food List
									  {
										System.out.println("--------------------MENU[FOOD-ITEMS]---------------------");
									    Iterator ite=food.iterator();
									    while(ite.hasNext())
									   {
										  Object o=ite.next();
										  System.out.println(o);
									   }
									   System.out.println("------------------------------------------------------------");  
									   }
						              
									  else if(v==2)                   //Drinks List
									  {
										  System.out.println("--------------------MENU[Drinks]---------------------");
								          Iterator iter=drinks.iterator();
									      while(iter.hasNext())
									     {
										  Object o=iter.next();
										  System.out.println(o);
									      }
									     System.out.println("-------------------------------------------------------------------");
									   }
									   else
									   {
										   System.out.println("Enter a valid number !");
									   }
}
 
}