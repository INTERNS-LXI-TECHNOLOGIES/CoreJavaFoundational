import java.util.*;

public class TwoWheel extends Vehicle
{
    Scanner sc = new Scanner(System.in);

    public void twoWheelCofig()
    {
        System.out.println("Enter Your Car's Registration Number : ");
        setRegNo(sc.nextLine());
        System.out.println("Enter Your Car's BrandName : ");
        setBrandName(sc.nextLine());
    }
}
