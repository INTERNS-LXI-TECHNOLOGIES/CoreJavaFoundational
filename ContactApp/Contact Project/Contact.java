public class Contact
{
 	

	private  PersonDetails[] persons = new PersonDetails [20];



    public PersonDetails[] getPersons()
	 {
		 return persons;
	 }
       public void setPersons(PersonDetails[] persons)	 
	 {
		  this.persons = persons;
	 }
		
		
		public Contact()
		
		{

        for(int i=0;i<20;i++)
		{
			
		persons[i] = new PersonDetails();	
			
			
		}

		}
	   
	 public String toString()
	 
	   {
		 String list = "";
		 
		 for (PersonDetails persons: persons)
		 {
              if(persons.getName()!=null)
                {
                  list = list+persons;
                return list; 
                }

		  	 
		 }
		   return ""; 
	     }		 
	 
}
	
