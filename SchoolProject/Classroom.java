import java.util.Scanner; 

public class Classroom
{

	int std;
	Teacher teacher;
	
	Student[] student;
	
	public void scan()
	{
		int i,o;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the standard");
		std=sc.nextInt();
		System.out.println("enter no. of students");
		o=sc.nextInt();

		teacher=new Teacher();
		teacher.scan();
		student=new Student[o];
		for(i=0;i<o;i++)
		{
			student[i]=new Student();
			student[i].scan();
		}
		
	}


	public void print()
	{
	int i,o;
	o=student.length;
	System.out.println(" standard :- "+std);
	teacher.print();

	for(i=0;i<o;i++)
	{
		student[i].print();
	}
	}

	public void rank()
	{
		int i,o,j;
		o=student.length;
		Student temp=new Student();
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				if(student[i].total>student[j].total)
				{
					temp=student[i];
					student[i]=student[j];
					student[j]=temp;
				}
			}
		}
		System.out.println("Classwise rank");
		for(i=0;i<o;i++)
		{
			System.out.println("Rank: "+(i+1)+" Totalmark: "+(student[i].total)+" Name is "+(student[i].stName));
		}
	}
}