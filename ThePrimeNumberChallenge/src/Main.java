public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 18; i ++) {
            String primeNumberText = (isPrime(i) ? "" : "NOT ") + "a prime number";
            // System.out.println(i + " is " + primeNumberText);
        }

        int primeCounter = 0;
        for (int i = 10; primeCounter < 3 && i <= 50; i ++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
                primeCounter ++;
            }
        }
        System.out.println("A total of " + primeCounter + " prime numbers were found.");
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor ++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
