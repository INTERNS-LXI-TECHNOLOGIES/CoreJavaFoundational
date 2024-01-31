package com.diviso.hospitalproject.controller;
import com.diviso.hospitalproject.model.*;
import java.util.*;

public class HospitalController{
    private List<HospitalModel> patients = new ArrayList<>();

    public void addPatient(HospitalModel patient) {
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    public void displayAllPatients() {
        System.out.println("List of Patients:");
        for (HospitalModel patient : patients) {
            System.out.println("Patient Name: " + patient.getPatientName()+"\n" +"  Patient Address: " + patient.getPatientAddress()+"\n" +"  Registeration Number: " + patient.getRegisterationNumber()+"\n" +"Patient Disease :"+ patient.getPatientDisease());
            System.out.println("\n");
        }
    }

    public void checkPatientByRegisterationNumber(String registerationNumber) {
        for (HospitalModel patient : patients) {
            if (patient.getRegisterationNumber().equals(registerationNumber)) {
                System.out.println("Patients found:");
                System.out.println("Patient Name: " + patient.getPatientName()+"\n" +" Patient Address: " + patient.getPatientAddress()+"\n" +"  Registeration Number: " + patient.getRegisterationNumber()+"\n" +"Patient Disease :"+ patient.getPatientDisease());
                System.out.println("\n");
                return;
            }
        }
        System.out.println("Car not found with register number: " + registerationNumber);
    }

   
        }
