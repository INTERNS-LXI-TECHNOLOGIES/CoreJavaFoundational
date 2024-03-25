public class Exam
{
	private Subject[] subject=new Subject[3];
	int totalmark=0; 
	
	public void setSubject(Subject[] subject)
	{
		this.subject=subject;
	}
	public Subject[] getSubject()
	{
		return subject;
	}
	
	
	
	public int totalMark()
	{
		for(int i=0;i<subject.length;i++)
		{
			totalmark+=subject[i].getMark();
		}
		return totalmark;
	}

		



	public String toString()
	{
		String tostring="";
		
		for(int i=0;i<subject.length;i++)
		{
			tostring+=subject[i];
		}
		return tostring;
			
	}	
	






}