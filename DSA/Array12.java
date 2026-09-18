// lenear searching
public class Array12 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50, 20, 3, 199};
        int target = 501;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
            } else {
                continue;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
