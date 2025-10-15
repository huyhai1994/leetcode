package length_of_last_word;


public class Solution {
    public int lengthOfLastWord(String s) {
        String[] list = s.trim().split(" ");
        return list[list.length - 1].length();
    }
}
