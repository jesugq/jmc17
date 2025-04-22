public class Main {

    public static void main(String[] args) {

        // Account account = new Account(12345, 1000D, "Bob Brown", "myemail@bob.com", "(087) 123 4567");
        Account account = new Account();

        account.setBalance(2000D);
        account.deposit(-200D);
        account.withdraw(-200D);
        account.withdraw(3000D);
        account.deposit(1000D);
        account.withdraw(3000D);
    }
}
