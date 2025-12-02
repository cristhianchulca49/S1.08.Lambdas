package Level1.E6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static List<Object> sortObjectsByLength(List<Object> list) {
        return list.stream()
                .sorted(Comparator.comparing(l -> l.toString().length()))
                .collect(Collectors.toList());
    }
}
