package homework11;

import java.io.*;

public class Homework11 {
    public static void main(String[] args) {
        Lesson1();
    }

    public static void Lesson1() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Lesson1.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                StringBuilder str1 = new StringBuilder(str);
                if ((str.equalsIgnoreCase(str1.reverse().toString()))) {
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                            ("Lesson1Polindrom.txt", true))) {
                        bufferedWriter.write(str + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
