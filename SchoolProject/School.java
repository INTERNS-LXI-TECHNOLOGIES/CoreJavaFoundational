public class School{
     
    String schoolName;
    String schoolAddress;
    int classRoom;
    

    public School(String schoolName, String schoolAddress, int ClassRoom){

        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.classRoom = ClassRoom;

    }
    public void printDetails(){
        System.out.println("school name: " + schoolName + " school address: " + schoolAddress + "class romm: " + classRoom);
    }
   
}
