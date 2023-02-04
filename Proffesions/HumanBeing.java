public class HumanBeing
{
String name;
int age;
String branch;
String profession;
String speciality;

void printHumanDetails(HumanBeing[] humanArray)
{

for(HumanBeing i : humanArray)
{
if(i instanceof Doctor)
{
System.out.println("\n" + "--------DOCTOR--------" + "\n");
System.out.println(i.name+"\n"+ i.age+"\n"+ i.branch+"\n"+ i.profession+"\n"+ i.speciality);	
}
else if(i instanceof Engineer)
{
System.out.println("\n" + "--------ENGINEER--------" + "\n");
System.out.println(i.name+"\n"+ i.age+"\n"+ i.branch+"\n"+ i.profession+"\n"+ i.speciality);	
}
else
{
System.out.println("\n" + "--------SCIENTIST----------------" + "\n");
System.out.println(i.name+"\n"+ i.age+"\n"+ i.branch+"\n"+ i.profession+"\n"+ i.speciality);	
}
}
}
}