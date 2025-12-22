package trategy_pattern;

public class JsonFileReader implements FileReaderStrategy {
    @Override
    public String read(String path) {
        return "Read Json File content";
    }
}
