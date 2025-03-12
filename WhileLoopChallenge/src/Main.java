public class Main {

    public static void main(String[] args) {

        int iteration = 4;
        int evenCount = 0;
        int oddCount = 0;
        while (iteration <= 20) {
            iteration++;
            if (!isEvenNumber(iteration)) {
                oddCount++;
                continue;
            }

            evenCount++;
            System.out.println(iteration);

            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Even numbers found: " + evenCount);
        System.out.println("Odd numbers found:  " + oddCount);
    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
}
