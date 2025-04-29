public class Employee extends Worker {

    protected long employeeId;
    protected String hireDate;

    private static long employeeNumber = 1L;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return String.format("%s is employee #%d and was hired on %s. ", name, employeeId, hireDate) + super.toString();
    }
}
