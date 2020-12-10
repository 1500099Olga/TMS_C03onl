package homework5;

public class CargoLandTransport extends LandTransport {
    private double capacity;

    CargoLandTransport(int power, int speed, int weight, String brand, int wheels, double fuelRate, double capacity) {
        super(power, speed, weight, brand, wheels, fuelRate);
        this.capacity = capacity;
    }


    public double getCapacity() {
        return capacity;
    }
}