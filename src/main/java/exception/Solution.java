package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x, y;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException | InputMismatchException ex) {
            System.out.println(ex.getClass().getName()+": / by zero");
        }
    }

}
