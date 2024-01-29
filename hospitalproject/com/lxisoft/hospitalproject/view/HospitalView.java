package com.lxisoft.hospitalproject.view;
import com.lxisoft.hospitalproject.controller.*;
import com.lxisoft.hospitalproject.model.*;
import java.util.*;
public class HospitalView {

    Patient patient = new Patient();
    Hospital hospital = new Hospital();
    HospitalController controller = new HospitalController();

    Scanner scanner = new Scanner(System.in);

    public void setHospitalService(){
         boolean result = true;
        while(result){
            System.out.println("........WELCOME TO LAKESHORE HOSPITAL.......");
            System.out.println("Press 1: Add Patient Details");
            System.out.println("Press 2: Show Patient Details");
            System.out.println("Press 3: Search Patient");
            System.out.println("Press 4: To Exit");

            String getResult = scanner.nextLine();
        switch(getResult){
            case "1":
                controller.addPatientDetails();
                break;
            case "2":
                controller.showPatientDetails();
                break;
            case "3":
                controller.searchPatient();
                break;
            case "4":
                System.out.print("Exit");
                result = false;
                break;
        }
        }

    }
}