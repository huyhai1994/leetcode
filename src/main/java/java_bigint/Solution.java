package java_bigint;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static String additionAndMultiplyTwoNumber(BigInteger a, BigInteger b) {
        BigInteger addition = a.add(b);
        BigInteger multiply = a.multiply(b);
        return addition + "\n" + multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(Solution.additionAndMultiplyTwoNumber(a, b));
    }
}
