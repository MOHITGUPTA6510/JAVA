// minimum in an array
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50};
        int min = numbers[0];

        System.out.println(" Min of elements of array : ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(min);
    }
}
