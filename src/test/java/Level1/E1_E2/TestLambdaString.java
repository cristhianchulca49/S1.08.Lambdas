package Level1.E1_E2;

import Level1.LambdaString;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestLambdaString {
    //Exercise 1
    @Test
    public void testGetStringWithO() {
        List<String> list = List.of("Cristian", "JavaScript", "Book", "Mouse", "Sun", "Saturday");
        List<String> expected = List.of("Book", "Mouse");
        List<String> result = LambdaString.getStringWithO(list);
        assertEquals(expected, result);
    }

    //Exercise 2
    @Test
    public void testGetStringWithOAndLengthMoreThanFive() {
        List<String> list = List.of("Cristian", "Neighbourhood", "Book", "Mouse", "Pedro", "Notebook");
        List<String> expected = List.of("Neighbourhood", "Notebook");
        List<String> result = LambdaString.getStringWithOAndLengthMoreThanFive(list);
        assertEquals(expected, result);
    }

}
