package homework5;

public class CivilAirTransport extends AirTransport {
    private int passengers;
    private boolean businessClass;

    CivilAirTransport(int power, int speed, int weight, String brand, double wingspan, double runwayTakeOff, int passengers, boolean businessClass) {
        super(power, speed, weight, brand, wingspan, runwayTakeOff);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public void getInfoCivilAirTransport() {

        System.out.println("Гражданский воздушный транспорт следующей модификации: мощность " + getPower() + "л.с, что составляет " + getPowerConversion(getPower()) + "кВ, максимальная скорость: " + getSpeed() + "км/ч, масса: " + getWeight() + " т, марка:  " + getBrand() +
                ", размах крыльев: " + getWingspan() + "м, минимальная длина взлётно-посадочной полосы для взлёта:  " + getRunwayTakeOff() + "м, макс.количество пассажирова на борту: " + passengers + ", наличие бизнесс класса (есть/нет: " + businessClass);
    }

    @Override
    public double getPowerConversion(double power) {
        return super.getPowerConversion(power);
    }

    public boolean passengersIn(double passengers2) {
        if (passengers >= passengers2) {
            boolean passengersIn = true;
            System.out.println("Гражданский самолет вмещает всех пассажиров.");
        } else {
            System.out.println("Вам нужен гражданский самолёт побольше, пассажиры не помещаются");
        }
        return false;
    }
}
