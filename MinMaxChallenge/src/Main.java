import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean isAvailable = false;

        while(true) {
            try {
                System.out.println("Enter a number, or any character to exit: ");
                int number = scanner.nextInt();
                if (number > max) max = number;
                if (number < min) min = number;
                isAvailable = true;
            } catch (InputMismatchException imex) {
                scanner.next();
                break;
            }
        }

        if (isAvailable) {
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        } else {
            System.out.println("No valid data entered.")
        }
    }
}
