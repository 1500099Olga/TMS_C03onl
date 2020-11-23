package Homework_2;

import org.w3c.dom.ls.LSOutput;

public class Lesson_8 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 3 ; i >=0; i--) {
            for (j =i ; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } System.out.println();

        for (i = 0; i < 4; i++) {
            for (j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
