
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Lesson1();
        Lesson2();
        Lesson3();
        Lesson4();
        Lesson5();
        Lesson6();
        Lesson7();
    }

    public static void Lesson1() {
        System.out.println("Lesson 1:");
        for (int i = 2; i < 21; i += 2) {
            int[] array = new int[i];
            System.out.print(array.length + " ");
        }

        System.out.println();

        for (int i = 2; i < 21; i += 2) {
            int[] array = new int[i];
            System.out.println(array.length);
        }
        System.out.println();
    }

    public static void Lesson2() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 2:");


        int j = 0;
        for (int i = 1; i < 100; i += 2) {
            int[] array = new int[i];
            System.out.print(array.length + " ");

//            int[] array2 = Arrays.copyOf(array, array.length);
//
//            System.out.println(Arrays.toString(array2));
//            Arrays.sort(new int[][]{array}, Collections.reverseOrder());

// Задача требует доработки.


        }
        System.out.println();


    }

    public static void Lesson3() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 3:");
        Random random = new Random();
        System.out.println();
        int[] array = new int[15];
        int i = 0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.copyOf(array, array.length);
        int count = 0;
        for (i = 1; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("В массиве содержится " + count + " чётных элементов.");

    }


    public static void Lesson4() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 4:");

        Random random = new Random();
        System.out.println();
        int[] array = new int[20];
        int i = 0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.copyOf(array, array.length);

        for (i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void Lesson5() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 5:");

        Random random = new Random();
        System.out.println();
        int[] array = new int[5];
        int[] array2 = new int[5];
        int i = 0;
        double middlearray = 0, middlearray2 = 0;

        for (; i < array.length; i++) {
            array[i] = random.nextInt(6);
            middlearray += (double) array[i] / array.length;
            array2[i] = random.nextInt(6);
            middlearray2 += (double) array2[i] / array2.length;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        if (middlearray == middlearray2) {
            System.out.println("Средние арифметические значения двух массивов равны  и составляют: " + middlearray + " и " + middlearray2);
        } else {
            if (middlearray > middlearray2) {
                System.out.println("Среднее арифметическое значение первого массива больше и составляет: " + middlearray);
            } else
                System.out.println("Среднее арифметическое значение второго массива больше и составляет: " + middlearray2);


        }
    }

    public static void Lesson6() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 6:");
//требует доработки

        Random random = new Random();
        System.out.println();
        int[] array = new int[4];
        int i = 0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));


        for (i = 1; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Прогрессия не возрастающая ");
                    break;
                }
            }
        }
        if (i == array.length - 1) {
            System.out.println("Прогрессия возрастающая ");
        }

    }

    public static void Lesson7() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 7:");

        Random random = new Random();
        System.out.println();
        int[] array1 = new int[12];
        int i = 0;
        int indexmax = 0;
        for (; i < array1.length; i++) {
            array1[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = Arrays.copyOf(array1, array1.length);
        Arrays.sort(array2);
        int max = array2[12 - 1];

        System.out.println(max);
        for (; i < array1.length; i++) {
            if (indexmax == array1[i])
                indexmax = i;
            System.out.println(i + " - index определен");

        }
    }
}
}






        


