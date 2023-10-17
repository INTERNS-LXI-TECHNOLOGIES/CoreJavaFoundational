public class Main
{
public static void main(String[] args)
{
  Human doctor = new Doctor();
   doctor.name = "vasu";
   doctor.age = 38;
   doctor.address = "abcd";
   doctor.contactNumber = 1234567;
  ((Doctor)doctor).printDoctorsDetails();
  
 
  Human engineer = new Engineer();
   engineer.name = "tanku";
   engineer.age = 46;
   engineer.address = "abcdefg";
   engineer.contactNumber = 123456789;
   //Engineer eng = ((Engineer)engineer);
    ((Engineer)engineer).printEngineersDetails();
   ((Engineer)engineer).canRun();
}
}