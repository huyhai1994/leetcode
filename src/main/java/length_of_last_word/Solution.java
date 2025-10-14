package length_of_last_word;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] list = s.trim().split(" ");
        return list[list.length - 1].length();
    }
}
