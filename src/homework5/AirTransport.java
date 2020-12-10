package homework5;

public class AirTransport extends Transport{
    private double wingspan;
    private double runwayTakeOff;

    AirTransport(int power, int speed, int weigth, String brand, double wingspan, double runwayTakeOff) {
        super(power, speed, weigth, brand);
        this.wingspan = wingspan;
        this.runwayTakeOff = runwayTakeOff;
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getRunwayTakeOff() {
        return runwayTakeOff;
    }
}
