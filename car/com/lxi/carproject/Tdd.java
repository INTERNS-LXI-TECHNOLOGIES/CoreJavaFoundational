package com.lxi.carproject;
public class Tdd
{

	public static void main(String[] args)
	{
		Car[] c=new Car[5];
		
		for(int i=0;i<4;i++)
			{
			c[i]=new Car();
			c[i].setBrandName("TATA");
			c[i].setRegNumber("KL 3741 B");
			
			for(int k=0;k<4;k++)
			{
			c[i].door[k]=new Door();
			c[i].door[k].setColour("BLUE");
			}
		for(int j=0;j<4;j++)
		{
			c[i].tyre[j]=new Tyre();
			c[i].tyre[j].setTyreBrand("CEAT");
		}
		c[i].steering=new Steering();
		c[i].steering.setColour("RED");
		
		
			}
			for(int l=0;l<5;l++)
			{
			System.out.println(c[l]); 
			}
	}
	
}


