//Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?

package Homework_2;

public class Lesson_1 {

    public static void main(String[] args) {
        double distance = 10;
double distance1 =0;
        int i = 1;
        while (i <= 7) {
            i++;
            distance1 = distance + distance1 * 1.1;}
            System.out.println("Суммарный путь, который пробежал спортсмен за семь дней составляет - " + distance1 + " км.");
        }
    }








