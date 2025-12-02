package Level1;


import java.util.List;
import java.util.stream.Collectors;

public class LambdaString_E1_E2 {
    //Exercise 1
    private List<String> mainList = List.of("Book", "Pedro", "Lambdas", "JavaScript", "Cristian", "Open");

    public static List<String> getStringWith(List<String> list) {
        return list.stream()
                .filter(l -> l.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }

    public static void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}
