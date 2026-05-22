package fileio.inputoutputstream;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class ReadFileInputStream {
    private static final long LARGE_FILE_SIZE = 10485760;


    public static void main(String[] args) {

        Path path = Paths.get("sample3.txt");
        readFileContent(path);
    }

    private static void readFileContent(Path path) {
        long fileSize;
        try {
            fileSize = Files.size(path);
        } catch (IOException e) {
            return;
        }

        if (fileSize > LARGE_FILE_SIZE) return;
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
            while (true) {
                if (isEndOfFile(br)) break;
            }

        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    private static boolean isEndOfFile(BufferedReader br) {
        String line = "";
        try {
            if ((line = br.readLine()) == null) return true;
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        log.info("line = {} ", line);
        return false;
    }
}

