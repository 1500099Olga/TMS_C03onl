//Вычислить: 1+2+4+8+...+256
package Homework_2;

public class Lesson_3 {
    public static void main(String[] args) {
        int a = 0;
        int i;
        for (i = 1; i < 256; i++) {
            a = i * 2+1;
        }
        System.out.println(a);
    }
}
