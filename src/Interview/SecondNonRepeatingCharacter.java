package Interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "idd mohammad";

        Map<Character, Long> frequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

        System.out.println(frequency);

        Character c = frequency.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1 && e.getKey() != ' ')
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(c);
    }
}
