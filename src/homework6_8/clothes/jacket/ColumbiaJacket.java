package homework6_8.clothes.jacket;

import homework6_8.clothes.ClothesAndShoes;

public class ColumbiaJacket extends ClothesAndShoes implements Jacket {
    private String brand = "Columbia";

    public ColumbiaJacket(String color, String size, String gender, String brand) {
        super(color, size, gender);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void putOn() {
        System.out.println("jacket color: " + getColor() + ", size: " + getSize() + ", gender: " + ", brand: " + brand);
    }

    @Override
    public void takeOff() {
        System.out.println("jacket color: " + getColor() + ", size: " + getSize() + ", gender: " + ", brand: " + brand);
    }
}
