package homework6_8.robot.heads;

public class ToshibaHead implements IHead{
    private int price;
    public ToshibaHead(int price) {
        this.price = price;
    }
    public ToshibaHead(){
    }

    @Override
    public void speek() {
        System.out.println("Голова Toshiba говорит на испанском языке");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
