package Homework_1;

/*Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей.
 Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
 Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
 Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами несуществует.
 */
public class Lesson_2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 30;
        int c = 50;

        if ((a + b) > c & (a + c) > b & (b + c) > a) {
            System.out.println("Треугольник с такими сторонами существует");
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }
    }
}
