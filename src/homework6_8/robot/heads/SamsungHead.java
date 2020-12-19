package homework6_8.robot.heads;

public class SamsungHead  implements IHead {
    private int price;
    public SamsungHead (int price){
        this.price = price;
    }
    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Голова Samsung говорит на английском языке");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
