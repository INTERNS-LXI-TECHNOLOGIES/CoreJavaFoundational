import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInt op = new ConcreteAtmOperation();

        try (Scanner sc = new Scanner(System.in)) {
            final long accNu = 1000000;
            final int pinNu = 1010;
            while (true) {

                System.out.println("*SBI");
                System.out.println(" ");
                System.out.println("          ~~~WELCOME~~~");
                System.out.println(" ");
                System.out.println("        This is SBI\uD83C\uDFE7");

                System.out.print("   Enter your Account Number: ");
                long accNo = sc.nextLong();
                System.out.print("   Enter your Pin Number: ");
                int pinNo = sc.nextInt();
                for (int i = 0; i < 156; i++) {
                    System.out.println();
                }
                if (accNu == accNo && pinNu == pinNo) {
                    while (true) {
                        System.out.println("          Choose one option to continue");
                        System.out.println("          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("      1. WITHDRAWAL      2. CASH DEPOSIT\n\n      3. BALANCE ENQUIRY  4. MINI STATEMENT\n\n         5.FUND TRANSFER    6.EXIT");


                        int choice = sc.nextInt();
                        for (int i = 0; i < 156; i++) {
                            System.out.println();
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("You selected WITHDRAWAL\nPlease enter the amount in multiple of 100,500\n\nEnter amount to withdraw:");
                                double withdraw = sc.nextDouble();
                                op.withdraw(withdraw);
                                break;
                            case 2:
                                System.out.println("You selected CASH DEPOSIT\nEnter amount to deposit:");
                                double deposit = sc.nextDouble();
                                op.deposit(deposit);
                                break;
                            case 3:
                                System.out.println("You selected BALANCE ENQUIRY\nBalance: " + op.viewBalance());
                                break;

                            case 4:
                                System.out.println(op.miniStatement());
                                break;
                            case 5:
                                System.out.print("Enter person's account number: ");
                                long personAccountNumber = sc.nextLong();

                                System.out.print("Enter transfer amount: ");
                                double transferAmount = sc.nextDouble();

                                op.fundTransfer(personAccountNumber, transferAmount);
                                break;

                            case 6:
                                System.out.println("Exiting...Thank you for using ADWM");

                                try {
                                    // Sleep for 1 minute (60,000 milliseconds) after each iteration
                                    Thread.sleep(3000);
                                    for (int i = 0; i < 100; i++) {
                                        System.out.println();
                                    }
                                } catch (InterruptedException e) {
                                    e.printStackTrace();

                                }
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;

                        }

                    }
                } else {
                    System.out.println("Invalid Account Number or PIN. Access denied.");
                }
            }
        }
    }


}
