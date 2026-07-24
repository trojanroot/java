abstract class Vehicle {
    // Encapsulation: private fields with public getters
    private String vehicleId;
    private String model;
    private int rentalDays;
 
    public Vehicle(String vehicleId, String model, int rentalDays) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.rentalDays = rentalDays;
    }
 
    public String getVehicleId() {
        return vehicleId;
    }
 
    public String getModel() {
        return model;
    }
 
    public int getRentalDays() {
        return rentalDays;
    }
 
    // Abstract method -> forces subclasses to define their own rental cost logic
    // OCP: new vehicle types can be added by extending Vehicle without changing existing code
    public abstract double calculateRentalCost();
 
    public void printRentalInfo() {
        System.out.printf("Vehicle: %s (%s) | Days: %d | Rental Cost: $%.2f%n",
                model, vehicleId, rentalDays, calculateRentalCost());
    }
}
 
// ---------- Car subclass ----------
// LSP: Car can be used anywhere a Vehicle is expected, without breaking behavior
class Car extends Vehicle {
    private static final double DAILY_RATE = 40.0;
 
    public Car(String vehicleId, String model, int rentalDays) {
        super(vehicleId, model, rentalDays);
    }
 
    // Method Overriding
    @Override
    public double calculateRentalCost() {
        return DAILY_RATE * getRentalDays();
    }
}
 
// ---------- Bike subclass ----------
class Bike extends Vehicle {
    private static final double DAILY_RATE = 15.0;
 
    public Bike(String vehicleId, String model, int rentalDays) {
        super(vehicleId, model, rentalDays);
    }
 
    // Method Overriding
    @Override
    public double calculateRentalCost() {
        return DAILY_RATE * getRentalDays();
    }
}
 
// ---------- Demo ----------
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Polymorphism: Vehicle reference pointing to different subclass objects
        Vehicle[] vehicles = {
                new Car("CAR-101", "Toyota Corolla", 3),
                new Bike("BIKE-201", "Yamaha FZ", 5)
        };
 
        double totalRevenue = 0;
        for (Vehicle v : vehicles) {
            v.printRentalInfo();
            totalRevenue += v.calculateRentalCost();
        }
 
        System.out.printf("Total Rental Revenue: $%.2f%n", totalRevenue);
    }
}