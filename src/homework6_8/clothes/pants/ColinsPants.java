package homework6_8.clothes.pants;

import homework6_8.clothes.ClothesAndShoes;

public class ColinsPants extends ClothesAndShoes implements Pants {
    private String brand = "Colin's";

    public ColinsPants(String color, String size, String gender, String brand) {
        super(color, size, gender);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void putOn() {
        System.out.println("pants color: " + getColor() + ", size: " + getSize() + ", gender: " + ", brand: " + brand);
    }

    @Override
    public void takeOff() {
        System.out.println("pants color: " + getColor() + ", size: " + getSize() + ", gender: " + ", brand: " + brand);
    }
}
