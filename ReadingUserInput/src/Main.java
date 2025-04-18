import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course.");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine();

        System.out.println("What year were you born?");

        boolean validDate = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear-125) + " and <= " + (currentYear));

            try {
                age = currentYear - Integer.parseInt(scanner.nextLine());
                validDate = (age > 0);
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed. Try again.");
            }
        } while (!validDate);

        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

            int date = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if ((date < minimumYear) || (date > currentYear)) {
                return -1;
            }

            return (currentYear - date);
    }
}
