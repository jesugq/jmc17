public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire() {
        System.out.printf("%s has retired.\n", name);
        isRetired = true;
    }

    public double getPaycheck() {
        return isRetired ? annualSalary/12D : annualSalary/10D;
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
        System.out.printf("%s receives their monthly pay of %.2f.\n", name, paycheck);
        return paycheck;
    }

    @Override
    public void terminate(String endDate) {
        super.terminate(endDate);
    }

    @Override
    public String toString() {
        String paytype = isRetired ? "a pension pay" : "a salaried monthly pay";
        String status = isRetired ? "is currently retired" : "is currently active";
        double paycheck = getPaycheck();
        return String.format("%s receives a %s of %.2f and %s. ", name, paytype, paycheck, status) + super.toString();
    }
}
