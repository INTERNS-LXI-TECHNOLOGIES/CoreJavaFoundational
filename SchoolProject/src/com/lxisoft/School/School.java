package com.lxisoft.School;
public class encapsulation;
public class School

{
    Classroom[] classrooms;
    private String schoolname;
    public void setschoolname(String a)
    this.schoolname=a;
}
    Classroom classroom=new Classroom();

     public void printSchool()
     {
      
    System.out.println();
    System.out.println("           **************************************************************");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           *                 MOUNT HIRA ENGLISH SCHOOL                                                                                                   *");   
    System.out.println("           *                        Pattambi                                                                                                             *");
    System.out.println("           *         Kondoorkara PO. Palakkad Kerala pin 679303                                                                                          *");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           *                  STUDENTS DATABASE                                                                                                         *");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           *                                                                                                                                             *");
    System.out.println("           **************************************************************");
      }
      
  

     
  
     public void printStudent()
    {
        classroom.setTeacher();
        classroom.setStudent();
       classroom.printStudents();
      
     }
 
 }