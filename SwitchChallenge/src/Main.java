public class Main {

    public static void main(String[] args) {

        char letter = 'B';
        String transmission;

        switch(letter) {
            case 'A': transmission = "Able"; break;
            case 'B': transmission = "Baker"; break;
            case 'C': transmission = "Charlie"; break;
            case 'D': transmission = "Dog"; break;
            case 'E': transmission = "Easy"; break;
            default: transmission = "NOT FOUND"; break;
        }

        System.out.println(transmission);
    }
}
