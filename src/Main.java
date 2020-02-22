import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(123, "BMW", 2008, "red", 10000, "AAD12A3");
        Car car2 = new Car(123, "BMW", 2008, "red", 10000, "AAD12A3");
        System.out.println(car1.hashCode() == car2.hashCode());
        System.out.println(car1.equals(car2));

        Scanner scanner = new Scanner(System.in);
        CarConverter carUtils = new CarConverter();
        Car cr = new Car();
        List<Car> cars = new ArrayList<>();
        List<String> carsInfo = new ArrayList<>();
        String line;
        System.out.println("Input info about cars following next format\n" +
                "\"Number(100-999)|Mark and Model|Year of manufacture|Colour|Price|Register Number\"");
        while(!(line = scanner.nextLine()).isEmpty()){
            carsInfo.add(line);
        }
        try {
            cars = carUtils.fillCarsList(carsInfo);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        carUtils.showCars(cars);
    }
}
