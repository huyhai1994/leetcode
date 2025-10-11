package mapToValue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapToValueUtilTest {


    @Test
    public void case0() {
        List<String> inputString = List.of("");
        assertEquals("", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case1() {
        List<String> inputString = List.of("DAILY");
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case2() {
        List<String> inputString = List.of("REPORT", "DAILY");
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case3() {
        List<String> inputString = List.of("REPORT", "DAILY_BLOG");
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style")
    public void case4() {
        List<String> inputString = List.of("REPORT", "INVESTMENT");
        assertEquals("INVESTMENT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Essay Style")
    public void case5() {
        List<String> inputString = List.of("REPORT", "INVESTMENT_BLOG");
        assertEquals("INVESTMENT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style")
    public void case6() {
        List<String> inputString = List.of("REPORT", "PRODUCT_REVIEW");
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Essay Style")
    public void case7() {
        List<String> inputString = List.of("REPORT", "PRODUCT_REVIEW_BLOG");
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

}