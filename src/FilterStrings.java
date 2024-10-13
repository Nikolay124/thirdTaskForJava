import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FilterStrings {
    public static List<String> filterWords(String[] words) {
        // Создаем список для хранения отфильтрованных строк
        List<String> filteredWords = new ArrayList<>();

        // Итерируем по каждому слову в массиве
        for (String word : words) {
            if (word.length() > 3) {
                // Добавляем слово в список, если его длина больше 3 символов
                filteredWords.add(word);
            }
        }

        // Превращаем список обратно в массив строк
        String[] result = filteredWords.toArray(new String[0]);

        return Arrays.asList(result);
    }

    public static void main(String[] args) {
        String[] input = {"cat", "elephant", "dog", "giraffe"};
        System.out.println("Input: " + Arrays.toString(input));
        List<String> output = filterWords(input);
        System.out.println("Output: " + output);
    }
}
