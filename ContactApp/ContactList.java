public class ContactList{
	
	private PersonDetail[] details = new PersonDetail[20];
	
	
	public ContactList()
	{
		for(int i = 0;i<20;i++)
		{
			details[i] = new PersonDetail();
		}
	}
	
	public PersonDetail[] getDetails()
	{
		return this.details;
	}
	
	
	public String toString()
	{
		String collections ="";
		
		for(PersonDetail persons: details)
		{
		
		 if(persons.getName()!=null)
		 {
			 collections = collections+persons;
			 //System.out.println(persons);
			 
			
		 }
		}
		return collections;
	}
	
	
	
}