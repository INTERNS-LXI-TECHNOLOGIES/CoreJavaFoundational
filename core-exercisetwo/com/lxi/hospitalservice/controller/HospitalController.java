package controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Patient;

public class HospitalController {
    Scanner scan = new Scanner(System.in);
    List<Patient> patientList =new ArrayList<>(); 

    public void form() {
        boolean flow = true;
        while (flow) {
            Patient p = new Patient();

            System.out.println("ENTER PATIENT NAME");
            p.setPatientName(scan.nextLine());

            System.out.println("ENTER PATIENT AGE");
            p.setPatientAge(input());

            System.out.println("ENTER PATIENT AILMENT");
            p.setAilment(scan.nextLine());

            patientList.add(p);

            System.out.println("ENTER YES TO CONTINUE AND NO TO BACK");
            String s = scan.nextLine();
            if (s.equalsIgnoreCase("no")) {
                flow = false;
            }
        }
    }

    private int input() {
        while (true) {
            try {
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for patient age.");
            }
        }
    }

    
    public void patientDetails() {
        Patient patient = new Patient();
        System.out.println("ENTER PATIENT NAME");
        patient.setPatientName(scan.nextLine());
    
        if (patientList.contains(patient)) {
            int i = patientList.indexOf(patient);
            System.out.println("PATIENT NAME: " + patientList.get(i).getPatientName());
            System.out.println("PATIENT AGE: " + patientList.get(i).getPatientAge());
            System.out.println("PATIENT AILMENT: " + patientList.get(i).getAilment());
        } else {
            System.out.println("PATIENT NOT FOUND");
        }
    }
    

}
