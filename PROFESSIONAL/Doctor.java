public class Doctor extends HumanBeing
{

public Doctor(String name,int age,String branch,String profession,String speciality) 
{
super(name,age,branch,profession,speciality);

}	

public void doctorDetails()	
{
System.out.println("\n..........DOCTOR ........\n");
System.out.println("Name : "+name); 
System.out.println("Age : "+age);
System.out.println("Branch : "+branch);
System.out.println("Profession : "+profession);
System.out.println("Speciality : "+speciality);
}
} 