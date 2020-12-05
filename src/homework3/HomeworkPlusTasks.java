package homework3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkPlusTasks {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    /*Найти произведение элементов, кратных 3.
     */
    public static void Task1() {
        System.out.println("1:");

        System.out.println();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n > 3, обозначающее размер массива: ");
        int n = sc.nextInt();
        System.out.println("Введите m > 0, обозначающее максимальное значение элементов массива: ");
        int m = sc.nextInt();
        if (n <= 3 | m <= 0){
            System.out.println("Вы ввели неверное число, прочитайте условие и введите еще раз: ");
            Task1();
        }
        int[] array = new int[n];
        int a = 1;
        int count = 0;
        int[] array1 = new int[n];
        int b =0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(m);
            if (array[i] % 3 == 0 ) {

                array1 [i] = array[i];
                if(array1 [i] != 0){
                    a = a*array1 [i];}
                count++;
            }
        }
        System.out.println("Сформирован массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Выделены элементы кратные 3-м: ");
        System.out.println(Arrays.toString(array1));
        System.out.println();
        System.out.println("Произведение элементов кратных 3-м: " + a);
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
        if (n <= 3 | m <= 0){
            System.out.println("Вы ввели неверное число, прочитайте условие и введите еще раз: ");
            Task2();
        }
        int[] array = new int[n];
        double middlearray = 0;
        int count = 0;
        int i = 0;
        double a =0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(m);
            if (i % 2 - 1 == 0) {

                a = a + (double) array[i];
                count++;
            }middlearray = a / count;
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
        if (n <= 3 | m <= 0 ){
            System.out.println("Число не соответствует условию, введите еще раз: ");
            Task3();
        }
        int[] array = new int[n];
        double middle = 0;
        int count = 0;
        int i = 0;
        double a =0;
        for (; i < array.length; i++) {
            array[i] = random.nextInt(m);
            if (array[i] > c) {

                a = a + (double) array[i];
                count++;

            } middle = a / count;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Cреднее арифметическое значение элементов, которые превосходят С = " + middle);
    }

}


