package number_to_binary;

public class Solution {
    private static int counter = 1;

    public Solution() {
        System.out.println("initialized " + counter++);
    }


    public String numberToBinary(int number) {
        if (number == 1) return "1";
        StringBuilder sb = new StringBuilder();
        int divider = number % 2;
        number = number / 2;
        sb.append(number);
        sb.append(divider);
        return sb.toString();
    }
}
