package homework6_8.clothes;

import homework6_8.clothes.jacket.Jacket;
import homework6_8.clothes.pants.Pants;
import homework6_8.clothes.shoes.Shoes;

public class Human implements Move {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Human(Jacket jacket, Pants pants, Shoes shoes) {

        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOnClothes(String name) {
        System.out.println(name + " put on: ");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOffClothes(String name) {
        System.out.println(name + " take off: ");
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
