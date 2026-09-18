// Binary Searching
public class Array13 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int target = 0;
        boolean found = false;
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (numbers[mid] == target) {
                found = true;
                break;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (found) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
