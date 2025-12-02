package Level1.E1_E2;

import Level1.LambdaString;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestLambdaString {
    @Test
    public void testGetStringWith() {
        List<String> list = List.of("Cristian", "JavaScript", "Book", "Mouse", "Sun", "Saturday");
        List<String> expected = List.of("Book", "Mouse");
        List<String> result = LambdaString.getStringWith(list);
        Assert.assertEquals(expected, result);
    }
}
