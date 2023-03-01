import java.util.*;

public class ViewController
{
    TwoWheel twoWheel = new TwoWheel();
    FourWheel fourWheel = new FourWheel();
    SixWheel sixWheel = new SixWheel();
    Information inf = new Information();

    Scanner sc =new Scanner(System.in);

    public void viewInfo() {
        System.out.println("\t\t\t\t " + " Welcome To Performance Vehicle Service ");
        System.out.println("\t \t =======================================================" + "\n");
        System.out.println("1.Pollution Test 2.About Us ");
        int choose1 = sc.nextInt();
        String button1 = "";
        do {
            switch (choose1) {
                case 1:
                    if (choose1 == 1) {
                        System.out.println("You Are Selected Pollution Test");
                        System.out.println("===============================" + "\n");
                        System.out.println("*** Enter Your Details ***");
                        System.out.println("===========================" + "\n");

                        /*-- Enter Your Registration Number.
                         if(regNo is already inside file )
                         -- sout("Sorry You Are Already Issued Before Six Month")
                         if(regNo is Valid)
                         -- Enter Your Brand Name.
                         -- Fill Today Date.
                         -- Completed Message.
                         -- sout(show Print Certificate)
                         -- Thank You Message.
                        */
                    } else {
                        System.out.println("Oops!");
                    }

                case 2:
                    if (choose1 == 2) {
                        inf.showAboutPerformanceDetails();
                    } else {
                        System.out.println("Oops!");
                    }
            }
            System.out.println("Do You Want To Continue Press (Y/y)");
            button1 = sc.next();
        }
        while (button1.equals("Y") || button1.equals("y"));
    }

    public void viewControl()
    {
        String button2 = "";
        do
        {
            System.out.println("1.TwoWheel 2.FourWheel 3.SixWheel");
            int choose2 = sc.nextInt();
            switch(choose2)
            {
                case 1 :
                    if(choose2 == 1)
                    {
                        twoWheel.twoWheelCofig();
                    }
                    else{
                        System.out.println("Oops!");
                    }
                case 2 :
                    if(choose2 == 2)
                    {
                        fourWheel.fourWheelCofig();
                    }
                    else {
                        System.out.println("Oops!");
                    }
                case 3 :
                    if(choose2 == 3)
                    {
                        sixWheel.sixWheelCofig();
                    }
                    else{
                        System.out.println("Oops!");
                    }
            }
            System.out.println("Do You Want To Continue Press (Y/y)");
            button2 = sc.next();
        }
        while(button2.equals("Y") || button2.equals("y"));


    }
}
