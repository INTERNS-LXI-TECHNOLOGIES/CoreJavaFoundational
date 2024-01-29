package com.lxisoft.hospitalproject.controller;
import com.lxisoft.hospitalproject.model.*;
import com.lxisoft.hospitalproject.view.*;
import java.util.*;

public  class HospitalController {
    private List<Patient> patientList = new ArrayList<>();
    

     Scanner sc = new Scanner(System.in);

public void addPatientDetails(){
    Patient patient = new Patient();
    System.out.println("PLEASE PROVIDE PATIENT'S DETAILS..................");
    System.out.println("Enter patient's name");
    patient.setPatientName(sc.nextLine());

System.out.println("Enter patient's age");
patient.setAge(Integer.parseInt(sc.nextLine()));

System.out.println("Enter patient's decease");
patient.setSick(sc.nextLine());

patientList.add(patient);
 }

    public void showPatientDetails(){
        System.out.println("<<<<<<<<<<<<<<Patient Details>>>>>>>>>>>>>>");

        for(Patient p : patientList){
            System.out.println("Patient Name:" + p.getPatientName());
            System.out.println("Patient Age:"+  p.getAge());
            System.out.println("Decease:" + p.getSick());

        }
    }
    public void searchPatient(){

        System.out.println("Enter Patients Name");
        String name = sc.nextLine();
        boolean patientFound = false;
    for(Patient p : patientList)   
    {
        if(p.getPatientName().equals(name)){
    patientFound = true;
            System.out.print("...................PATIENT DETAILS..................\n");
            System.out.println("Patient Name:" + p.getPatientName());
            System.out.println("Patient Age:"+  p.getAge());
            System.out.println("Decease:" + p.getSick());

        }
       
        }
        if (!patientFound) {
            System.out.println("Patient not found");
        }
    }
    

    }
    