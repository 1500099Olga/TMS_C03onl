package homework5;

public class CivilAirTransport extends AirTransport {
    private int passengers;
    private boolean businessClass;

    CivilAirTransport(int power, int speed, int weight, String brand, double wingspan, double runwayTakeOff, int passengers, boolean businessClass) {
        super(power, speed, weight, brand,wingspan, runwayTakeOff);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }
}
