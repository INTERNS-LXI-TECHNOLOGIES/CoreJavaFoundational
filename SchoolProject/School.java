import java.util.ArrayList;

public class School{
     
    String schoolName;
    String schoolAddress;
    ClassRoom classroom1;
    

    public School(String schoolName, String schoolAddress, ClassRoom classroom1){

        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.classroom1 = classroom1;

    }
    public void printDetails(){
        System.out.println("school name: " + schoolName + " school address: " + schoolAddress + " class romm: " + classroom1);
    }
  
}