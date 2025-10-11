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
    @DisplayName("General Report + Business Style [as payload]")
    public void case1() {
        List<String> inputString = List.of("DAILY");
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style")
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
    @DisplayName("Investment Report + Business Style [as payload]")
    public void case4_0() {
        List<String> inputString = List.of("INVESTMENT");
        assertEquals("INVESTMENT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style")
    public void case4_1() {
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
    @DisplayName("Review Report + Business Style [as payload]")
    public void case6_0() {
        List<String> inputString = List.of("PRODUCT_REVIEW");
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style")
    public void case6_1() {
        List<String> inputString = List.of("REPORT", "PRODUCT_REVIEW");
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Essay Style")
    public void case7() {
        List<String> inputString = List.of("REPORT", "PRODUCT_REVIEW_BLOG");
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case8() {
        List<String> inputString = List.of("REPORT", "INDEPTH");
        assertEquals(ReportType.INDEPTH.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case9() {
        List<String> inputString = List.of("INDEPTH");
        assertEquals(ReportType.INDEPTH.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Essay Style")
    public void case10() {
        List<String> inputString = List.of("REPORT", "INDEPTH_BLOG");
        assertEquals(ReportType.INDEPTH.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style [as payload]")
    public void case11() {
        List<String> inputString = List.of("JOURNAL_NOTE_BLOG");
        assertEquals(ReportType.JOURNAL_NOTE.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style")
    public void case12() {
        List<String> inputString = List.of("REPORT", "JOURNAL_NOTE_BLOG");
        assertEquals(ReportType.JOURNAL_NOTE.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Essay Style")
    public void case13() {
        List<String> inputString = List.of("REPORT", "JOURNAL_NOTE");
        assertEquals(ReportType.JOURNAL_NOTE.name(), MapToValueUtil.mapValueToString(inputString));
    }
}