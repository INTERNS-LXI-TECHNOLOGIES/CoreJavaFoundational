
public class Teacher{ 

    
    String teacherName;
    String teacherSubject;



    public Teacher(String teacherName, String teacherSubject){

        this.teacherName = teacherName;
        this.teacherSubject = teacherSubject;

    }
    public void printDetails(){
        System.out.println("teacher name: " + teacherName + " teacher subject: " + teacherSubject );

    }
}
