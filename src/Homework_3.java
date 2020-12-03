import java.util.*;
import static java.util.Arrays.*;
import static java.util.Arrays.sort;


public class Homework_3 {


    public static void main(String[] args) {
        Lesson1();
        Lesson2();
        Lesson3();
        Lesson4();
        Lesson5();
        Lesson6();
        Lesson7();
        Lesson8();
        Lesson9();
        Lesson10();
    }

    /*Создайте массив из всех чётных чисел от 2 до 20 и выведите
    элементы массива на экран сначала в строку, отделяя один элемент
    от другого пробелом, а затем в столбик (отделяя один элемент от другого
    началом новой строки). Перед созданием массива подумайте, какого он будет размера.
     */
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

    /*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
    в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
    порядке (99 97 95 93 ... 7 5 3 1).
     */
    public static void Lesson2() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 2:");

        int[] array = new int[100 / 2 + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = i * 2 - 1;
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = copyOf(array, array.length);

        boolean array2Sorted = false;
        int element;
        while (!array2Sorted) {
            array2Sorted = true;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] < array2[i + 1]) {
                    array2Sorted = false;

                    element = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = element;
                }
            }
        }
        System.out.println(Arrays.toString(array2));


        System.out.println();

    }

/*Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
выведете это количество на экран на отдельной строке.
 */

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

        int[] array2 = copyOf(array, array.length);
        int count = 0;
        for (i = 1; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("В массиве содержится " + count + " чётных элементов.");

    }

    /*Создайте массив из 20 случайных целых чисел из отрезка [0;20].
    Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом
    на ноль. Снова выведете массив на экран на отдельной строке.
     */
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

        int[] array2 = copyOf(array, array.length);

        for (i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    /*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из массивов
    это значение оказалось больше (либо сообщите, что их средние арифметические равны).
     */
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

    /*Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на
    экран в строку. Определить и вывести на экран сообщение о том, является ли
    массив строго возрастающей последовательностью.
     */
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

    /* Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
    какой элемент является в этом массиве максимальным и сообщите индекс его
    последнего вхождения в массив.
     */
    public static void Lesson7() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 7:");

        Random random = new Random();
        System.out.println();
        int[] array1 = new int[12];

        int indexmax = 0;
        for (int i = 1; i < array1.length; i++) {
            array1[i] = random.nextInt(16);
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = copyOf(array1, array1.length);
        sort(array2);
//
        int max = array2[array2.length - 1];
        System.out.println("Максимальное значение элемента в массиве: " + max);
        for (int i = 0; i < array1.length; i++) {
            if (max == array1[i])
                indexmax = i;
        }
        System.out.println("Индекс максимального элемента в массиве определен и равен " + indexmax);
    }

    /*Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
    массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива
    должен равняться отношению элемента из первого массива с i-ым индексом к
    элементу из второго массива с i-ым индексом. Вывести все три массива на экран
    (каждый на отдельной строке), затем вывести количество целых элементов в третьем
    массиве.
     */
    public static void Lesson8() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 8:");

        System.out.println();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 9);
            array2[i] = (int) (Math.random() * 9);
            if (array2[i] != 0) {
                array3[i] = array1[i] / array2[i];
            }
            if (array3[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.toString(array3));
        System.out.println("Сумма целых элементов третьего массива равна " + count);
    }

    /* Пользователь должен указать с клавиатуры положительное число, а программа
    должна создать массив указанного размера из случайных целых чисел из
    [0;15] и вывести его на экран в строку. После этого программа должна определить и
    сообщить пользователю о том, сумма какой половины массива больше: левой или
    правой, либо сообщить, что эти суммы модулей равны. Если
    Если пользователь введёт неподходящее число, то выдать соответствующее сообщение
     */
    public static void Lesson9() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 9:");
// доработать
        System.out.println();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четное положительное число, обозначающее размер массива:");
        int a = sc.nextInt();
        if (a < 0 || a % 2 != 0) {
            System.out.println("Вы ввели неверное число, введите еще раз:");
            Lesson9();
        } else {

            int count1 = 0, count2 = 0;
            int[] array = new int[a];
            for (int i = 0; i < a; i++) {

                array[i] = random.nextInt(15);
            }
            for (int i = 0; i < (array.length) / 2; i++) {
                count1 = count1 + array[i];

            }
            for (int i = a - 1; i > (array.length) / 2 - 1; i--) {
                count2 = count2 + array[i];

            }

            System.out.println(Arrays.toString(array));
            if (count1 == count2) {
                System.out.println("Сумма элементов модуля первой половины массива равна сумме элементов модуля " +
                        "второй половины массива: " + count1 + " = " + count2);
            } else if (count1 > count2) {
                System.out.println("Сумма элементов модуля первой половины массива больше суммы элементов модуля " +
                        "второй половины массива: " + count1 + " > " + count2);
            } else  {
                System.out.println("Сумма элементов модуля первой половины массива меньше суммы элементов модуля " +
                        "второй половины массива: " + count1 + " < " + count2);
            }
        }
    }


    /* Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n. Если пользователь
 ввёл не подходящее число, то программа должна выдать соответствующее сообщение. Создать массив из n случайных
 целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из чётных элементов первого
 массива, если они там есть, и вывести его на экран.
     */
    public static void Lesson10() {
        System.out.println();
        System.out.println();
        System.out.println("Lesson 10:");

        System.out.println();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, значение которого больше 3-х, обозначающее размер массива и максимальное" +
                "значение элементов массива: ");
        int n = sc.nextInt();

        if (n <= 3) {
            System.out.println("Вы ввели неверное число, введите еще раз:");
            Lesson10();
        } else {
            int count = 0;
            int[] array1 = new int[n];

            for (int i = 0; i < n - 1; i++) {
                array1[i] = random.nextInt(n + 1);

                {
                    int[] array2 = copyOf(array1, array1.length);
                    if (array2[i] % 2 == 0) {
                        count = array2[i];
                        array2[i] = count;
                        System.out.print(count + " ");
                    }
                }
            }
            System.out.println();
            System.out.println(Arrays.toString(array1));
            System.out.println();
            System.out.println("В первую очередь вывела четные элементы массива, во вторую" +
                    " созданный масив ))");
        }
    }
}









        


