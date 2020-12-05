package homework3;

import java.util.*;
import static java.util.Arrays.*;
import static java.util.Arrays.*;

public class HomeworkPlusTasks {
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }

    /*Найти произведение элементов, кратных 3.
     */
    public static void Task1() {
        System.out.println("1:");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n > 3, обозначающее размер массива: ");
        int n = sc.nextInt();
        System.out.println("Введите m > 0, обозначающее максимальное значение элементов массива: ");
        int m = sc.nextInt();
        if (n <= 3 | m <= 0) {
            System.out.println("Вы ввели неверное число, прочитайте условие и введите еще раз: ");
            Task1();
            sc.close();
        }
        int[] array = new int[n];
        Integer a = 1;
        int[] array1 = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(m);
            if (array[i] % 3 == 0) {

                array1[i] = array[i];
                if (array1[i] != 0) {
                    a = a * array1[i];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Произведение элементов кратных 3-м: " + (a));
        System.out.println();
    }

    /*Найти среднее арифметическое элементов с нечетными номерами.
     */
    public static void Task2() {
        System.out.println("2:");
        System.out.println();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n > 3, обозначающее размер массива: ");
        int n = sc.nextInt();
        System.out.println("Введите m > 0, обозначающее максимальное значение элементов массива: ");
        int m = sc.nextInt();
        if (n <= 3 | m <= 0) {
            System.out.println("Вы ввели неверное число, прочитайте условие и введите еще раз: ");
            Task2();
            sc.close();
        }
        int[] array = new int[n];
        double middlearray = 0;
        int count = 0;
        int i = 0;
        double a = 0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(m);
            if (i % 2 - 1 == 0) {

                a = a + (double) array[i];
                count++;
            }
            middlearray = a / count;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Cреднее арифметическое элементов с нечетными номерами = " + middlearray);
    }

    /*Найти средне арифметическое элементов массива, превосходящих некоторое число С.
     */
    public static void Task3() {
        System.out.println("3:");
        System.out.println();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: число n > 3:");
        int n = sc.nextInt();
        System.out.println("Введите максимальное значение элемента m > 0: ");
        int m = sc.nextInt();
        System.out.println("Введите C: ");
        int c = sc.nextInt();
        if (n <= 3 | m <= 0) {
            System.out.println("Число не соответствует условию, введите еще раз: ");
            Task3();
            sc.close();
        }
        int[] array = new int[n];
        double middle = 0;
        int count = 0;
        int i = 0;
        double a = 0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(m);
            if (array[i] > c) {

                a = a + (double) array[i];
                count++;

            }
            middle = a / count;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Cреднее арифметическое значение элементов, которые превосходят С = " + middle);
    }

    /*Найти наименьший нечетный элемент.
     */
    public static void Task4() {
        System.out.println("4:");

        System.out.println();

        int[] array = {28, 15, 65, 87, 90, 1, 10};
        System.out.println(Arrays.toString(array));
        sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 - 1 == 0) ;
        }
        System.out.print("Наименьший нечетный элемент массива равен: " + array[0]);
    }

    /*«Сожмите» массив, выбросив из него каждый второй элемент.
    «Освободившиеся» места массива заполните нулями.
     */
    public static void Task5() {

        System.out.println("5:");
        int[] array = {28, 15, 65, 87, 90, 1, 10, 17, 23};
        System.out.println();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int[] array2 = copyOf(array, array.length);

            for (i = 1; i < array2.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(array2[i] + " ");
                }
            }
            for (i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    array2[i] = 0;
                    System.out.print(array2[i] + " ");
                }
            }
        }
    }

    /*Проверить, различны ли все элементы массива.
     */
    public static void Task6() {
        System.out.println();
        System.out.println();
        System.out.println("6:");
        int[] array = {28, 7, 65, 87, 90, 1, 10, 17, 28};
        System.out.println(Arrays.toString(array));
        int count = 0;

        int[] array2 = copyOf(array, array.length);
        sort(array2);
        for (int i = 0; i < array2.length - 1; i++) {

            if (array2[i] == array2[i + 1]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Различны все элементы массива.");
        } else {
            System.out.println("Не все элементы массива различны.");
        }
    }

    /*Подсчитать, сколько раз встречается элемент с заданным значением.
     */
    public static void Task7() {
        System.out.println();
        System.out.println();
        System.out.println("7:");
        int[] array = {28, 7, 65, 87, 7, 1, 10, 7, 28};
        System.out.println(Arrays.toString(array));
        Scanner c = new Scanner(System.in);
        System.out.println(" Element  = ...");
        int a = c.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                count++;
            }
        }
        if (count > 0 && count > 1 && count < 5 && count != 1) {
            System.out.println("Заданный элемент встречается в массиве " + count + " раза.");
        } else if (count == 1 || count >= 5) {
            System.out.println("Заданный элемент встречается в массиве " + count + " раз.");
        } else {
            System.out.println("Заданный элемент не встречается в массиве ");
        }
    }

    /*Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
     */
    public static void Task8() {
        System.out.println();
        System.out.println();
        System.out.println("8:");
        int[] array = {28, 7, 65, 30, 90, 1, 10, 17, 28};
        System.out.println(Arrays.toString(array));
        int[] array2 = copyOf(array, array.length);
        sort(array2);

        for (int i = 0; i < array2.length; i++) {

        }
        System.out.println(array2[array2.length - 2]);
    }

    /*Найти наименьший элемент среди элементов с четными индексами массива
     */
    public static void Task9() {
        System.out.println();
        System.out.println();
        System.out.println("8:");
        int[] array = {28, 7, 65, 30, 90, 1, 10, 17, 2};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                array[i] = array[i];
                System.out.print("Наименьший элемент среди элементов с четными индексами " +
                        "массива равен " + array[i] + ".");
                break;
            }
        }
    }

    /*Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
     */
    public static void Task10() {
        System.out.println();
        System.out.println();
        System.out.println("8:");
        Integer[] array = {1, 7, 40, 30, 90, 1, 10, 17, 2};
        System.out.println(Arrays.toString(array));
        Integer[] array2 = copyOf(array, array.length);
        Arrays.sort(array2, Collections.reverseOrder());

        for (int i = 0; i < array2.length; i++) {
            array[0] = array2[0];
        }
        System.out.println(Arrays.toString(array));
    }
}
