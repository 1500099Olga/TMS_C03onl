package homework9;

public class Homework9 {
    public static void main(String[] args) {
        Lesson1();
        Lesson2();
        Lesson3();

    }

    /* Вырезать подстроку из строки начиная с первого вхождения
    символа(А) - включю до, последнего вхождения сивола(B) не включ.
     */
    public static void Lesson1() {
        System.out.println("Задача 1:");
        String words = "В связи с выявлением новой мутации короновируса страны начали" +
                " прекращать авиасообщение с Великобританией.\n";
        System.out.println("В тексте: \"В связи с выявлением новой мутации короновируса страны начали " +
                " прекращать авиасообщение с Великобританией.\"");
        String words2 = words.toUpperCase();
        System.out.println("Обрезаем предложение с символа : " + words2.indexOf('А'));
        StringBuffer words3 = new StringBuffer(words2);
        System.out.println(words3.delete(0, 30));
        System.out.println(words3.length());
        System.out.println(words3.lastIndexOf("В"));
        StringBuffer words4 = new StringBuffer(words3);
        System.out.println(words4.delete(58, 75));

    }

    /* Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0
     */
    public static void Lesson2() {
        System.out.println("\n Задача 2:");
        String a = "В отличие от строк, объекты типа StringBuffer и StringBuilder могут " +
                "быть изменены снова и снова, оставляя после себя множество новых " +
                "неиспользуемых объектов.";
        System.out.println("Символ - " + a.charAt(3) + " меняем на символ - " + a.charAt(0));
        String a1 = a.replaceAll("т", "В");
        System.out.println(a1);
    } /* В исходном файле находятся слова, каждое слово на новой стороке. После запуска программы
 должен создать файл, который будет содержать в себе только полиндромы
*/

    public static void Lesson3() {
        System.out.println("\n Задача 3:");
        String polindrom = "rotator, reviver, ветер, топот, шалаш, ураган";
        System.out.println("Выберем полиндромы из слов: " + polindrom);
        String[] arrayOfPolindrom = polindrom.split(", ");
        for (int i = 0; i < arrayOfPolindrom.length; i++) {
            String words1 = arrayOfPolindrom[i];
            String a = words1;
            StringBuilder words2 = new StringBuilder(words1);
            words2.reverse();
            String b = words1.toString();
            boolean c = a.equalsIgnoreCase(b);
            if (c == true) {
                System.out.println(words1);
            }
        }
    }
}

