package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "{0}+{1}={2}")
    @CsvSource({ "abc,3,def","abc,0,abc","xyz,3,abc","abc3,3,invalid" })
    public void testAlgorithm(String text,int shift, String  expectedResult) {
        CaesarShiftCipher bags = new CaesarShiftCipher();
        String result = bags.CaesarShiftCipher(text,shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
