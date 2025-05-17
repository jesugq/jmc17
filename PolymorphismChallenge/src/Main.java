public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        car.drive();

        System.out.println();

        GasPoweredCar gasPoweredCar = new GasPoweredCar(100D, 4);
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        System.out.println();

        ElectricCar electricCar = new ElectricCar(50D, 8);
        electricCar.startEngine();
        electricCar.drive();

        System.out.println();

        HybridCar hybridCar = new HybridCar(100D, 50D, 4, 8);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}
