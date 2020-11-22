// Даны 2 числа. Вывести большее из них
public class Lesson_6 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        if (a != b) {
            if (a > b) {
                System.out.println("Число \"a\" больше чем \"b\" и равно: " + a);
            } else {
                System.out.println("Число \"b\" больше чем \"a\" и равно: " + b);
            }
        } else {
            System.out.println("Число \"a\" равно числу \"b\" поэтому вывести наибольшее из них не представляется возможным.");
        }
    }
}
