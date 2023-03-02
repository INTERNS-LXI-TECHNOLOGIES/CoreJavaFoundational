package com.diviso.production;
import java.util.*;

public class ViewController
{
    private int choose1;
    private int choose2;
    private String button1 = "";
    private String button2 = "";

    public int getChoose1() { return choose1;}
    public void setChoose1(int choose1) { this.choose1 = choose1;}

    public int getChoose2() { return choose2;}
    public void setChoose2(int choose2) { this.choose2 = choose2;}

    public String getButton1() { return button1;}
    public void setButton1(String button1) { this.button1 = button1;}

    public String getButton2() { return button2;}
    public void setButton2(String button2) { this.button2 = button2;}

    Scanner sc = new Scanner(System.in);

    public void viewInfo()
    {
        System.out.println("\t\t\t\t " + " Welcome To Adidas Store ");
        System.out.println("\t \t ========================================= " + "\n");
        System.out.println("1.Add To Store 2.List To Show 3.Exit ");
    }

    public void viewControl()
    {
        setChoose1(sc.nextInt());
        do
        {
            switch (getChoose1())
            {
                case 1 :
                    if(getChoose1() == 1)
                    {
                        System.out.println("Add Sports Items For Your Cart");
                        System.out.println("==============================" + "\n");
                        System.out.println("Name : ");
                        System.out.println("Sport : ");
                        System.out.println("Price : ");
                        System.out.println("Offer : ");
                    }
                case 2 :
                    if(getChoose1() == 2)
                    {
                        System.out.println("Show Your Needful Sports Things");
                        System.out.println("===============================");
                    }
                case 3 :
                    if(getChoose1() == 3)
                    {
                        break;
                    }
            }
            System.out.println("Do You Want To Continue Press(Y/y)");
            setButton1(sc.next());
        }while(getButton1().equals("Y") || getButton1().equals("y"));
    }

    @Override
    public String toString() {
        return "ViewController{" +
                "choose1=" + choose1 +
                ", choose2=" + choose2 +
                ", button1='" + button1 + '\'' +
                ", button2='" + button2 + '\'' +
                '}';
    }
}
