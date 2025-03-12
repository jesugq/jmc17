public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        int i, number;
        boolean isReady;

        i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println();


        i = 1;
        while (true) {
            if (i > 5) break;
            System.out.println(i);
            i++;
        }
        System.out.println();

        isReady = false;
        i = 1;
        do {
            if (i > 5) break;
            System.out.println(i);
            i++;

            isReady = i > 0;
        } while (isReady);
        System.out.println();

        number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) continue;
            System.out.print(number + "_");
        }
    }
}
