public class Fridge
{
	
	private String name; 
	private Fruits[] fruits=new Fruits[10];
	
	 Apple[] apple=new Apple[2];
	 Orange[] orange=new Orange[5];
	 Banana[] banana=new Banana[3];
	 
	 
	 
	 Vegitables[] vegitables=new Vegitables[7];
	 
	 Tomoto[] tomoto=new Tomoto[4];
	 Bittermilon[] bittermilon=new Bittermilon[3];
	 
	 
	 
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}




		

	public void setFruits(Fruits[] fruits)
	{
		this.fruits=fruits;
	}
	public Fruits[] getFruits()
	{
		return fruits;
	}
	
	
	
	
	
	
	
			
		
			public void appleFridge()
	{
		
		System.out.println("\n\n Apple Fridge");
		
		
		for(int i=0;i<apple.length;i++)
		{
			System.out.println("\n "+apple[i]);
		}
	}
	
	
	
	
	
	public void orangeFridge()
	{
		System.out.println("\n\n Orange Fridge");
		
		for(int i=0;i<orange.length;i++)
		{
		System.out.println("\n "+orange[i]);
		}
	}
		
		
		
		public void bananaFridge()
		{
			System.out.println("\n\n Banana Fridge");
			
			for(int i=0;i<banana.length;i++)
			{
				System.out.println("\n "+banana[i]);
			}
		}
		
 

			public void tomotoFridge()
			{
				System.out.println("\n\n Tomoto Fridge");
				
				
				for (int i=0;i<tomoto.length;i++)
				{
					System.out.println("\n"+tomoto[i]);
				}
			}	
			
			
			
			
			
			public void bittermilonFridge()
			{
				
				System.out.println("\n\n Bittermilon Fridge");
				
				for(int i=0;i<bittermilon.length;i++)
				{
					System.out.println("\n"+bittermilon[i]);
				}
			}


		
		
		
		
		
		
		public String toString()
		{
			String a="";
			String b="";
			
			
			
			for(int i=0;i<vegitables.length;i++)
			{
				b+=vegitables[i];
			}
			
			
			
			for(int i=0;i<fruits.length;i++)
			{
				a+=fruits[i];
			}	
			
			return "\n Fridge Company NAME : "+name+a+b;
		}
}