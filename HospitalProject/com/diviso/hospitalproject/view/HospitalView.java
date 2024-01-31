package com.diviso.hospitalproject.view;
import com.diviso.hospitalproject.controller.*;
import com.diviso.hospitalproject.model.*;
import java.util.*;

public class HospitalView {

    
    
public void displayMenu() {
    System.out.println("1. Add a new Patient");
    System.out.println("2. Search by Registerion Number");
    System.out.println("3. Exit");
    
}

public void displayPatientDetails(HospitalModel patient) {
    System.out.println("Patient Name: " + patient.getPatientName());
    System.out.println("Patient Address: " + patient.getPatientAddress());
    System.out.println("Registeration Number: " + patient.getRegisterationNumber());
    System.out.println("Patient Disease: " + patient.getPatientDisease());
    System.out.println("----------------------------");
}

public void viewDetails(){
       HospitalController hospitalController = new HospitalController();
       Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Choose an option:");
    System.out.println("1. Add Patients");
    System.out.println("2. Display All Patients");
    System.out.println("3. Check Patients by Registeration Number");
    System.out.println("4. Exit");

    String flag = scanner.nextLine();

    switch (flag) {
        case "1":

            System.out.println("Enter Patient Name:");
            String patientName = scanner.nextLine();
            System.out.println("Enter Patient Address:");
            String patientAddress = scanner.nextLine();
            System.out.println("Enter Registeration Number:");
            String registerationNumber = scanner.nextLine();
            System.out.println("Enter Patient Disease :");
            String patientDisease = scanner.nextLine();

            HospitalModel hospital = new HospitalModel(patientName, patientAddress, registerationNumber,patientDisease);
            hospitalController.addPatient(hospital);
            break;

        case "2":
            hospitalController.displayAllPatients();
            break;

        case "3":
            
            System.out.println("Enter Registeration Number to check:");
            String registerationNumberToCheck = scanner.nextLine();
            hospitalController.checkPatientByRegisterationNumber(registerationNumberToCheck);
            break;

        case "4":
            System.out.println("Exit From The Application");

        default:
            System.out.println("Invalid value Please choose a valid option");
    }
}


}
}