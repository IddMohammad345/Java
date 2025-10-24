import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateAllStringsInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        //by using stream
        String concatenated = list.stream().collect(Collectors.joining(","));
        System.out.println("\""+concatenated+"\"");
        System.out.println("========================================");
        StringBuilder concatenatedString=new StringBuilder();
        for (String s:list){
            concatenatedString.append(s);
        }

        System.out.println("\""+concatenatedString+"\"");


    }
}
