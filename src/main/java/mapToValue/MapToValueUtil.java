package mapToValue;

import java.util.*;
import java.util.stream.Collectors;

public class MapToValueUtil {
    private static final Map<InputReportType, ReportType> KEYWORD_TO_TYPE;

    static {
        Map<InputReportType, ReportType> tempMap = new HashMap<>();
        tempMap.put(InputReportType.DAILY, ReportType.DAILY);
        tempMap.put(InputReportType.DAILY_BLOG, ReportType.DAILY);
        KEYWORD_TO_TYPE = Collections.unmodifiableMap(tempMap);
    }

    public static List<String> mapValueToString(List<InputReportType> inputString) {
        List<String> mediaList;
        mediaList =
                inputString.stream()
                        .map(KEYWORD_TO_TYPE::get)
                        .filter(Objects::nonNull)
                        .map(ReportType::name)
                        .collect(Collectors.toList());
        return mediaList;
    }

}
