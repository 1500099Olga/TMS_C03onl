package robot;

import robot.Robot;
import robot.hands.IHand;
import robot.hands.*;
import robot.heads.IHead;
import robot.heads.*;
import robot.legs.ILeg;
import robot.legs.*;

public class Run {
    public static void main(String[] args) {

        infoRobots();
    }

    /*
    Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
    Класс SonyHead является примером реализацией головы от Sony.
    Создайте 3 робота с разными комплектующими.
    Например у робота голова и нога от Sony а, рука от Samsung.
    У всех роботов вызовите метод action.
            Среди 3-х роботов найдите самого дорогого.
            */
    public static void infoRobots() {
        IRobot robot = new Robot(new ToshibaHead(18000), new ToshibaHand(1000), new SamsungLeg(500));
        IRobot robot1 = new Robot(new SamsungHead(18000), new SonyHand(1100), new ToshibaLeg(1500));
        IRobot robot2 = new Robot(new SonyHead(18000), new SamsungHand(1100), new SonyLeg(1500));
        System.out.println("Config robot number one: ");
        robot.action();
        System.out.println("Cost: " + robot.getPrice() + "$");
        System.out.println();
        System.out.println("Config robot number two: ");
        robot1.action();
        System.out.println("Cost: " + robot1.getPrice() + "$");
        System.out.println();
        System.out.println("Config robot number three: ");
        robot2.action();
        System.out.println("Cost: " + robot2.getPrice() + "$");
        System.out.println();
        if (robot.getPrice() != robot1.getPrice() && robot.getPrice() != robot2.getPrice() && robot1.getPrice()
                != robot2.getPrice()) {
            if (robot.getPrice() > robot1.getPrice()) {
                if (robot.getPrice() > robot2.getPrice()) {
                    System.out.println("The most expensive robot with config one and cost - "
                            + robot.getPrice() + "$");
                } else {
                    System.out.println("The most expensive robot with config three and cost - "
                            + robot2.getPrice() + "$");
                }
            } else if (robot1.getPrice() > robot2.getPrice()) {

                System.out.println("The most expensive robot with config two and cost - "
                        + robot1.getPrice() + "$");

            } else {
                System.out.println("The most expensive robot with config three and cost - "
                        + robot2.getPrice() + "$");
            }
        } else if (robot.getPrice() == robot1.getPrice() && robot.getPrice() != robot2.getPrice()) {
            if (robot.getPrice() > robot2.getPrice()) {
                System.out.println("Robot with config one and two has the same maximum cost - "
                        + robot.getPrice() + "$!");
            } else {
                System.out.println("The most expensive robot with config three and cost - "
                        + robot2.getPrice() + "$!");
            }
        } else if (robot.getPrice() == robot2.getPrice() && robot1.getPrice() == robot2.getPrice()) {
            System.out.println("All robots has the same cost - " + robot.getPrice() + "$");
        } else if (robot.getPrice() < robot1.getPrice()) {
            System.out.println("Robot with config two and three has the same maximum cost - "
                    + robot1.getPrice() + "$!");
        } else {
            System.out.println("The most expensive robot with config one and cost - " + robot.getPrice() + "$!");
        }
    }
}
