import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class UniqueElements{
    public static int[] getUniqueNumbers(int[] numbers) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int number : numbers) {
            uniqueSet.add(number);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int value : uniqueSet) {
            uniqueArray[index++] = value;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 2, 3, 4, 4, 5 };
        int[] output = getUniqueNumbers(input);
        System.out.println("Original array: " + Arrays.toString(input));
        System.out.println("Unique array: " + Arrays.toString(output));
    }
}

