package end_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newLine;
        int numberOfLine = 0;
        try {
            while (true) {
                newLine = sc.nextLine();
                numberOfLine++;
                System.out.println(numberOfLine + " " + newLine);
                if (newLine.contains("end-of-file")) break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
