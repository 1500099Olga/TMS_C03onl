package homework5;

public class CivilAirTransport extends AirTransport {
    private int passengers;
    private boolean businessClass;

    CivilAirTransport(int passengers, boolean businessClass) {
        super();
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
