public class Motorcycle {

        String brand;
        int power;
        boolean engineOn = false;

        void oneWheel() {

        }

        void accelerate() {

        }

        void stop() {

        }

        void startEngine() {
            if (engineOn == true) {
                System.out.println("Engine is on!");
            } else {
                System.out.println("Engine is off");
            }
        }


}
