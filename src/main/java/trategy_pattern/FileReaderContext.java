package trategy_pattern;

public class FileReaderContext {
    private FileReaderStrategy strategy;

    public FileReaderContext(FileReaderStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FileReaderStrategy strategy) {
        this.strategy = strategy;
    }

    public String readFile(String path) {
        if (strategy == null) {
            throw new IllegalStateException("FileReaderStrategy is not set");
        }
        return strategy.read(path);
    }
}
