package Homework_1;

/*Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на10.
 Вывести полученное число
 */
public class Lesson_3 {
    public static void main(String[] args) {
        int a = -3;
        if (a == 0) {
            System.out.println(10);
        } else if (a > 0) {
            System.out.println(++a);
        } else {
            System.out.println(a -= 2);
        }
    }
}


