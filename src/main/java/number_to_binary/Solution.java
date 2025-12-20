package number_to_binary;

public class Solution {
    private static int counter = 0;

    public Solution() {
        System.out.println("initialized " + counter++);
    }


    public String numberToBinary(int number) {
        if (number == 1) return "1";
        int divider = number % 2;
        number = number / 2;
        return number + String.valueOf(divider);
    }
}
