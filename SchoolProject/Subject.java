import java.util.*;
public class Subject
{
	String subName;
	int subMark;


	void markCreate()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Subject Name : ");
		subName = sc.nextLine(); 
		System.out.println("Enter "+ subName +" Mark : ");
		subMark = sc.nextInt();
	}


	void printSubjectDetails()
	{
		System.out.println(this.subName+"\t"+this.subMark+"\n");

	}
}