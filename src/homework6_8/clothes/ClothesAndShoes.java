package homework6_8.clothes;

public abstract class ClothesAndShoes {
    private String color;
    private String size;
    private String gender;

    public ClothesAndShoes(String color, String size, String gender) {
        this.color = color;
        this.size = size;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }
}
