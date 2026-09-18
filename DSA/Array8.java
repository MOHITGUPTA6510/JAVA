// counting a target number
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50, 50, 20, 3, 199, 50};
        int target = 50;
        int count = 0;

        System.out.print("count of target number : ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
