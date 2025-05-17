public class Car {

    private String description;

    public Car (String description) {
        this.description = description;
    }

    public Car () {
        this("Simple Car");
    }

    public void startEngine() {
        System.out.printf("%s - Starting engine%n", this.getClass().getSimpleName());
    }

    public void drive() {
        this.runEngine();
        System.out.printf("%s - Driving%n", this.getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.printf("%s - Running engine%n", this.getClass().getSimpleName());
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;
    private double gas;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        gas = 100D;
    }

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this("", avgKmPerLitre, cylinders);
    }

    @Override
    public void startEngine() {
        if (gas > 5D) {
            System.out.printf("%s - Gas minimum met%n", this.getClass().getSimpleName());
            super.startEngine();
        } else {
            System.out.printf("%s - Gas minimum not met%n", this.getClass().getSimpleName());
        }
    }

    @Override
    public void drive() {
        System.out.printf("%s - Using manual driving%n", this.getClass().getSimpleName());
        super.drive();
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;
    private double charge;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        charge = 100D;
    }

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this("", avgKmPerCharge, batterySize);
    }

    @Override
    public void startEngine() {
        if (charge > 5D) {
            System.out.printf("%s - Charge minimum met%n", this.getClass().getSimpleName());
            super.startEngine();
        } else {
            System.out.printf("%s - Charge minimum not met%n", this.getClass().getSimpleName());
        }
    }

    @Override
    public void drive() {
        System.out.printf("%s - Using self driving%n", this.getClass().getSimpleName());
        super.drive();
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private double avgKmPerCharge;
    private int cylinders;
    private int batterySize;
    private double gas;
    private double charge;

    public HybridCar(String description, double avgKmPerLitre, double avgKmPerCharge, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        gas = 100D;
        charge = 100D;
    }

    public HybridCar(double avgKmPerLitre, double avgKmPerCharge, int cylinders, int batterySize) {
        this("", avgKmPerLitre, avgKmPerCharge, cylinders, batterySize);
    }

    @Override
    public void startEngine() {
        if (gas > 5D) {
            System.out.printf("%s - Gas minimum met%n", this.getClass().getSimpleName());
            super.startEngine();
        } else if (charge > 5D) {
            System.out.printf("%s - Charge minimum met%n", this.getClass().getSimpleName());
            super.startEngine();
        } else {
            System.out.printf("%s - Fuel minimum not met%n", this.getClass().getSimpleName());
        }
    }

    @Override
    public void drive() {
        System.out.printf("%s - Using hybrid driving%n", this.getClass().getSimpleName());
        super.drive();
    }
}
