package homework5;

public class PassengerLandTransport extends LandTransport {
    private String type;
    private int passenger;

    PassengerLandTransport ( int power, int speed, int weigth, String brand, int wheels, double fuelRate, String type, int passenger) {
        super(power, speed, weigth, brand, wheels, fuelRate);
        this.type = type;
        this.passenger = passenger;

    }

    public String getType() {
        return type;
    }

    public int getPassenger() {
        return passenger;
    }
    public void getInfoTransport() {

    }
}
