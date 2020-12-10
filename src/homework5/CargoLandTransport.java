package homework5;

public class CargoLandTransport extends LandTransport {
    private double capacity;

    CargoLandTransport(double capacity) {
        super();
        this.capacity = capacity;
    }


    public double getCapacity() {
        return capacity;
    }
}