package homework5;

public class MilitaryAirTransport extends AirTransport {
    private boolean catapult;
    private int rocket;

    MilitaryAirTransport( int power, int speed, int weight, String brand, double wingspan, double runwayTakeOff, boolean catapult, int rocket){
        super(power, speed, weight, brand,wingspan, runwayTakeOff);
        this.catapult = catapult;
        this.rocket = rocket;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public int getRocket() {
        return rocket;
    }
}
