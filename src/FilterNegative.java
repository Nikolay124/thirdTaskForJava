import java.util.ArrayList;
import java.util.Arrays;
public class FilterNegative {
    public static int[] removeNegatives(int[] numbers) {
        // Используем ArrayList для временного хранения положительных чисел
        ArrayList<Integer> positiveList = new ArrayList<>();

        // Проверяем каждый элемент массива
        for (int num : numbers) {
            if (num >= 0) {
                positiveList.add(num);
            }
        }

        // Преобразуем ArrayList обратно в массив
        int[] result = new int[positiveList.size()];
        for (int i = 0; i < positiveList.size(); i++) {
            result[i] = positiveList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {-1, 2, -3, 4, -5, 6};
        int[] output = removeNegatives(input);
        System.out.println("Original array: " + Arrays.toString(input));
        System.out.println("Modified array: " + Arrays.toString(output));
    }
}