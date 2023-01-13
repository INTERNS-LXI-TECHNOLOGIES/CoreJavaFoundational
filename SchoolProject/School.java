import java.util.ArrayList;

public class School{
     
    String schoolName;
    String schoolAddress;
    ClassRoom classroom1;
    

    public School(String schoolName, String schoolAddress){

        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;


    }

    
    public void printDetails(){
        System.out.println("school name: " + schoolName + " school address: " + schoolAddress);
        classroom1.printdetails();
        
    }
  
}