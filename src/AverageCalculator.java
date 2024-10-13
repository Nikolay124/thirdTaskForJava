import java.util.Arrays;
public class AverageCalculator {
    public static int roundAverage(int[] numbers) {
        // Пустой массив возвращает 0
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double)sum / numbers.length;
        return (int)Math.round(average);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 5, 1};
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Result: " + roundAverage(arr));
    }
}
