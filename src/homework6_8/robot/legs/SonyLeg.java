package homework6_8.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }
    public SonyLeg(){
    }

    @Override
    public void step() {
        System.out.println("Робот Sony шагает медленно.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
