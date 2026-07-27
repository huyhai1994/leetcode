package is_anagram;

public class Main {
    public static boolean isAnagram(String s, String t) {


        if (s.length() != t.length()) return false;

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int index = s.indexOf(ch);
            if (index < 0) return false;
            s = s.substring(0, index) + s.substring(index + 1);
        }

        return true;

    }
}
