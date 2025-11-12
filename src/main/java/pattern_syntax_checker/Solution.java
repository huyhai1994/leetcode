package pattern_syntax_checker;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static String CheckPattern(String inputString) {
        if (inputString == null) throw new RuntimeException("non null");
        try {
            Pattern.compile(inputString);
        } catch (PatternSyntaxException e) {
            e.printStackTrace();
            return VALIDATION.INVALID.toString();
        }
        return VALIDATION.VALID.toString();
    }
}

