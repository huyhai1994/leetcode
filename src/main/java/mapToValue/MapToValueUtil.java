package mapToValue;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapToValueUtil {
    private static final Map<InputReportType, ReportType> KEYWORD_TO_TYPE = Map.ofEntries(
            Map.entry(InputReportType.DAILY, ReportType.DAILY),
            Map.entry(InputReportType.DAILY_BLOG, ReportType.DAILY),
            Map.entry(InputReportType.INVESTMENT, ReportType.INVESTMENT),
            Map.entry(InputReportType.INVESTMENT_BLOG, ReportType.INVESTMENT),
            Map.entry(InputReportType.PRODUCT_REVIEW, ReportType.PRODUCT_REVIEW),
            Map.entry(InputReportType.PRODUCT_REVIEW_BLOG, ReportType.PRODUCT_REVIEW),
            Map.entry(InputReportType.INDEPTH, ReportType.INDEPTH),
            Map.entry(InputReportType.INDEPTH_DAILY, ReportType.INDEPTH),
            Map.entry(InputReportType.INDEPTH_BLOG, ReportType.INDEPTH),
            Map.entry(InputReportType.JOURNAL_NOTE_BLOG, ReportType.JOURNAL_NOTE),
            Map.entry(InputReportType.JOURNAL_NOTE, ReportType.JOURNAL_NOTE),
            Map.entry(InputReportType.SOCIAL_MEDIA_BLOG, ReportType.SOCIAL_MEDIA),
            Map.entry(InputReportType.SOCIAL_MEDIA_FACEBOOK, ReportType.SOCIAL_MEDIA),
            Map.entry(InputReportType.SOCIAL_MEDIA_X, ReportType.SOCIAL_MEDIA),
            Map.entry(InputReportType.SOCIAL_MEDIA_YOUTUBE, ReportType.SOCIAL_MEDIA)
    );

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
