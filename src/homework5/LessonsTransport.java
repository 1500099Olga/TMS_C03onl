package homework5;


import org.w3c.dom.ls.LSOutput;

public class LessonsTransport {

    public static void main(String[] args) {

        getInfoPassengerLandTransport();
        getInfoCargoLandTransport();
        getInfoCivilAirTransport();
        getInfoMilitaryAirTransport();
        addInfoPassengerLandTransport();
        checkCapacityCargoLandTransport();
        checkCivilAirTransport();
        checkMilitaryAirTransport();

    }


    public static void getInfoPassengerLandTransport() {
        PassengerLandTransport passengerLandTransport = new PassengerLandTransport(100, 230, 3, "Mersedes", 4, 15.5, "Geep", 5);
        passengerLandTransport.getInfoPLT();
//        System.out.println(passengerLandTransport.getDistance(2.2));
//        System.out.println(passengerLandTransport.getFuel(2.2));

    }

    public static void getInfoCargoLandTransport() {
        CargoLandTransport cargoLandTransport = new CargoLandTransport(200, 150, 2, "Ford", 4, 10.5, 5);
        cargoLandTransport.getInfoCLT();

    }

    public static void getInfoCivilAirTransport() {
        CivilAirTransport civilAirTransport = new CivilAirTransport(1000, 950, 40, "Boing", 2.2, 1500, 150, true);
        civilAirTransport.getInfoCivilAirTransport();

    }

    public static void getInfoMilitaryAirTransport() {
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(1000, 1000, 55, "AN", 2, 1000, true, 5);
        militaryAirTransport.getInfoMilitaryAirTransport();
    }

    public static void addInfoPassengerLandTransport() {
        PassengerLandTransport passengerLandTransport = new PassengerLandTransport(100, 280, 3, "Mersedes", 4, 15.5, "Geep", 5);
        System.out.println("За время " + 2.2 + " часа, автомобиль " + passengerLandTransport.getBrand() + " двигаясь с максимальной скоростью " + passengerLandTransport.getSpeed() + "км/ч проедет " + passengerLandTransport.getDistance(2.2) + "км и израсходует " + passengerLandTransport.getFuel(2.2) + " литров топлива.");
// здесь ступор как сделать если private, добавить get and set???
    }

    public static void checkCapacityCargoLandTransport() {
        CargoLandTransport cargoLandTransport = new CargoLandTransport(200, 150, 2, "Ford", 4, 10.5, 5);
        // забыла как чтобы не повторять(наверное нужно в классе сразу внести переменные)
        cargoLandTransport.capacityIn(6);
    }

    public static void checkCivilAirTransport() {
        CivilAirTransport civilAirTransport = new CivilAirTransport(1000, 950, 40, "Boing", 2.2, 1500, 150, true);
        civilAirTransport.passengersIn(500);
    }
    public static void checkMilitaryAirTransport() {
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(1000, 1000, 55, "AN", 2, 1000, true, 2);
        militaryAirTransport.rocketOn(3);
        militaryAirTransport.isCatapult(1);
    }
}
