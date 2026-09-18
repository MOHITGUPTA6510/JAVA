// counting a target number
public class Array9 {
    public static void main(String[] args) {
        int[] numbers = {10, 200, 30, 4, 50, 50, 20, 3, 199, 50};

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyCount = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadyCount = true;
                    break;
                }
            }

            if (alreadyCount) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            System.out.println("Number : " + numbers[i]);
            System.out.println("Count : " + count);
        }
    }
}
