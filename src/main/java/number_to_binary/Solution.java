package number_to_binary;

public class Solution {
    private static int counter = 1;

    public Solution() {
        System.out.println("initialized " + counter++);
    }


    public static String numberToBinary(int number) {
        if (number == 0) return "0"; // Handle 0
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            number = number / 2;
            sb.insert(0, remainder);
        }
        return sb.toString();
    }
}
