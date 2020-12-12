package homework5;

public class Transport {

    private int power;
    private int speed;
    private int weight;
    private String brand;


    Transport(int power, int speed, int weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;


    }

    public int getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;

    }

    public double getPowerConversion(double power) {
        return power * 0.74;

    }

    public double getDistance(double time) {
        return time * speed;
    }

}
