import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Letters {

    public static void main(String[] args) {

        List<String> words = List.of("pies", "kot", "Noga", "ogróD");

        String word = words.stream().reduce(String::concat).get().toUpperCase(Locale.ROOT);

        List<Character> letters = word.chars()
                .mapToObj(c -> (char) c).distinct().collect(Collectors.toList());

        System.out.println(letters);
    }
}
