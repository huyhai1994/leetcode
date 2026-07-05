package temp_dir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.testng.AssertJUnit.assertTrue;

public class TempDirTest {
    @TempDir
    Path tempDir;

    @Test
    void testUsingTempDir() throws IOException {
        File tempFile = new File(tempDir.toFile(), "example.txt");
        assertTrue(tempFile.createNewFile());
    }
}
