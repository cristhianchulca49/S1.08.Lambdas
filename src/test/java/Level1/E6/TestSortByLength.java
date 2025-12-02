package Level1.E6;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class TestSortByLength {
    @Test
    public void testSortObjectsByLength() {
        List<Object> list = List.of("1,2,3,4,5", "Patrice", 12345, "12345", "numbers", "0", 0, 123456789);
        List<Object> expected = List.of("0", 0, 12345, "12345", "Patrice", "numbers", "1,2,3,4,5", 123456789);
        List<Object> result = SortByLength.sortObjectsByLength(list);

        assertEquals(expected, result);
    }

    @Test
    public void testSortReverseObjectsByLength() {
        List<Object> list = List.of("1,2,3,4,5", "Patrice", 12345, "12345", "numbers", "0", 0, 123456789);
        List<Object> expected = List.of(123456789, "1,2,3,4,5", "numbers", "Patrice", "12345", 12345, 0, "0");
        List<Object> result = SortByLength.sortReverseObjectsByLength(list);

        assertEquals(expected, result);
    }
}
