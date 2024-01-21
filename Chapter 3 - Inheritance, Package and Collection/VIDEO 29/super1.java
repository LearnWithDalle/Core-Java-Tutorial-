class Vehicle {
    String fuelType = "Petrol";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String fuelType = "Diesel";

    void start() {
        super.start();   // calling pappa's method
        System.out.println("Car is starting...");
        System.out.println("Fuel Type: " + fuelType);  // Accessing beta variables
        System.out.println("Superclass Fuel Type: " + super.fuelType); // Baapka  variables
    }
}

public class super1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
