package text_processing;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoiningMultipleArrayItemsToOneString {
    public static String joinItemsToOneString(String[] input) {
        return Arrays.stream(input)
                .map(keyword -> "\"" + keyword + "\"")
                .collect(Collectors.joining(" AND "));
    }
}
