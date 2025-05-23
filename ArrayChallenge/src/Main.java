import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = getRandomArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] reverseArray = getReverseArray(array);
        System.out.println(Arrays.toString(reverseArray));
    }

    public static int[] getRandomArray(int length) {

        Random random = new Random();
        int[] array = new int[random.nextInt(length)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static int[] getReverseArray(int[] array) {

        int[] reverseArray = new int[array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[array.length-1-i];
        }
        return reverseArray;
    }
}
