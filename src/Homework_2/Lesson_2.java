//Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
package Homework_2;

public class Lesson_2 {
    public static void main(String[] args) {
        int a = 1;
        int i;
        for (i = 1; i <= 24; i += 3) {
            a *= 2;
        }
        System.out.println("Амёб стало: " + a);
    }
}
