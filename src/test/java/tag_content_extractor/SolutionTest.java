package tag_content_extractor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void validTag() {
        String htmlRaw = "<h1>Nayeem loves consling</h1>";
        Solution sol = new Solution();
        assertEquals("Nayeem loves consling", sol.tagContentExtractor(htmlRaw));

    }

}