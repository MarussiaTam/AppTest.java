package lesson4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {

    @Test
    void isTriangleTest() {
        boolean result = new Triangle().isTriangle(0, 2, 3);
        Assertions.assertEquals(false, result);
    }

    @Test
    void isTriangleTest1() {
        boolean result = new Triangle().isTriangle(5, 6, 6);
        Assertions.assertEquals(true, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 5", "0, 0, 0"})
    void isTriangleTest1(int arg) {
        boolean result = new Triangle().isTriangle(arg, arg, arg);
        Assertions.assertEquals(true, result, String.valueOf(0));
        //здесь (вероятно где-то ошибка) всегда тест проходит, хоть true, хоть false
    }


}
