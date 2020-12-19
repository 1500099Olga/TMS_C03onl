package homework6_8.clothes;

import homework6_8.clothes.jacket.*;
import homework6_8.clothes.pants.*;
import homework6_8.clothes.shoes.*;

public class StopNakedHumans {
    public static void main(String[] args) {
        dressPositionOnHuman();
    }

    public static void dressPositionOnHuman() {
        Human human = new Human(new ColinsJacket("red", "xxl", "man", "Colin's"),
                new ColinsPants("black", "xl", "man", "Colin's"), new ColumbiaShoes("grey",
                "43", "man", "Columbia"));
        Human human1 = new Human(new ColumbiaJacket("green", "s", "woman", "Columbia"),
                new ColumbiaPants("black", "m", "woman", "Columbia"), new ColinsShoes("red",
                "38", "unisex", "Colin's"));
        human.putOnClothes("Alex");
        System.out.println();
        human1.putOnClothes("Olga");
        System.out.println();
        System.out.println();
        human.takeOffClothes("Alex");
        System.out.println();
        human1.takeOffClothes("Olga");
    }
}
