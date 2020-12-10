package homework5;

public class Transport {

        private int power;
        private int speed;
        private int weight;
        private String brand;


        Transport(int power, int speed, int weight, String brand) {
                this.power = power;
                this.speed = speed;
                this.weight = weight;
                this.brand = brand;


        }

        public double getPower() {
                return power;
        }

        public double getSpeed() {
                return speed;
        }

        public double getWeight() {
                return weight;
        }

        public String getBrand() {
                return brand;

        }


}
