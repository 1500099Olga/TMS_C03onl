package homework5;

public class CargoLandTransport extends LandTransport {
    private double capacity;

    CargoLandTransport(int power, int speed, int weight, String brand, int wheels, double fuelRate, double capacity) {
        super(power, speed, weight, brand, wheels, fuelRate);
        this.capacity = capacity;
    }


    public void getInfoCLT() {

        System.out.println("Грузовой автомобиль следующей модификации: мощность " + getPower() + "л.с, что составляет " + getPowerConversion(getPower()) + "кВ, максимальная скорость: " + getSpeed() + "км/ч, масса: " + getWeight() + " т, марка:  " + getBrand() +
                ", количество колес: " + getWheels() + ", расход топлива:  " + getFuelRate() + ", грузоподъемность " + capacity + ".");
    }

    @Override
    public double getPowerConversion(double power) {
        return super.getPowerConversion(power);
    }

    public boolean capacityIn(double capacity2) {
        if (capacity >= capacity2) {
            boolean capacityIn = true;
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
        return false;
    }

    @Override
    public double getFuelRate() {
        return super.getFuelRate();
    }
}

