import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
            new Car("Toyota", "1.0", 2021, 494949.777),
              new Car("Polo", "1.2", 2022, 494949.087),
                new Car("Honda", "1.1", 2023, 494949.987),
                  new Car("Tata", "1.3", 2024, 49499.101),
                    new Car("Suzuki", "1.0", 2021, 494949.777),
                       new Car("Mg", "1.2", 2022, 494949.087),
                         new Car("KIA", "1.1", 2023, 494949.987),
                            new Car("Benz", "1.3", 2024, 49499.101));




                                    List<Car> sortedAndFilteredCars = cars.stream()
                                            .filter(car -> car.getYear() == 2021 || car.getYear() == 2022)
                                            .sorted((car1, car2) -> car1.getBrand().compareTo(car2.getBrand()))
                                            .collect(Collectors.toList());
        System.out.println("Sorted and filtered cars: " );
                                    sortedAndFilteredCars.forEach(System.out::println);

                                    double averagePrice = cars.stream()
                                        .mapToDouble(Car::getPrice)
                                            .average()
                                            .orElse(0.0);
        System.out.println("Average price: "+averagePrice);


                                }
                            }