package homework6_8.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speek() {
        System.out.println("Голова Sony говорит на немецком языке");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
