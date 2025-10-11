package mapToValue;

import java.util.List;
import java.util.Map;

public class MapToValueUtil {
    private static final Map<String, ReportType> KEYWORD_TO_TYPE = Map.ofEntries(
            Map.entry("DAILY", ReportType.DAILY),
            Map.entry("DAILY_BLOG", ReportType.DAILY),
            Map.entry("INVESTMENT", ReportType.INVESTMENT),
            Map.entry("INVESTMENT_BLOG", ReportType.INVESTMENT),
            Map.entry("PRODUCT_REVIEW", ReportType.PRODUCT_REVIEW),
            Map.entry("PRODUCT_REVIEW_BLOG", ReportType.PRODUCT_REVIEW),
            Map.entry("INDEPTH", ReportType.INDEPTH),
            Map.entry("INDEPTH_DAILY", ReportType.INDEPTH),
            Map.entry("INDEPTH_BLOG", ReportType.INDEPTH),
            Map.entry("JOURNAL_NOTE_BLOG", ReportType.JOURNAL_NOTE),
            Map.entry("JOURNAL_NOTE", ReportType.JOURNAL_NOTE),
            Map.entry("SOCIAL_MEDIA_BLOG", ReportType.SOCIAL_MEDIA),
            Map.entry("SOCIAL_MEDIA_FACEBOOK", ReportType.SOCIAL_MEDIA),
            Map.entry("SOCIAL_MEDIA_X", ReportType.SOCIAL_MEDIA)
    );

    public static String mapValueToString(List<String> inputString) {
        for (String s : inputString) {
            if (s.isEmpty()) {
                return "";
            }
            ReportType type = KEYWORD_TO_TYPE.get(s);
            if (type != null) {
                return type.name();
            }
        }
        return "";
    }

}
