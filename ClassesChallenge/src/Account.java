public class Account {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this(12345, 0D, "DefaultName", "DefaultEmail", "DefaultPhone");
        System.out.println("Empty constructor is called.");
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this(1235, 0D, customerName, customerEmail, customerPhone);
        System.out.println("Account constructor with 3 parameters is called.");
    }

    public Account(int number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Account constructor with 5 parameters is called.");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private void printBalance() {
        System.out.printf("Balance is: $%.2f.\n", balance);
    }

    public void deposit(double amount) {

        if (amount   < 0) {
            System.out.printf("Deposit amount %.2f should be positive.\n", amount);
            return;
        }

        System.out.printf("Deposit amount $%.2f has been processed. ", amount);
        balance += amount;
        printBalance();
    }

    public void withdraw(double amount) {

        if (amount < 0) {
            System.out.printf("Withdraw amount %.2f should be positive.\n", amount);
            return;
        } else if (balance < amount) {
            System.out.printf("Withdraw amount %.2f should exceed balance %.2f.\n", amount, balance);
            return;
        }

        System.out.printf("Withdraw amount $%.2f has been processed. ", amount);
        balance -= amount;
        printBalance();
    }
}
