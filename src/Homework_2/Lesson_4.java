package Homework_2;

import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        System.out.println("Введите число  \"A\":");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Введите число  \"B\":");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        long a1 = 0;

        for (int i = 0; i < b; i++) {
            a1 = a1 + a;
        }
        System.out.println("Число \"A\", умноженное на число \"B\" равно:  " + a1);
    }
}
