package homework4;

import java.util.Random;
import java.util.Scanner;


public class ComputerRunner {


    public static void main(String[] args) {

        Computer comp = new Computer("Intel", "DDR2", "10 GB");

        System.out.println(comp);
        System.out.println();
        System.out.println("Определите макс.ресурс полных циклов работы (включений/выключений): ");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int resurse = sc.nextInt();
        int count = 0;
        do {
            int max = 2;
            int min = 0;


            System.out.println("Для включения компьютера нужно угадать число:" +
                    "нажмите  '1' либо '0'" + "\n" + "если" +
                    " угадали, компьютер включится, если нет - сгорит: ");
            Random ran = new Random();
            int b = ran.nextInt(max | min);
            int a = sc.nextInt();
            System.out.println(" Загаданое число: " + b);

            if (a == b) {
                comp.onComputer();
            } else {
                System.out.println("Компьютер сгорел.");
                return;
            }


            System.out.println("Для выключения компьютера нужно угадать число:" +
                    " \n" + "нажмите  '1' либо '0'" + "\n" + "если" +
                    " угадали, компьютер выключится, если нет - сгорит");
            int b1 = ran.nextInt(max | min);

            int a1 = sc.nextInt();
            System.out.println(" Загаданое число: " + b1);

            if (a1 == b1) {
                comp.offComputer();
            } else {
                System.out.println("Компьютер сгорел.");
                return;
            }
            count++;
        }
        while (count < resurse);

        System.out.println("Исчерпан ресурс работы компьютера. Компьютер сгорел.");
    }
}






