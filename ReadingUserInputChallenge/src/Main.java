import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        while (counter <= 5) {
            try {
                System.out.println("Enter number #" + counter + ":");
                double number = scanner.nextDouble();
                sum += number;
                counter++;
            } catch (InputMismatchException imex) {
                System.out.println("Invalid Number");
                scanner.next();
            }
        }

        System.out.println("Sum is: " + sum);
    }
}
