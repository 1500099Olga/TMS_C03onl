package homework5;

public class PassengerLandTransport extends LandTransport {
    private String type;
    private int passenger;

    PassengerLandTransport ( String type, int passenger) {
        super();
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
