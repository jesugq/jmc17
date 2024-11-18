public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondtopScore = 60;
        if ((topScore > secondtopScore) && (topScore > 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondtopScore <= 90)) {
            System.out.println("Either or both or the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double valueA = 20.00D;
        double valueB = 80.00D;
        double valuesTotal = (valueA + valueB) * 100.00D;
        System.out.println("valuesTotal " + valuesTotal);
        double remainderTotal = valuesTotal % 40.00D;
        System.out.println("remainderTotal " + remainderTotal);
        boolean hasNoRemainder = (remainderTotal == 0.00D) ? true : false;
        System.out.println(hasNoRemainder);
        if (!hasNoRemainder) System.out.println("Got some remainder.");

    }
}
