package Interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="idd mohammad";
        Map<Character, Long> frequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character c = frequency.entrySet()
                .stream()
                .filter(e -> e.getValue() < 2)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .get();

        System.out.println(c);

    }
}
