package Homework_1;

//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class Lesson_4 {
    public static void main(String[] args) {
        int a = -325;
        int b = 526387;
        int c = 6464684;
        int count = 0;

        if (a >= 0) {
            count++;
        }
        if (b >= 0) {
            count++;
        }
        if (c >= 0) {
            count++;
        }
        if (count > 0) {
            System.out.println("Положительных чисел - " + count);
        } else {
            System.out.println("Положительных чисел нет.");
        }
    }
}