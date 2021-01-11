package homework11;
import java.io.*;

public class Homework11 {
    public static void main(String[] args) {
        Lesson1();
        serialisationCar();
        deserializationCar();
    }

    public static void Lesson1() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Lesson1.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                StringBuilder str1 = new StringBuilder(str);
                if ((str.equalsIgnoreCase(str1.reverse().toString()))) {
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                            ("Lesson1Polindrom.txt", true))) {
                        bufferedWriter.write(str + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serialisationCar() {
        Car car = new Car("Toyota", 210, 22000);
        System.out.println(car.toString());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.dat"))) {
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializationCar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Car.dat"))) {
            Car car = (Car) ois.readObject();
            System.out.println(car.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
