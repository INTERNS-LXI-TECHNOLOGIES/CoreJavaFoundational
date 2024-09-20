package com.surveyapp.view;

import java.util.Scanner;

import com.surveyapp.model.Survey;

public class SurveyView {
    public void displaySurveyDetails(Survey survey) {
        System.out.println(survey);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1.Create your profile \n 2.Read the details \n 3.Update your details \n 4.Delete the details \n 5.exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("enter your name:");
                    String engineername = scanner.nextLine();
                    survey.setEngineerName(engineername);
                    System.out.println("enter the feedback:");
                    String skillgap = scanner.nextLine();
                    survey.setSkillGap(skillgap);
                    break;
                case "2":
                    System.out.println("enter your name:");
                    String nam = scanner.nextLine();

                    if (survey != null && survey.getEngineerName().equals(nam)) {
                        System.out.println(survey.getEngineerName() + "\n" + survey.getSkillGap());
                    }
                    break;
                case "3":
                    System.out.println("enter the feedback that you given:");
                    String rev = scanner.nextLine();

                    if (survey != null && survey.getSkillGap().equals(rev)) {

                        System.out.println("enter your name:");
                        String name = scanner.nextLine();
                        survey.setEngineerName(name);
                        System.out.println("enter the feedback:");
                        String feedback = scanner.nextLine();
                        survey.setSkillGap(feedback);
                    }
                    break;
                case "4":
                    System.out.println("enter the updated name of the enegineer that you want to delete:");
                    String ename = scanner.nextLine();

                    System.out.println("Successfully deleted the details.........");

                case "5":
                    System.out.println("Exiting......");
                    break;

                default:
                    break;
            }

        }
    }
}
