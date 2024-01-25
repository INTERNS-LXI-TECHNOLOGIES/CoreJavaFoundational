public class Tdd{

public static void main(String[]args){
    
School school = new School();
school.name  = "ST.ANNS'S SENIOR SECONDARY SCHOOL";
school.address = "Address : Build no. 865/5564, Muttikulangara (P.O), Muttikulangara, Palakkad";
school.number = "Phone : 0491 2832226,2832266  Mob : +919447533989";
System.out.println("\t"+"\t"+school.name);
System.out.println("\n"+school.address);
System.out.println(school.number);

school.playground = new Playground();
school.playground.name = "Name : Justice";
school.playground.area = "Area : 150m x 50m";
school.playground.teacherpg = "Teacher : Arunima S";
System.out.println("\n"+"Play Area");
System.out.println(school.playground.name+"\n"+school.playground.area+"\n"+school.playground.teacherpg);
 
school.playground.teacher = new Teacher();
school.playground.teacher.age = "Age : 32";
school.playground.teacher.gender = "Gender : Female";
System.out.println("\n"+"\t"+school.playground.teacher.age+"\n"+"\t"+school.playground.teacher.gender);
	
school.classroom = new Classroom();
school.classroom.cls= "Class : II B";
school.classroom.teacher = new Teacher();
school.classroom.teacher.name = "Teacher Incharge : Reshma R";
school.classroom.teacher.gender = "Gender : Female";
school.classroom.teacher.number = "Mob : +919446669993";
System.out.println("\n"+"\t"+"Classroom Details");
System.out.println(school.classroom.cls+"\n"+school.classroom.teacher.name);
System.out.println(school.classroom.teacher.gender+"\n"+school.classroom.teacher.number);

school.classroom.student[0]= new Student();
school.classroom.student[0].name="Name : Bijoy B";
school.classroom.student[0].age="Age : 8";
school.classroom.student[0].gender="Gender : Male";
System.out.println("\n"+"Student Details :-"+"\n"+"\t"+school.classroom.student[0].name);
System.out.println("\t"+school.classroom.student[0].age);
System.out.println("\t"+school.classroom.student[0].gender);

school.classroom.student[1]= new Student();
school.classroom.student[1].name="Name : Parvathy Suresh";
school.classroom.student[1].age="Age : 8";
school.classroom.student[1].gender="Gender : Female";
System.out.println("\n"+"\t"+school.classroom.student[1].name);
System.out.println("\t"+school.classroom.student[1].age);
System.out.println("\t"+school.classroom.student[1].gender);

school.classroom.student[2]= new Student();
school.classroom.student[2].name="Name : Anjali J";
school.classroom.student[2].age="Age : 8";
school.classroom.student[2].gender="Gender : Female";
System.out.println("\n"+"\t"+school.classroom.student[2].name);
System.out.println("\t"+school.classroom.student[2].age);
System.out.println("\t"+school.classroom.student[2].gender);
	
school.classroom.student[3]= new Student();
school.classroom.student[3].name="Name : Palunni";
school.classroom.student[3].age="Age : 10";
school.classroom.student[3].gender="Gender : Male";
System.out.println("\n"+"\t"+school.classroom.student[3].name);
System.out.println("\t"+school.classroom.student[3].age);
System.out.println("\t"+school.classroom.student[3].gender);

school.classroom.student[4]= new Student();
school.classroom.student[4].name="Name : Roshan Mathew";
school.classroom.student[4].age="Age : 8";
school.classroom.student[4].gender="Gender : Male";
System.out.println("\n"+"\t"+school.classroom.student[4].name);
System.out.println("\t"+school.classroom.student[4].age);
System.out.println("\t"+school.classroom.student[4].gender);
	
	
	
 }



}