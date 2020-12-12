package homework5;

public class MilitaryAirTransport extends AirTransport {
    private boolean catapult;
    private int rocket;

    MilitaryAirTransport(int power, int speed, int weight, String brand, double wingspan, double runwayTakeOff, boolean catapult, int rocket) {
        super(power, speed, weight, brand, wingspan, runwayTakeOff);
        this.catapult = catapult;
        this.rocket = rocket;
    }

    public void getInfoMilitaryAirTransport() {

        System.out.println("Военный воздушный транспорт следующей модификации: мощность " + getPower() + "л.с, что составляет " + getPowerConversion(getPower()) + "кВ, максимальная скорость: " + getSpeed() + "км/ч, масса: " + getWeight() + " т, марка:  " + getBrand() +
                ", размах крыльев: " + getWingspan() + "м, минимальная длина взлётно-посадочной полосы для взлёта :  " + getRunwayTakeOff() + "м, наличие катапульты (есть/нет) " + catapult + ", количество ракет на борту: " + rocket);
    }

    @Override
    public double getPowerConversion(double power) {
        return super.getPowerConversion(power);
    }

    public boolean rocketOn(int shots) {
        if (rocket >= shots) {
            boolean rocketOn = true;
            System.out.println("Ракета пошла.");
        } else {
            System.out.println("Боеприпасы отстутствуют.");
        }
        return false;
    }

    public boolean isCatapult(int catapult2) {
        if (catapult2 > 0) {
            boolean rocketOn = true;
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
        return false;
    }
}



