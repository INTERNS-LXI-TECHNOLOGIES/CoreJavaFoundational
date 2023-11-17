import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Car implements Comparable<Car> {
    private final String brand;
    private String model;
    private final int year;
    private final double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Car otherCar) {
        // Compare based on year
        return Integer.compare(this.year, otherCar.year);
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';

    }
}