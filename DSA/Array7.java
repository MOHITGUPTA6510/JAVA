// reverse the array
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50};

        System.out.println("The reverse of array : ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
