package fileio.inputoutputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileInputStreamTest {

    @Test
    void should_leak_file_descriptors_when_streams_are_not_closed() {
       while(true){
           try {
               FileInputStream file = new FileInputStream("sample3.txt");
           } catch (FileNotFoundException e) {
               throw new RuntimeException(e);
           }
       }
    }

}