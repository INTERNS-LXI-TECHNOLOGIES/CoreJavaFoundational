public class School{
    public static void main(String[] args){

         schoolTheme school1 = new schoolTheme();
         school1.schoolName = "fanshwe Businees school";
         school1.address = "605 oxford and wonderland,london, ontario, canada";
         school1.classNumbers = 5;//This number attribute not needed
         school1.StdNumbers = 100; //School does not need student numbers details(class room has students)
         school1.teacherNumbers = 7; //School does not need teacher numbers details(class room has teachers)

            
    }
}


 class schoolTheme{
     
    String schoolName;
    String address;
    int classNumbers;
    int StdNumbers;
    int teacherNumbers;
    
		
   
}
