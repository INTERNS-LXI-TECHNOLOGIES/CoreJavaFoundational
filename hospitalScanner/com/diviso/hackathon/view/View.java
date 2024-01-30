
package com.diviso.hackathon.view;

import java.util.*;
import com.diviso.hackathon.controller.Controller;

public class View {

    static Scanner scan = new Scanner(System.in);
    Controller control = new Controller();

    public void uI() {
        
        boolean check = true;
        while (check) {

            System.out.println("press 1 : To Create Name");
            System.out.println("press 2 : To Search And Get The Patient Details");
            System.out.println("press 3: To Quit");

            switch (scan.nextLine()) {

                case "1":
                    control.createPatientDetails();
                    break;

                case "2":

                    control.searchPatientDetails();
                    break;

                case "3":
                    check = false;
                    break;

                default:
                    System.out.println("Error");

            }

        }

    }

}