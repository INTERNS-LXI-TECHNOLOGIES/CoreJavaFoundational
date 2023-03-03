package com.diviso.production;
import java.util.*;

public class ViewController
{
    private int choose1;
    private String button1 = "";
    private boolean check = true;


    public int getChoose1() { return choose1;}
    public void setChoose1(int choose1) { this.choose1 = choose1;}

    public String getButton1() { return button1;}
    public void setButton1(String button1) { this.button1 = button1;}

    Item sportsItem = new Item();
    Information inf = new Information();
    Scanner sc = new Scanner(System.in);

    public void viewInfo()
    {
        System.out.println("\t\t\t\t " + " Welcome To Adidas Store ");
        System.out.println("\t \t ========================================= " + "\n");
        System.out.println("1.Add To Store  2.List To Show  3.AboutUs  4.Exit ");
    }

    public void viewControl() {
        setChoose1(sc.nextInt());
        while (check) {
            switch (getChoose1()) {
                case 1:
                    if (getChoose1() == 1) {
                        System.out.println("Add Sports Items For Your Cart");
                        System.out.println("==============================" + "\n");
                        sportsItem.addSportsItems();
                    }
                    break;

                case 2:
                    if (getChoose1() == 2) {
                        System.out.println("Cart List");
                        System.out.println("=========");
                        sportsItem.showSportsItems();
                    }
                    break;

                case 3:
                    if (getChoose1() == 3) {
                        inf.aboutAdidas();
                    }
                    break;

                case 4:
                    if (getChoose1() == 4) {
                        check = false;
                        break;
                    }
                    break;
                default:
                    System.out.println("Oops!");
            }
            System.out.println(" Do you want to continue press 'yes' or 'no' to Exit");
            setButton1(sc.nextLine());

            if (getButton1().equals("no")) {
                break;
            }
        }
    }
}
