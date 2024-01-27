package view;
import java.util.Scanner;
import controller.HospitalController;

public class HospitalView {
    
    static Scanner scan=new Scanner(System.in);
    HospitalController cont=new HospitalController();
    
    public void hospitalservice(){

        boolean flow=true;
        while(flow){
            System.out.println("\3 WELCOME TO HEALTHY LIFE HOSPITAL \3");
            System.out.println("TYPE ONE TO FILL THE FORM");
            System.out.println("TYPE TWO TO PATIENT DEATILES");
            System.out.println("TYPE THREE TO EXIT ");
            String switchFlow=scan.nextLine();
            switch (switchFlow) {

                case "1":
                    cont.form();
                    break;
                case "2":
                    cont.patientDetails();
                    break;
                case"3":
                    flow=false;
                    break;
                default:
                    System.out.println("SORRY SOME INTERNEL ERROR");
                    break;
            }
        }

    }
}
