package Level1.E6_E7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    //Exercise 1
    public static List<Object> sortObjectsByLength(List<Object> list) {
        return list.stream()
                .sorted(Comparator.comparing(l -> l.toString().length()))
                .collect(Collectors.toList());
    }

    //Exercise 2
    public static List<Object> sortReverseObjectsByLength(List<Object> list) {
        return list.stream()
                .sorted(Comparator.comparing(l -> l.toString().length()))
                .collect(Collectors.toList())
                .reversed();
    }
}
