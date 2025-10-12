package mapToValue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapToValueUtilTest {


    @Test
    public void case0() {
        List<InputReportType> inputString = List.of();
        assertEquals("", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style [as payload]")
    public void case1() {
        List<InputReportType> inputString = List.of(InputReportType.DAILY);
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style")
    public void case2() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.DAILY);
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case3() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.DAILY_BLOG);
        assertEquals("DAILY", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style [as payload]")
    public void case4_0() {
        List<InputReportType> inputString = List.of(InputReportType.INVESTMENT);
        assertEquals("INVESTMENT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style")
    public void case4_1() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INVESTMENT);
        assertEquals("INVESTMENT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Essay Style")
    public void case5() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INVESTMENT_BLOG);
        assertEquals("INVESTMENT", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style [as payload]")
    public void case6_0() {
        List<InputReportType> inputString = List.of(InputReportType.PRODUCT_REVIEW);
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style")
    public void case6_1() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.PRODUCT_REVIEW);
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Essay Style")
    public void case7() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.PRODUCT_REVIEW_BLOG);
        assertEquals("PRODUCT_REVIEW", MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case8() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INDEPTH);
        assertEquals(ReportType.INDEPTH.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case9() {
        List<InputReportType> inputString = List.of(InputReportType.INDEPTH);
        assertEquals(ReportType.INDEPTH.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Essay Style")
    public void case10() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INDEPTH_BLOG);
        assertEquals(ReportType.INDEPTH.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style [as payload]")
    public void case11() {
        List<InputReportType> inputString = List.of(InputReportType.JOURNAL_NOTE_BLOG);
        assertEquals(ReportType.JOURNAL_NOTE.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style")
    public void case12() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.JOURNAL_NOTE_BLOG);
        assertEquals(ReportType.JOURNAL_NOTE.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Essay Style")
    public void case13() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.JOURNAL_NOTE);
        assertEquals(ReportType.JOURNAL_NOTE.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Blog Style [as payload]")
    public void case14() {
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_BLOG);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Blog Style")
    public void case15() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_BLOG);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Facebook Style [as payload]")
    public void case16() {
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_FACEBOOK);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Facebook Style")
    public void case17() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_FACEBOOK);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + X Style [as payload]")
    public void case18() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_X);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + X Style")
    public void case19() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_X);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Youtube Style [as payload]")
    public void case20() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_YOUTUBE);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Youtube Style")
    public void case21() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_YOUTUBE);
        assertEquals(ReportType.SOCIAL_MEDIA.name(), MapToValueUtil.mapValueToString(inputString));
    }
}