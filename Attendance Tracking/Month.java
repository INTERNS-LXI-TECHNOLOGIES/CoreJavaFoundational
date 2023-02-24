public class Month
{
   private Day[] days = new Day[31];	
   
   
    public Day[] getDay()
	  {
		 return this.days;
	  }
     public void setDay(Day[] days)	 
	  {
		  this.days = days;
	  }
   
     public Month()
       {
	   for(int i=0;i<31;i++)
	   {
	 
       days[i]	= new Day();
		
	   }
		 
	   } 
	   public String toString()
	   {
		   String day ="";
	     for (Day d: days)
	   {		
			   
	    day = day+ "Day" + days;	
		
	   }   
	    return day;
       }
	  
}