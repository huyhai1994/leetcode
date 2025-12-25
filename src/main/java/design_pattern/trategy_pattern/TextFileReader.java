package design_pattern.trategy_pattern;

public class TextFileReader implements FileReaderStrategy {

    @Override
    public String read(String path) {
        return "simple read txt file content";
    }
}
