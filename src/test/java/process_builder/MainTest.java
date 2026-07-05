package process_builder;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    void process_read_java_version_should_not_empty() throws IOException, InterruptedException {
        Process process = new ProcessBuilder("java", "--version").start();
        List<String> results = Main.readOutput(process.getInputStream());
        assertNotEquals(0, results.size(), "List should not be empty");
        int exitCode = process.waitFor();
        assertEquals(0, exitCode, "No error should be detected");
    }

    @Test
    void error_when_sync_mount() throws IOException, InterruptedException {
        Process process = new ProcessBuilder("rclone", "mount", "onedrive:", "~/Onedrive", "--vfs-cache-mode", "writes").start();
        int exitCode = process.waitFor();
        assertEquals(1, exitCode);
        List<String> results = Main.readOutput(process.getErrorStream());
        assertEquals(1, results.size(), "List should not be empty");
    }

    @Test
    void sync_backend_valve_to_cloud_success() throws IOException, InterruptedException {
        String keyHome = "user.home";
        Path sourcePath = Paths.get(System.getProperty(keyHome), "workspace", "backend-design");
        Path targetPath = Paths.get(System.getProperty(keyHome), "OneDrive", "workspace", "backend-design");

        List<String> command = new ArrayList<>();
        command.add("rsync");
        command.add("-avh");
        command.add("--delete");
        command.add("--delete-after");
        command.add("--progress");

        command.add("--exclude");
        command.add(".idea/");

        command.add("--exclude");
        command.add("node_modules/");

        command.add("--exclude");
        command.add("target/");

        command.add("--exclude");
        command.add("build/");

        command.add("--exclude");
        command.add(".gradle/");

        command.add("--exclude");
        command.add(".DS_Store");

        command.add(sourcePath.toString());
        command.add(targetPath.toString());

        Process process = new ProcessBuilder(command).start();
        int exitCode = process.waitFor();

        List<String> errors = Main.readOutput(process.getErrorStream());
        List<String> output = Main.readOutput(process.getInputStream());
        errors.forEach(System.out::println);
        output.forEach(System.out::println);
    }

}