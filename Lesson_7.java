/*В переменную записываете количество программистов.
 В зависимости от количества программистов необходимо вывести правильно окончание.
 Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Lesson_7 {
    public static void main(String[] args) {
        int programmers = 2;
        int a = programmers % 10;
        int b = programmers % 100;

        if (a == 1 && b > 10 | b < 15) {
            System.out.println(programmers + " программист.");
        } else if (a >= 5 || a == 0 && b >= 10 || b == 0) {
            System.out.println(programmers + " программистов.");
        } else {
            System.out.println(programmers + " программиста.");

        }
    }
}
