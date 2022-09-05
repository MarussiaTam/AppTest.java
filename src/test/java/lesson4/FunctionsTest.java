package lesson4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FunctionsTest {

    @Test
    void isPolindromeTest() {
        boolean result = new Functions().isPolindrom("11");
        Assertions.assertEquals(true, result);
    }


    @ValueSource(strings = {"123321", "12321"})
    void isPolindromeTest1(String testWord) {
        boolean result = new Functions().isPolindrom(testWord);
        Assertions.assertEquals(false, result);

    }

}
