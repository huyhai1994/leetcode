package add_binary;

public class Solution {
    public String addBinary(String a, String b) {
        Integer intA = Integer.parseInt(a, 2);
        Integer intB = Integer.parseInt(b, 2);
        int sum = intA + intB;

        return Integer.toBinaryString(sum);

    }
}
