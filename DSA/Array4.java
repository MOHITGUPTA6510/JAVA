// maximum in an array
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 40, 50};
        int max = 0;

        System.out.println(" Sum of elements of array : ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
