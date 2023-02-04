public class Scientist extends HumanBeing
{

public Scientist(String name,int age,String branch,String profession,String speciality) 
{
super(name,age,branch,profession,speciality);

}

public void scientistDetails()
{
System.out.println("\n........SCIENTIST........\n");
System.out.println("Name : "+name); 
System.out.println("Age : "+age);
System.out.println("Branch : "+branch);
System.out.println("Profession : "+profession);
System.out.println("Speciality : "+speciality);

}
}