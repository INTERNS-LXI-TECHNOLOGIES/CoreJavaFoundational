package com.lxisoft.Hotel;
import com.lxisoft.Hotel.*;

import java.util.*;
public class Menu
{
	Drinks dr = new Drinks();
	public Item[] item;
	public int iNum=-1,index=0;
	public int ind;
	int i;
	public Order ord = new Order();
	public void setFood()
	{
		
		item = new Item[20];
		for(int i=0;i<20;i++)
		{
			item[i] = new Item();
			
		}		
		item[0].setItem("Porotta",8,10);
		item[1].setItem("Ghee Roast",45,10);
		item[2].setItem("Masaala Dosa",40,10);
		item[3].setItem("Biriyani",120,10);
		item[4].setItem("Fried Rice",80,10);
		ind=4;
		
	}
	public void printMenu()
	{
		System.out.println("-----------------------------------------------------------------------"); 
		System.out.println("\t\t \t Menu \t");
		System.out.println("-----------------------------------------------------------------------");                                      
		System.out.println("ITEM NUMBER \t ITEM NAME \t       PRICE(Rs)         QUANTITY LEFT");
		System.out.println("-----------------------------------------------------------------------");
		for(int i=0;this.item[i].itemName!=null;i++)
		{
		item[i].printToAdmin(i);
		}
		System.out.println("-----------------------------------------------------------------------\n-----------------------------------------------------------------------");
		
	}
	
	public void ordering(int ind)
	{
		String ch;
		this.index=0;
		this.ord.setOrder();
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println(" =:> Select your Dish(Please enter the Item Number And press 0 to Submit) -> \n\t");
			iNum=in.nextInt();
			if(iNum<=(ind+1) && iNum >0)
			{
				this.selectOrder((iNum-1));			
			}
			else if(iNum==0)
			{
				System.out.println(" =:> Do you Placed your orders Completely (yes/no)");
				in.nextLine();
				ch=in.nextLine();
				if(ch.equals("yes"))
				{
					System.out.println("\n\t THANK YOU : ORDER PLACED \t");
				}
				else
				{
					iNum=1;
				}
			}
			else
			{
				System.out.println("\n ****INVALID ITEM NUMBER*******\n");
				iNum=1;
			}
			
		}while(iNum!=0);
		ord.setTotal(index);
		ord.printOrderDetails(index);
	}	


	public void selectOrder(int itemNumber)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quantity Required\n\t");
		this.ord.order[index].itemQuantity = in.nextInt();
		int ch = item[itemNumber].checkQuantity(this.ord.order[index].itemQuantity);
		if(ch==1)
		{
			this.ord.order[index].itemName=this.item[itemNumber].itemName;
			this.ord.order[index].itemPrice=this.item[itemNumber].itemPrice;
			index++;
		}
		
	}
	
}