import java.util.List;
import java.util.Objects;

public class Car {
    private int number;
    private String model;
    private int yearOfManufacture;
    private String color;
    private int price;
    private String registerNumber;

    public Car(){

    }

    public Car(int number, String model, int yearOfManufacture, String color, int price, String registerNumber) {
        this.number = number;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public Car(Car car){
        this.number = car.number;
        this.model = car.model;
        this.yearOfManufacture = car.yearOfManufacture;
        this.color = car.color;
        this.price = car.price;
        this.registerNumber = car.registerNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registerNumber=" + registerNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number &&
                yearOfManufacture == car.yearOfManufacture &&
                price == car.price &&
                registerNumber == car.registerNumber &&
                model == car.model &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, yearOfManufacture, color, price, registerNumber);
    }
}
