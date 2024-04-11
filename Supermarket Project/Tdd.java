public class Tdd{
public static void main(String[] args ){

Supermarket supermarket = new Supermarket();

  supermarket.setName("K T P Supermarket");
  supermarket.setLocation("Piller no:225, Edapally");
  supermarket.setMobNumber(9447533989L);
  supermarket.setOwner("K T Pilla");
  
  String[] name = {"Thangamani","Janu","Monisha","Fathima","Princy","Arun","Felix","Gopalan"};
  int[] age = {52,48,25,30,24,28,33,45};
  long[] salary = {15000L,15000L,9500L,11500L,9500L,11500L,12000L,14000L,18000L};

   for (int i=0; i< supermarket.staff.length;i++){
	   if(i<=4){
		   supermarket.staff[i] = new Female(); 
	       supermarket.staff[i].setName(name[i]);
		   supermarket.staff[i].setAge(age[i]);
	       supermarket.staff[i].setSalary(salary[i]);
	   }
	   else{
		   supermarket.staff[i] = new Male();
		   supermarket.staff[i].setName(name[i]);
		   supermarket.staff[i].setAge(age[i]);
	       supermarket.staff[i].setSalary(salary[i]);
	   }
   }
 
System.out.println(supermarket);
supermarket.showAttendance();
supermarket.showSalaryDetails();


}
}