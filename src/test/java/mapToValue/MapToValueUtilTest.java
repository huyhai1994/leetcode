package mapToValue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class MapToValueUtilTest {


    @Test
    public void case0() {
        List<InputReportType> inputString = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style [as payload]")
    public void case1() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.DAILY);
        List<String> expected = new ArrayList<>();
        expected.add("DAILY");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style")
    public void case2() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.DAILY);
        List<String> expected = new ArrayList<>();
        expected.add("DAILY");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case3() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.DAILY_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add("DAILY");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style [as payload]")
    public void case4_0() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.INVESTMENT);
        List<String> expected = new ArrayList<>();
        expected.add("INVESTMENT");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style")
    public void case4_1() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.INVESTMENT);
        List<String> expected = new ArrayList<>();
        expected.add("INVESTMENT");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Essay Style")
    public void case5() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.INVESTMENT_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add("INVESTMENT");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style [as payload]")
    public void case6_0() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.PRODUCT_REVIEW);
        List<String> expected = new ArrayList<>();
        expected.add("PRODUCT_REVIEW");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style")
    public void case6_1() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.PRODUCT_REVIEW);
        List<String> expected = new ArrayList<>();
        expected.add("PRODUCT_REVIEW");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Essay Style")
    public void case7() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.PRODUCT_REVIEW_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add("PRODUCT_REVIEW");
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case8() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.INDEPTH);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.INDEPTH.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case9() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.INDEPTH);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.INDEPTH.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Essay Style")
    public void case10() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.INDEPTH_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.INDEPTH.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style [as payload]")
    public void case11() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.JOURNAL_NOTE_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.JOURNAL_NOTE.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style")
    public void case12() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.JOURNAL_NOTE_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.JOURNAL_NOTE.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Essay Style")
    public void case13() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.JOURNAL_NOTE);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.JOURNAL_NOTE.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Blog Style [as payload]")
    public void case14() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.SOCIAL_MEDIA_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Blog Style")
    public void case15() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.SOCIAL_MEDIA_BLOG);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Facebook Style [as payload]")
    public void case16() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.SOCIAL_MEDIA_FACEBOOK);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Facebook Style")
    public void case17() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.SOCIAL_MEDIA_FACEBOOK);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + X Style [as payload]")
    public void case18() {
        // return result fast
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.SOCIAL_MEDIA_X);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + X Style")
    public void case19() {
        // return result fast
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.SOCIAL_MEDIA_X);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Youtube Style [as payload]")
    public void case20() {
        // return result fast
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.SOCIAL_MEDIA_YOUTUBE);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Youtube Style")
    public void case21() {
        // return result fast
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.REPORT);
        inputString.add(InputReportType.SOCIAL_MEDIA_YOUTUBE);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.SOCIAL_MEDIA.name());
        assertIterableEquals(expected, MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Report + Social media + Journal note")
    public void case22() {
        List<InputReportType> inputString = new ArrayList<>();
        inputString.add(InputReportType.DAILY);
        inputString.add(InputReportType.SOCIAL_MEDIA_YOUTUBE);
        inputString.add(InputReportType.JOURNAL_NOTE);
        List<String> expected = new ArrayList<>();
        expected.add(ReportType.DAILY.name());
        expected.add(ReportType.SOCIAL_MEDIA.name());
        expected.add(ReportType.JOURNAL_NOTE.name());
        assertIterableEquals(
                expected,
                MapToValueUtil.mapValueToString(inputString));
    }
}