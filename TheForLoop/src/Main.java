public class Main {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0D; rate <= 5.0D; rate++) {
            double interestAmount = calculateInterest(10000.0D, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (double rate = 7.5D; rate <= 10.0D; rate += 0.25D) {
            double interestAmount = calculateInterest(100.0D, rate);

            if (interestAmount > 8.5D) { break; }

            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}