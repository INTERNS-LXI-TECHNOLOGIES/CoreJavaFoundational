package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.HotelControl;
import com.lxisoft.Model.*;
public class FileRepository implements Repository
{
	File file=new File("D:\\Food.csv");
	File stocks=new File("D:\\Stock.csv");
	FoodModel food=new FoodModel();
	public void saveData(HotelModel mhotel)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<mhotel.getFoodList().size();i++)
			{
				bw.write(mhotel.getFoodList().get(i).getId()+","+mhotel.getFoodList().get(i).getFoodName()+","+mhotel.getFoodList().get(i).getFoodPrice()+"\n");  		
			}
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}	
	public void displayAll()
	{	
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null)
			{	
				String[] s=str.split(",",3);
				food.setId(Integer.parseInt(s[0]));
				food.setFoodName(s[1]);
				food.setFoodPrice(Integer.parseInt(s[2]));
				System.out.println(s[0] + (s[1]) + (s[2]));	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
	 	}
	}		
	public void addToStock(HotelModel mhotel,StockModel stock)
	{
		try
		{					
			FileWriter fwr=new FileWriter(stocks,false);
			BufferedWriter bwr=new BufferedWriter(fwr);
			
			for(int j=0;j<mhotel.getStockList().size();j++)
			{	
				bwr.write(mhotel.getFoodList().get(j).getId()+","+mhotel.getFoodList().get(j).getFoodName()+","+mhotel.getStockList().get(j).getFoodQuantity()+"\n");
			}
			bwr.flush();
			bwr.close();				
		}
		catch(Exception e)
		{
			System.out.println(e+"Error");
			e.printStackTrace();
		}
	}	
	public void readToStock(HotelModel mhotel)
	{	
		try
		{
			FileReader frs=new FileReader(stocks);
			BufferedReader bfr=new BufferedReader(frs);
			String string;
			while((string=bfr.readLine())!=null)
			{	
				String[] ss=string.split(",",3);
				StockModel stocks=new StockModel();
				food.setId(Integer.parseInt(ss[0]));
				food.setFoodName(ss[1]);
				stocks.setFoodQuantity(Integer.parseInt(ss[2]));
				System.out.println(ss[0] + (ss[1]) + (ss[2]));	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}	
}


		
			



	