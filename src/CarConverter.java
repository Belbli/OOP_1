import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CarConverter {
    public Car stringToCar(String info){
        String [] carFields = checkInput(info);
        Car car = new Car(Integer.parseInt(carFields[0]), carFields[1],
                Integer.parseInt(carFields[2]), carFields[3],
                Integer.parseInt(carFields[4]), carFields[5]);
        return car;
    }

    public List<Car> fillCarsList(List<String> carsInfo){
        List<Car> cars = new ArrayList<>();
            for(String s : carsInfo){
                cars.add(stringToCar(s));
            }
        return cars;
    }

    private String[] checkInput(String info) {
        String [] carFields = info.split("\\|", -1);
        if(Integer.parseInt(carFields[0]) > 99 && Integer.parseInt(carFields[0]) < 1000
                && carFields[5].length() == 7
                && Integer.parseInt(carFields[2]) > 1900 && Integer.parseInt(carFields[2]) < Calendar.getInstance().get(Calendar.YEAR)){
            return carFields;
        }
        throw new IllegalArgumentException("Check your input");
    }

    public void showCars(List<Car> cars){
        for(Car car : cars){
            System.out.println(car.toString());
        }
    }
}
