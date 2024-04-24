import java.util.Scanner;

public class SwitchScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a day of the week (1-7):");
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Abc":
                System.out.println("It's Monday.");
                break;
           /* case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;*/
            default:
                System.out.println("Invalid day of the week.");
                break;
        }

        scanner.close(); // Close the scanner to release resources
    }
}
