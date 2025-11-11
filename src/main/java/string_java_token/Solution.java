package string_java_token;

public class Solution {
    public static void main(String[] args) {
        String input = "He is a very very goodboy, isn't he?";
        Solution solution = new Solution();
        char[] newChars = solution.processStringToken(input.toCharArray());
        String result = solution.createResult(newChars);
        System.out.println(result);
    }

    private String createResult(char[] newChars) {
        String cleaned = new String(newChars).trim();

        String[] tokens = cleaned.isEmpty() ? new String[0] : cleaned.split("\\s+");

        StringBuilder sb = new StringBuilder();
        sb.append(tokens.length).append("\n");
        for (String token : tokens) {
            sb.append(token).append("\n");
        }

        return sb.toString();
    }

    public char[] processStringToken(char[] inputCharList) {
        char[] newCharList = new char[inputCharList.length];
        int i = 0;

        for (char c : inputCharList) {
            if (!Character.isLetter(c)) {
                c = ' ';
            }
            newCharList[i++] = c;
        }

        char[] filled = new char[i];
        System.arraycopy(newCharList, 0, filled, 0, i);
        return filled;
    }
}
