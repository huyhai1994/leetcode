package mapToValue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class MapToValueUtilTest {


    @Test
    public void case0() {
        List<InputReportType> inputString = List.of();
        assertIterableEquals(List.of(), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style [as payload]")
    public void case1() {
        List<InputReportType> inputString = List.of(InputReportType.DAILY);
        assertIterableEquals(List.of("DAILY"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("General Report + Business Style")
    public void case2() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.DAILY);
        assertIterableEquals(List.of("DAILY"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    public void case3() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.DAILY_BLOG);
        assertIterableEquals(List.of("DAILY"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style [as payload]")
    public void case4_0() {
        List<InputReportType> inputString = List.of(InputReportType.INVESTMENT);
        assertIterableEquals(List.of("INVESTMENT"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Business Style")
    public void case4_1() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INVESTMENT);
        assertIterableEquals(List.of("INVESTMENT"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Investment Report + Essay Style")
    public void case5() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INVESTMENT_BLOG);
        assertIterableEquals(List.of("INVESTMENT"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style [as payload]")
    public void case6_0() {
        List<InputReportType> inputString = List.of(InputReportType.PRODUCT_REVIEW);
        assertIterableEquals(List.of("PRODUCT_REVIEW"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Business Style")
    public void case6_1() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.PRODUCT_REVIEW);
        assertIterableEquals(List.of("PRODUCT_REVIEW"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Review Report + Essay Style")
    public void case7() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.PRODUCT_REVIEW_BLOG);
        assertIterableEquals(List.of("PRODUCT_REVIEW"), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case8() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INDEPTH);
        assertIterableEquals(List.of(ReportType.INDEPTH.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Business Style")
    public void case9() {
        List<InputReportType> inputString = List.of(InputReportType.INDEPTH);
        assertIterableEquals(List.of(ReportType.INDEPTH.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Indepth Report + Essay Style")
    public void case10() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.INDEPTH_BLOG);
        assertIterableEquals(List.of(ReportType.INDEPTH.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style [as payload]")
    public void case11() {
        List<InputReportType> inputString = List.of(InputReportType.JOURNAL_NOTE_BLOG);
        assertIterableEquals(List.of(ReportType.JOURNAL_NOTE.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Business Style")
    public void case12() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.JOURNAL_NOTE_BLOG);
        assertIterableEquals(List.of(ReportType.JOURNAL_NOTE.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Journalist Note + Essay Style")
    public void case13() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.JOURNAL_NOTE);
        assertIterableEquals(List.of(ReportType.JOURNAL_NOTE.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Blog Style [as payload]")
    public void case14() {
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_BLOG);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Blog Style")
    public void case15() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_BLOG);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Facebook Style [as payload]")
    public void case16() {
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_FACEBOOK);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Facebook Style")
    public void case17() {
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_FACEBOOK);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + X Style [as payload]")
    public void case18() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_X);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + X Style")
    public void case19() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_X);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Youtube Style [as payload]")
    public void case20() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.SOCIAL_MEDIA_YOUTUBE);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Social Media Posting + Youtube Style")
    public void case21() {
        // return result fast
        List<InputReportType> inputString = List.of(InputReportType.REPORT, InputReportType.SOCIAL_MEDIA_YOUTUBE);
        assertIterableEquals(List.of(ReportType.SOCIAL_MEDIA.name()), MapToValueUtil.mapValueToString(inputString));
    }

    @Test
    @DisplayName("Report + Social media + Journal note")
    public void case22() {
        List<InputReportType> inputString = List.of(
                InputReportType.DAILY,
                InputReportType.SOCIAL_MEDIA_YOUTUBE, InputReportType.JOURNAL_NOTE
        );
        assertIterableEquals(
                List.of(ReportType.DAILY.name(), ReportType.SOCIAL_MEDIA.name(), ReportType.JOURNAL_NOTE.name()),
                MapToValueUtil.mapValueToString(inputString));
    }
}