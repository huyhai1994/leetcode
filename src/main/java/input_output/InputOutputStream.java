package input_output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputOutputStream {
    public static void main(String[] args) {
        byte[] bWrite = {11, 21, 3, 40, 5};
        Path path = Paths.get("test.txt");
        try (OutputStream os = Files.newOutputStream(path)) {
            for (byte b : bWrite) {
                os.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (InputStream is = Files.newInputStream(path)) {
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + "");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
