// linear search in array
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50};
        int target = 4;
        int index = -1;

        System.out.print("The ELement found at index: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
            }
        }

        System.out.println(index);
    }
}
