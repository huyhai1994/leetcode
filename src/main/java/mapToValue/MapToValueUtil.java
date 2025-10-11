package mapToValue;

import java.util.List;

public class MapToValueUtil {

    public static String mapValueToString(List<String> inputString) {
        if (inputString.contains("")) return "";
        if (inputString.contains("DAILY")) return "DAILY";
        return "REPORT";
    }


}
