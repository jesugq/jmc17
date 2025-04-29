public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        double paycheck = getPaycheck() * 2D;
        System.out.printf("%s receives their holiday daily pay of %.2f dollars.", name, paycheck);
    }

    public double getPaycheck() {
        return hourlyPayRate*8D;
    }

    @Override
    public int getAge() {
        int age = super.getAge();
        if (age > 65) {
            System.out.printf("%s meets the requirements to retire.\n", name);
        }
        return age;
    }

    @Override
    public double collectPay() {
        double paycheck = getPaycheck();
        System.out.printf("%s receives their daily pay of %.2f.\n", name, paycheck);
        return paycheck;
    }

    @Override
    public void terminate(String endDate) {
        super.terminate(endDate);
    }

    @Override
    public String toString() {
        double paycheck = getPaycheck();
        return String.format("%s receives a daily pay of %.2f. ", name, paycheck);
    }
}
