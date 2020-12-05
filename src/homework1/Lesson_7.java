package homework1;

import java.util.Scanner;

/*В переменную записываете количество программистов.
 В зависимости от количества программистов необходимо вывести правильно окончание.
 Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Lesson_7 {
    public static void main(String[] args) {
        System.out.println("Введите число не равное \"0\" для проверки задания, если хотите окончить проверку " +
                "введите число \"0\" :");
        Scanner sc = new Scanner(System.in);
        int programmers = sc.nextInt();
        if (programmers != 0) {

            int a = programmers % 10;
            int b = programmers % 100;

            if (a == 1 && b > 0 && b != 11) {
                System.out.println(programmers + " программист.");
            } else if (a >= 5 || a == 0 && b >= 10 || b == 0 || b >= 11) {
                System.out.println(programmers + " программистов.");
            } else {
                System.out.println(programmers + " программиста.");
            }
        } else {
            System.out.println("Проверка окончена");
        }
    }
}
