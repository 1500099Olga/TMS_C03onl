package homework6_8.robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price){
        this.price = price;
    }
    public SamsungHand(){

    }

    @Override
    public void upHand() {
        System.out.println("У робота Samsung поднимаются руки в разные cтороны.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
