package lesson4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TriangleTest {

    @Test
        void isTriangleTest() {
        boolean result = new Triangle().isTriangle(0,2,3);
    }

    @Test
    void isTriangleTest1() {
        boolean result = new Triangle().isTriangle(5,6,6);
    }

}




