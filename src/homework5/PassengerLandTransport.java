package homework5;

import java.util.Scanner;

import static java.lang.System.in;

public class PassengerLandTransport extends LandTransport {
    private String type;
    private int passenger;

    PassengerLandTransport(int power, int speed, int weigth, String brand, int wheels, double fuelRate, String type, int passenger) {
        super(power, speed, weigth, brand, wheels, fuelRate);
        this.type = type;
        this.passenger = passenger;

    }

    public void getInfoPLT() {

        System.out.println("Легковой автомобиль следующей модификации: мощность " + getPower() + "л.с, что составляет " + getPowerConversion(getPower()) + "кВ, максимальная скорость: " + getSpeed() + "км/ч, масса: " + getWeight() + " т, марка:  " + getBrand() +
                ", количество колес: " + getWheels() + ", расход топлива:  " + getFuelRate() + ", тип кузова " + type + ", количество пассажиров: " + passenger);

    }


    @Override
    public double getPowerConversion(double power) {
        return super.getPowerConversion(power);
    }

    @Override
    public double getDistance(double time) {
        return super.getDistance(time);
    }

    @Override
    public double getFuel(double time) {
        return super.getFuel(time);
    }
}

