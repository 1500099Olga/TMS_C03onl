package homework10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi");
        Car car2 = new Car("Toyota", 180);
        Car car3 = new Car("Mercedes", 240, 40000);
            System.out.println("Автомобиль марки " + car1.getBrand());
        car1.start();
        System.out.println("Автомобиль марки " + car2.getBrand() + ", максимальной скроростью = " + car2.getSpeed());
        car2.start();
        System.out.println("Автомобиль марки " + car3.getBrand() + ", максимальной скроростью = " + car3.getSpeed() +
                ", стоимостью = " + car3.getCost());
        car3.start();
    }
}


