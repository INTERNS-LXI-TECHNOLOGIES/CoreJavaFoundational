package com.diviso.hackathon.controller;

import com.diviso.hackathon.model.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import com.diviso.hackathon.model.Model;

public class Controller {

    static Scanner scan = new Scanner(System.in);
    static List<Model> details = new ArrayList<Model>();
    Model model = new Model();

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

        if (details.contains(model)) {
            int getDetails = details.indexOf(model);

            System.out.println("patient name" + getDetails + model.getName());
            System.out.println("patient age" + getDetails + model.getAge());
            System.out.println("patient problem" + getDetails + model.getPatientProblem());

        } else {
            System.out.println("error");
        }

    }

}