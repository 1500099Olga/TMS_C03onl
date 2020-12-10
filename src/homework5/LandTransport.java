package homework5;

public class LandTransport extends Transport {
    private int wheels;
    private double fuelRate;

LandTransport (int power, int speed, int weigth, String brand, int wheels, double fuelRate) {
    super(power, speed, weigth, brand);
    this.wheels = wheels;
    this.fuelRate = fuelRate;

}
    public int getWheels() {
        return wheels;
    }

    public double getFuelRate() {
        return fuelRate;
    }
}

