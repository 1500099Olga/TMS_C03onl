package homework4;

public class Computer {
    private String typeCPU = "Intel";
    private String ram = "DDR2";
    private String hdd = "10 GB";
    private boolean isStarted;

    public Computer(String typeCPU, String ram, String hdd) {


    }


    public void onComputer() {
        isStarted = true;
        System.out.println("Компьютер включился");
    }

    public void offComputer() {
        isStarted = false;
        System.out.println("Компьютер выключился");
    }

    public void stateComputer() {
        System.out.println("Компьютер включился: " + isStarted);
    }

    @Override
    public String toString() {

        return "Компьютер с парамерами" +
                " {" +
                "тип процессора = " + typeCPU +
                ", оперативная память =  " + ram +
                ", жесткий диск = " + hdd +
                ", ресурс вкл/выкл необходимо задать'}'";

    }
}


