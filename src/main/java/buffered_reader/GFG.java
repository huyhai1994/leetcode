package buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name = " ";
        try {
            name = reader.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Hello, " + name + "!");

    }
}
