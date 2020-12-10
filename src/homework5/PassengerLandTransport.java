package homework5;

public class PassengerLandTransport extends LandTransport {
    private String type;
    private int passenger;

    PassengerLandTransport ( int power, int speed, int weigth, String brand, int wheels, double fuelRate, String type, int passenger) {
        super(power, speed, weigth, brand, wheels, fuelRate);
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
    public static void getInfo() {
        
        System.out.println("Легковой автомобиль следующей модификации: мощность " + getPower() + "л.с, максимальная скорость: "+ getSpeed()+ "км/ч, масса: " + getWeight() + " т, марка:  " + getBrand() + "/n"
        ", количество колес: " + getWheels() + ", расход топлива:  " + getFuelRate() + ", тип кузова " + type + ", количество пассажиров: " + passenger);

    }
}
