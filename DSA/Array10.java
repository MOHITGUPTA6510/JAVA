// bubble sort
public class Array10 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50, 20, 3, 199};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
