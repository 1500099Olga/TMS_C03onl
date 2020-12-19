package homework6_8.robot.legs;


public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }
    public SamsungLeg(){
    }

    @Override
    public void step() {
        System.out.println("Робот Samsung шагает быстро.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
