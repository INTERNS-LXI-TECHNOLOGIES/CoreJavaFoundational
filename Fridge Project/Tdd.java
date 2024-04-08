public class Tdd
{
	public static void main(String ar[])
	{
		
		Fridge fridge=new Fridge();

		fridge.setName("LG");
		
		
		
		for(int i=0;i<=1;i++)
		{
		fridge.getFruits()[i]=new Apple();
		
		fridge.getFruits()[i].setName("Apple");
		}
		
		
		for(int i=2;i<=6;i++)
		{
			
		fridge.getFruits()[i]=new Orange();
		
		fridge.getFruits()[i].setName("Orange");
		
		}
		
		for(int i=7;i<=9;i++)
		{
			fridge.getFruits()[i]=new Banana();
		
			fridge.getFruits()[i].setName("Banana");
		}
		
		
		Fridge appleFridge=new Fridge();
		Fridge orangeFridge=new Fridge();
		Fridge bananaFridge=new Fridge();
		
		
		
		for(int i=0,j=0,k=0,m=0;i<fridge.getFruits().length;i++)
		{
			if(fridge.getFruits()[i] instanceof Apple)
			{
				appleFridge.apple[j]=(Apple)fridge.getFruits()[i];
				j++;
				
			}
			else if(fridge.getFruits()[i] instanceof Orange)
			{
				
				orangeFridge.orange[k]=(Orange)fridge.getFruits()[i];
				k++;
			}
			else
			{
				
				bananaFridge.banana[m]=(Banana)fridge.getFruits()[i];
				m++;
			}
		}
	
				appleFridge.appleFridge();
					
				orangeFridge.orangeFridge();
				
				bananaFridge.bananaFridge();
				
				
				
				for( int i=0,j=0;i<=3;i++)
				{
				fridge.vegitables[i]= new Tomoto();
				
				fridge.vegitables[i].setName("Tomoto");
				fridge.vegitables[i].setRate(60);
				((Tomoto)fridge.vegitables[i]).setColor("Red");
				
				
				
				}
				
				
				
			
				for (int i=4;i<=6;i++)
				{
					fridge.vegitables[i]=new Bittermilon();
					
					fridge.vegitables[i].setName("Bittermilon");
					fridge.vegitables[i].setRate(40);
					((Bittermilon)fridge.vegitables[i]).setTaste("Bitterness");
					
				}
				
				
				
				
				
				
				Fridge tomotoFridge=new Fridge();
				Fridge bittermilonFridge=new Fridge();
				
				
				
				for(int i=0,j=0,k=0;i<fridge.vegitables.length;i++)
				{
				
				if(fridge.vegitables[i] instanceof Tomoto)
				{
				tomotoFridge.tomoto[j]=(Tomoto)fridge.vegitables[i];
					j++;
				}
				else if(fridge.vegitables[i] instanceof Bittermilon)
				{
					bittermilonFridge.bittermilon[k]=(Bittermilon)fridge.vegitables[i];
					k++;
				}
				}
				
				
		
		tomotoFridge.tomotoFridge();
		bittermilonFridge.bittermilonFridge();	

	}
}