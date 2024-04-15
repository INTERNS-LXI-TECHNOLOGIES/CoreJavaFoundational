package com.lxisoft.main;
import java.util.Scanner;
import com.lxisoft.manager.Manager;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Department: ");
        String department = scanner.nextLine();

        Manager manager = new Manager(name, id, salary, department);

        System.out.println("\nEmployee Details:");
        manager.displayDetails();

        scanner.close();
    }
}