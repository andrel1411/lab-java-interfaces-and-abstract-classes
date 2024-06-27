// Abstract class Car
abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    // Constructor
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // Getters
    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    // Abstract method to get information about the car
    public abstract String getInfo();
}

// Sedan class extending Car
class Sedan extends Car {
    // Constructor
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    // Implementation of getInfo() method
    @Override
    public String getInfo() {
        return "Sedan [VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + "]";
    }
}

// UtilityVehicle class extending Car
class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    // Constructor
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    // Getters
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    // Implementation of getInfo() method
    @Override
    public String getInfo() {
        return "UtilityVehicle [VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + ", Four-Wheel Drive: " + (fourWheelDrive ? "Yes" : "No") + "]";
    }
}

// Truck class extending Car
class Truck extends Car {
    private double towingCapacity;

    // Constructor
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    // Getters
    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Implementation of getInfo() method
    @Override
    public String getInfo() {
        return "Truck [VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + ", Towing Capacity: " + towingCapacity + " tons]";
    }
}

// Main class to test the Car Inventory System
public class Car_Inventory_System {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("1HGCM82633A123456", "Honda", "Accord", 150000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("2HNYD18654H123456", "Acura", "MDX", 120000, true);
        Truck truck = new Truck("1FTSW21P14EB12345", "Ford", "F-150", 200000, 5.0);

        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());
        System.out.println(truck.getInfo());
    }
}
