public class Student{

  
    int studentId;
    String studentName;
    public Student(int stid, String name){
      studentId = stid;
      studentName = name;
    }

    public void printDetails(){
    
      System.out.println("student id: " + studentId + " student name: " + studentName);
    }
}
