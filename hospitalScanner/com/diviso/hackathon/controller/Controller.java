package com.diviso.hackathon.controller;

import com.diviso.hackathon.model.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import com.diviso.hackathon.model.Patient;

public class Controller {

    static Scanner scan = new Scanner(System.in);
    static List<Patient> details = new ArrayList<Patient>();
    Patient model = new Patient();

    public void createPatientDetails() {

        System.out.println("Patient Name");
        model.setName(scan.nextLine());
        System.out.println("Patient Age");
        model.setAge(scan.nextLine());
        System.out.println("Patient Problem");
        model.setPatientProblem(scan.nextLine());

        details.add(model);

    }

    public void searchPatientDetails() {
        Patient m=new Patient();
        System.out.println("ENTER YOUR NAME");
        m.setName(scan.nextLine());
        if (details.contains(m)) {
            int getDetails = details.indexOf(m);

            System.out.println("patient name" + details.get(getDetails).getName());
            System.out.println("patient age" + details.get(getDetails).getAge());
            System.out.println("patient problem" + details.get(getDetails).getPatientProblem());

        } else {
            System.out.println("error");
        }

    }

}