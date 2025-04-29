public class Main {

    public static void main(String[] args) {

        SalariedEmployee semployee0 = new SalariedEmployee("Alice", "1990-01-01", "2020-01-01", 10D*8D*20D*12D);
        detailEmployee(semployee0);
        detailSalariedEmployee(semployee0);
        detailEmployee(semployee0);

        HourlyEmployee hemployee0 = new HourlyEmployee("Boston", "1991-02-01", "2021-02-01", 10D);
        detailEmployee(hemployee0);
        detailHourlyEmployee(hemployee0);
    }

    public static void detailEmployee(Employee employee) {
        System.out.println(employee);
        employee.getAge();
        employee.collectPay();
    }

    public static void detailSalariedEmployee(SalariedEmployee salariedEmployee) {
        salariedEmployee.retire();
    }

    public static void detailHourlyEmployee(HourlyEmployee hourlyEmployee) {
        hourlyEmployee.getDoublePay();
    }
}
