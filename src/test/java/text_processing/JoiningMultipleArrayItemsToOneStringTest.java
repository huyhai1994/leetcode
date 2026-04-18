package text_processing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoiningMultipleArrayItemsToOneStringTest {
    @Test
    void testThreeItems() {
        String expectedOutput = "\"a\" AND \"b\" AND \"c\"";
        assertEquals(expectedOutput, JoiningMultipleArrayItemsToOneString.joinItemsToOneString(new String[]{"a", "b", "c"}));
    }

}