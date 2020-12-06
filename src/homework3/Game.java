package homework3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[][] b = new String[3][3];

        b[0][0] = (" * ");
        b[0][1] = (" * ");
        b[0][2] = (" * ");

        b[1][0] = (" * ");
        b[1][1] = (" * ");
        b[1][2] = (" * ");

        b[2][0] = (" * ");
        b[2][1] = (" * ");
        b[2][2] = (" * ");


        int i;
        int j;
        String krestik = " X ";
        String nolik = " 0 ";
        String gamer, gamercomp;
        String k = "№ столбца";
        String m = "№ строки";


        System.out.println("Игрок выбирает значение, которым будет играть: ");
        System.out.print("Нажмите 1 если " + krestik + " нажмите 2 если " + nolik + ": ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) {
            gamer = krestik;
            gamercomp = nolik;
        } else {
            gamer = nolik;
            gamercomp = krestik;
        }
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }

            System.out.println();
        }
        System.out.println("Отлично, Вы играете: " + gamer + "-ом!, " +
                "компьютер играет " + gamercomp + "-ом!");
        System.out.println("Для постановки \"" + gamer + "\" в " +
                "игровое поле Вы будете указывать  \n" + m + ": и " + k + ": от 1 до 3");
        System.out.println();
        System.out.println("Добро пожаловать в игру!!! Старт:");
        while (b[0][0] == " * " && b[1][0] == " * " && b[2][0] == " * " | b[1][0] == " * "
                && b[1][1] == " * " && b[1][2] == " * " | b[0][0] == " * " && b[1][1]
                == " * " && b[2][2] == " * "| b[2][0] == " * " && b[1][1] == " * " && b[0][2] == " * ") {

            do {
                System.out.print("Укажите " + m + ":");
                i = sc.nextInt() - 1;
                System.out.print("Укажите " + k + ":");
                j = sc.nextInt() - 1;
                if (b[i][j] != gamer && b[i][j] != gamercomp) {
                    b[i][j] = gamer;

                } else {
                    System.out.println("Вы указали повторяющийся столбец и строку, пропускаете ход");
                }
                for (i = 0; i < b.length; i++) {
                    for (j = 0; j < b[i].length; j++) {
                        System.out.print(b[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("Компьютер: ");
                int from = 0;
                int to = 2;
                Random ran = new Random();
                i = ran.nextInt(2);
                j = ran.nextInt(2);
                int i1 = i + 1;
                int j1 = j + 1;
                System.out.println(m + ":" + i1);
                System.out.println(k + ":" + j1);
                if (b[i][j] != gamer && b[i][j] != gamercomp) {
                    b[i][j] = gamercomp;

                    for (i = 0; i < b.length; i++) {
                        for (j = 0; j < b[i].length; j++) {
                            System.out.print(b[i][j]);
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Компьютер указал повторяющийся столбец и строку, пропускаете ход");
                }
            }


            while (b[0][0] != " * " || b[0][1] != " * " || b[0][2] != " * " || b[1][0] != " * "
                    || b[1][2] != " * " || b[1][1] != " * " || b[2][0] != " * " || b[2][1] != " * " || b[2][2] != " * ");

            System.out.println("!!!");
        } return;
    }
}






