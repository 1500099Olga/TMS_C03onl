package homework5;

public class MilitaryAirTransport extends AirTransport {
    private boolean catapult;
    private int rocket;

    MilitaryAirTransport( boolean catapult, int rocket){
        super();
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
