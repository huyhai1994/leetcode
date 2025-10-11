package mapToValue;

import java.util.List;
import java.util.Map;

public class MapToValueUtil {
    private static final Map<String, ReportType> KEYWORD_TO_TYPE = Map.of(
            "DAILY", ReportType.DAILY,
            "DAILY_BLOG", ReportType.DAILY,
            "INVESTMENT", ReportType.INVESTMENT,
            "INVESTMENT_BLOG", ReportType.INVESTMENT,
            "PRODUCT_REVIEW", ReportType.PRODUCT_REVIEW,
            "PRODUCT_REVIEW_BLOG", ReportType.PRODUCT_REVIEW,
            "INDEPTH", ReportType.INDEPTH,
            "INDEPTH_BLOG", ReportType.INDEPTH
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
        return "DAILY";
    }

}
