package input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//        String originalText = "Hello Hải 👋";
//        byte[] data = originalText.getBytes(StandardCharsets.UTF_8);
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
//
//        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//        int nRead;
//        byte[] tempBuffer = new byte[1024];
//        while ((nRead = inputStream.read(tempBuffer, 0, tempBuffer.length)) != -1) {
//            buffer.write(tempBuffer, 0, nRead);
//        }
//        byte[] readBytes = buffer.toByteArray();
//
//        String result = new String(readBytes, StandardCharsets.UTF_8);
//
//        System.out.println("Original: " + originalText);
//        System.out.println("From byte[]: " + result);

        byte[] data = { 65, 66, 67, 68, 69 }; // data
        for (byte datum : data) {
            System.out.print((char) datum + "   ");
        }
        int c = 0;
        ByteArrayInputStream bInput = new ByteArrayInputStream(data);
        while ((bInput.read()) != -1) {
            System.out.println(Character.toUpperCase((char) c));
        }

    }
}
