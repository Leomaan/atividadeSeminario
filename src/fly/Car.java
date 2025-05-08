package fly;

public class Car {
    private String brand;
    private String yearOfManuFacture;
    private CarType carType;

    // CONSTRUTOR
    public Car(CarType carType) {
        this.carType = carType;
    }
}