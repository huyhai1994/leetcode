package mapToValue;

import java.util.List;

public class MapToValueUtil {

    public static String mapValueToString(List<String> inputString) {
        if (inputString.contains("")) return "";
        if (inputString.contains("DAILY") || inputString.contains("DAILY_BLOG")) return ReportType.DAILY.name();
        if (inputString.contains("INVESTMENT") || inputString.contains("INVESTMENT_BLOG"))
            return ReportType.INVESTMENT.name();
        if (inputString.contains("PRODUCT_REVIEW") || inputString.contains("PRODUCT_REVIEW_BLOG"))
            return ReportType.PRODUCT_REVIEW.name();
        if (inputString.contains("INDEPTH") || inputString.contains("INDEPTH_BLOG"))
            return ReportType.INDEPTH.name();
        return "DAILY";
    }


}
