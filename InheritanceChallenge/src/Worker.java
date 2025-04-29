import java.time.Year;

public class Worker {

    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this(name, birthDate, null);
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        int  age = Year.now().getValue() - Integer.parseInt(birthDate.substring(0, 4));
        System.out.printf("%s is %d years old.\n", name, age);
        return age;
    }

    public double collectPay() {
        System.out.printf("%s has no salary yet.\n", name);
        return 0D;
    }

    public void terminate(String endDate) {
        String status = (endDate == null) ? "has not been terminated" : "was terminated on date "+endDate;
        System.out.printf("%s %s.\n", name, status);
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String status = (endDate == null) ? "has no termination date" : "was terminated on date "+endDate;
        return String.format("%s is was born on %s and %s. ", name, birthDate, status);
    }
}
