package homework6_8.clothes.shoes;

import homework6_8.clothes.ClothesAndShoes;

public class ColumbiaShoes extends ClothesAndShoes implements Shoes {
    private String brand = "Columbia";

    public ColumbiaShoes(String color, String size, String gender, String brand) {
        super(color, size, gender);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void putOn() {
        System.out.println("shoes color: " + getColor() + ", size: " + getSize() + ", gender: " + ", brand: " + brand);
    }

    @Override
    public void takeOff() {
        System.out.println("shoes color: " + getColor() + ", size: " + getSize() + ", gender: " + ", brand: " + brand);
    }
}
