package string_builder_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringBuilderApiTest {
    @Test
    void whenReverseAnString_thenGotReversedString() {
        assertTrue("BA".equals(new StringBuilder().append("AB").reverse().toString()));
    }
}
