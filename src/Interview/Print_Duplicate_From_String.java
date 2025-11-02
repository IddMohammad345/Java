package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Print_Duplicate_From_String {
    public static void main(String[] args) {
        String str="javaIsGreatProgramingLanguage";
        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        freq.entrySet()
                .stream()
                .filter(a->a.getValue()>1)
                .forEach(a-> System.out.print(a.getKey()+", "));

        System.out.println("\n=====================================");
        //Without using collectors class
        HashMap<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        HashMap::new,
                        (hashMap, character) -> hashMap.merge(character, 1L, Long::sum),
                        HashMap::putAll
                );

        map.entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(e-> System.out.print(e.getKey()+", "));
    }
}
