package homework3;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class HomeworkSquareMatrix {
    public static void main(String[] args) {

        MatrixTask1();
        MatrixTask2();
        MatrixTask3();
        MatrixTask5();
    }

/*Почитать сумму четных элементов стоящих на главной диагонали.
*/
    public static void MatrixTask1() {
        System.out.println();
        System.out.println("Task 1:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число, равное количеству стобцов и строк > 1: ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.println("Вы ввели число меньше 2, что не соответствует уcловию.");
            MatrixTask1();
        }
        int sum = 0;
        int[][] mas = new int[a][a];
        int i;
        int j = 0;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                mas[i][j] = random.nextInt(51);
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (i == j) {
                    if (mas[i][j] % 2 == 0) {

                        sum = sum + mas[i][j];
                    }

                }
            }
        }
        System.out.println("Cумма четных элементов стоящих на главной диагонали равна :" + sum);
    }

    /*Вывести нечетные элементы находящиеся под главной диагональю(включительно).
     */
    public static void MatrixTask2() {
        System.out.println();
        System.out.println("Task 2:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число, равное количеству стобцов и строк > 1: ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.println("Вы ввели число меньше 2, что не соответствует уcловию.");
            MatrixTask2();
        }

        int[][] mas = new int[a][a];
        int i;
        int j = 0;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                mas[i][j] = random.nextInt(51);
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (i >= j) {
                    if (mas[i][j] % 2 - 1 == 0) {
                        mas[i][j] = mas[i][j];
                        System.out.printf("%3d", mas[i][j]);
                    }

                }
            }
        }
        System.out.println(" - нечетные элементы находящиеся под главной диагональю(включительно)");

    }

    /*Проверить произведение элементов какой диагонали больше.
     */
    public static void MatrixTask3() {
        System.out.println();
        System.out.println("Task 3:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число, равное количеству стобцов и строк > 1: ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.println("Вы ввели число меньше 2, что не соответствует уcловию.");
            MatrixTask3();
        }
        int[][] mas1 = new int[a][a];
        int i = 0;
        int j = 0;
        Integer mult = 1;
        Integer mult2 = 1;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                mas1[i][j] = random.nextInt(51);
                System.out.printf("%3d", mas1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (i == j) {
                    mult = mult * mas1[i][j];
                }
            }
        }

        int mas2[][] = mas1;
        for (i = 0; i < a; i++) {
            for (j = a - 1; j >= 0; j--) {
                if (j == a - i - 1)
//            System.out.printf("%3d", mas1[i][j]);
                    mult2 = mult2 * mas1[i][j];
            }
        }
        if (mult > mult2) {
            System.out.printf("%3d", mult);
            System.out.print(" - Произедение элементов главной дигонали матрицы больше ");
            System.out.printf("%3d", mult2);
            System.out.println(" - произведения элементов побочной.");
        } else if (mult < mult2) {
            System.out.printf("%3d", mult);
            System.out.print(" - Произедение элементов главной дигонали матрицы меньше ");
            System.out.printf("%3d", mult2);
            System.out.println(" - произведения элементов побочной.");
        } else {
            System.out.println("Произведение главной диагонали матрицы равна произведению побочной");
        }

    }
    /*Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
     */
    public static void MatrixTask5() {
        System.out.println();
        System.out.println("Task 5:");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число, равное количеству стобцов и строк > 1: ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.println("Вы ввели число меньше 2, что не соответствует уcловию.");
            MatrixTask5();
        }
        int b = a;
        int[][] mas = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                mas[i][j] = random.nextInt(51);
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < b; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
    }
}













