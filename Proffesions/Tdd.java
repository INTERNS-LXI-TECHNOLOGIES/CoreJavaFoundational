public class Tdd
{
public static void main(String[] args)
{
HumanBeing[] humanArray = new HumanBeing[5];

HumanBeing humanBeing = new HumanBeing();

HumanBeing doctor1 = new Doctor();
doctor1.name = "Dr jaya Chandran";
doctor1.age = 60;
doctor1.branch = "Devi Hospital Tripunithura";
doctor1.profession = "Doctor";
doctor1.speciality = "Pediatrician";
humanArray[0] = doctor1;

HumanBeing doctor2 = new Doctor();
doctor2.name = "Nirmala Mathav";
doctor2.age = 55;
doctor2.branch = "P.S Mission Hospital Maradu";
doctor2.profession = "Doctor";
doctor2.speciality = "Gynaecologist";
humanArray[1] = doctor2;

HumanBeing engineer1 = new Engineer();
engineer1.name = "Jackson Joseph";
engineer1.age = 32;
engineer1.branch = "U.S.T Gobal";
engineer1.profession = "Engineer";
engineer1.speciality = "Java Programming Language";
humanArray[2] = engineer1;

HumanBeing engineer2 = new Engineer();
engineer2.name = "Nimmy Joseph";
engineer2.age = 25;
engineer2.branch = "L.X.I Technologies";
engineer2.profession = "Engineer";
engineer2.speciality = "Java Programming Language";
humanArray[3] = engineer2;

HumanBeing scientist = new Scientist();
scientist.name =  "Albert Einstein";
scientist.age = 70;
scientist.branch = "Nasa";
scientist.profession = "Scientist";
scientist.speciality = "Astronomy and Space Science";
humanArray[4] = scientist;

//System.out.println([i] instanceof Doctor);
/*System.out.println("\n" + "--------DOCTOR1 DETAILS--------" + "\n");
((Doctor) doctor1).printDoctorDetails();


System.out.println("\n" + "--------DOCTOR2 DETAILS--------" + "\n");
((Doctor) doctor2).printDoctorDetails();

System.out.println("\n" + "--------ENGINEER1 DETAILS--------" + "\n");
((Engineer) engineer1).printEngineerDetails();

System.out.println("\n" + "--------ENGINEER2 DETAILS--------" + "\n");
((Engineer) engineer2).printEngineerDetails();

System.out.println("\n" + "--------SCIENTIST DETAILS--------" + "\n");
((Scientist) scientist).printScientistDetails();*/
humanBeing.printHumanDetails(humanArray );
}
}	
