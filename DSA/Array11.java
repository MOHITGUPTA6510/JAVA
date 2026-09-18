// Selection sort
public class Array11 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50, 20, 3, 199};

        for (int i = 0; i < numbers.length; i++) {
            int small = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[small]) {
                    small = j;
                }
            }

            int swap = numbers[i];
            numbers[i] = numbers[small];
            numbers[small] = swap;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
