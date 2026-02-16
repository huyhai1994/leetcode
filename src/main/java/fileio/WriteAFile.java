package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Foo.txt")) {
            fileWriter.write("Hello!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
