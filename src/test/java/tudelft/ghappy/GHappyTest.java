package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "text={0}, result={1}")
    @CsvSource({ "gxx,false","ggxx,true","xxggxx,true", "xxgxx,false"
            , "xxggyygxx,false", "xxggyygg,true" })
    public void testAlgorithm(String text, boolean  expectedResult) {
        GHappy bags = new GHappy();
        boolean result = bags.gHappy(text);
        Assertions.assertEquals(expectedResult, result);
    }
}
