package mapToValue;

import java.util.List;

public class MapToValueUtil {

    public static String mapValueToString(List<String> inputString) {
        if (inputString.contains("")) return "";
        if (inputString.contains("DAILY") || inputString.contains("DAILY_BLOG")) return ReportType.DAILY.name();
        if (inputString.contains("INVESTMENT") || inputString.contains("INVESTMENT_BLOG"))
            return ReportType.INVESTMENT.name();
        return "DAILY";
    }


}
