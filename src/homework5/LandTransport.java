package homework5;

public class LandTransport extends Transport {
    private int wheels;
    private double fuelRate;

LandTransport (int wheels, double fuelRate) {
    super();
    this.wheels = wheels;
    this.fuelRate = fuelRate;
}

LandTransport () {
    super();
}
    public int getWheels() {
        return wheels;
    }

    public double getFuelRate() {
        return fuelRate;
    }
}

