package Level1;


import java.util.ArrayList;
import java.util.List;

public class LambdaString {
    //Exercise 1
    public static List<String> getStringWithO(List<String> list) {
        List<String> result = list.stream()
                .filter(l -> l.toLowerCase().contains("o"))
                .toList();

        printList(result);
        return result;
    }

    public static void printList(List<String> list) {
        list.forEach(System.out::println);
    }

    public static List<String> getStringWithOAndLengthMoreThanFive(List<String> list) {
        List<String> result = list.stream()
                .filter(l -> l.toLowerCase().contains("o") && l.length() > 5)
                .toList();
        printList(result);
        return result;
    }
}
