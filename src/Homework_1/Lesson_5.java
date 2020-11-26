package Homework_1;

/*Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
*/
public class Lesson_5 {
    public static void main(String[] args) {
        int a = -35;
        int b = -526387;
        int c = -6464684;
        int count1 = 0;
        int count2 = 0;

        if (a >= 0) {
            count1++;
        } else {
            count2++;
        }
        if (b >= 0) {
            count1++;
        } else {
            count2++;
        }
        if (c >= 0) {
            count1++;
        } else {
            count2++;
        }
        if (count1 > 0 | count2 > 0) {
            System.out.println("Положительных чисел - " + count1 + ", отрицательных чисел - " + count2);
        } else {
        }
    }
}

