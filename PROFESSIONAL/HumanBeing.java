public class HumanBeing
{
String name;
int age;
String branch;
String profession;
String speciality;
 
public HumanBeing(String name,int age,String branch,String profession,String speciality) 
{
this.name = name;
this.age = age;
this.branch = branch;
this.profession = profession;
this.speciality = speciality;	

}

public  void  printHumanDetails()

{
System.out.println("HUMANBEING DETAILS");

System.out.println(name+" " +age+" "+branch+" "+profession+" "+speciality);
	
	
}
		
}

