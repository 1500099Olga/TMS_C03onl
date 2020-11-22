package Homework_2;
//Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
public class Lesson_7 {
    public static void main(String[] args) {
        long sum = 0;
        int i = 0;
        while (i <= 99) {
            sum = sum + i;
            i += 2;
            sum++;
        }
        System.out.println((long) (sum));
    }
}
