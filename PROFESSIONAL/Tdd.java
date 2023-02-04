public class Tdd
{
	
public static void main(String[]args)
{
	
HumanBeing[] humans = new HumanBeing[5];

humans[0] = new Doctor("Dr.Ram",26,"Super Seciality Hospital Nadathara","Doctor","Cardiologist");
humans[1] = new Doctor("Dr.Rohan",27,"KVM Hospitals Ernakulam","Doctor","Neorplogist");	
humans[2] = new Engineer("Sai",29,"Info park","Engineer","Computer Programmer");
humans[3] = new Engineer("Krishna",30,"Info Technology","Engineer","Computer Programmer");
humans[4] = new Scientist("Dr.Lokesh",40,"ASSCI Academy Reserch Centre","Scientist","Reserch in thermodynamics");

for(HumanBeing human: humans)
{	
if (human instanceof Doctor)
{
((Doctor)human).doctorDetails();
}
else if(human instanceof Engineer)
{
((Engineer)human).engneerDetails(); 
}
else
{
((Scientist)human).scientistDetails(); 
}	
}
}		
}