class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Starting the vehicle");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void start() {
        System.out.println("Starting the car");
    }

    void drive() {
        System.out.println("Driving the car");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCar;

    Motorcycle(String brand, boolean hasSideCar) {
        super(brand);
        this.hasSideCar = hasSideCar;
    }

    @Override
    void start() {
        System.out.println("Starting the motorcycle");
    }

    void ride() {
        System.out.println("Riding the motorcycle");
    }
}

public class ComplexInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", false);

        System.out.println("Car brand: " + myCar.brand);
        myCar.start();
        myCar.drive();

        System.out.println("Motorcycle brand: " + myMotorcycle.brand);
        myMotorcycle.start();
        myMotorcycle.ride();
    }
}
