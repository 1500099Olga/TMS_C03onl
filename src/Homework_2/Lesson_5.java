//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
// для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

package Homework_2;

public class Lesson_5 {
    public static void main(String[] args) {
        double cm, d;

        for (d = 1; d <= 20; d++) {
            cm = d * 2.54;
            System.out.println(d + " дюйм = " + cm + " см");

        }
    }
}
