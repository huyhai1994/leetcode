package trategy_pattern;

public class FileReaderFactory {
    public static FileReaderStrategy getReader(String type) {
        switch (type) {
            case "txt":
                return new TextFileReader();
            case "csv":
                return new CsvFileReader();
            case "json":
                return new JsonFileReader();
            default:
                throw new RuntimeException("something went wrong");
        }
    }
}
