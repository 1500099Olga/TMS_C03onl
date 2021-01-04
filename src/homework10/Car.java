package homework10;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int cost;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void start() {
        try {
            int randomInt = new Random().nextInt(20);
            if (randomInt % 2 == 0) {
                throw new IllegalArgumentException("The car no run");
            }
            System.out.println(" завелся");

        } catch (IllegalArgumentException e) {

            System.out.println(" не заводится");

        }
    }
}


