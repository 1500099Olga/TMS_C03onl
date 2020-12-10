package homework5;

public class AirTransport extends Transport{
    private double wingspan;
    private double runwayTakeOff;

    AirTransport(double wingspan, double runwayTakeOff) {
        this.wingspan = wingspan;
        this.runwayTakeOff = runwayTakeOff;
    }
    AirTransport (){
        super();
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getRunwayTakeOff() {
        return runwayTakeOff;
    }
}
