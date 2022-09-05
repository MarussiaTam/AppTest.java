package lesson4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJExamplesTest {
    @Test
    void assertJTest() {
        assertThat(new Functions().isPolindrom("121")).isFalse();
    }
}
