public class Main {

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        boolean isDivisibleBy3 = false;
        boolean isDivisibleBy5 = false;

        for (int i = 1; i < 1000; i++) {
            isDivisibleBy3 = i % 3 == 0;
            isDivisibleBy5 = i % 5 == 0;

            if (isDivisibleBy3 && isDivisibleBy5) {
                countOfMatches++;
                sumOfMatches += i;

                System.out.println(i + " is divisible by both 3 and 5.");
                if (countOfMatches == 5) break;
            }
        }
        System.out.println("A total of " + countOfMatches + " numbers divisible by both 3 and 5 were found.");
    }
}
