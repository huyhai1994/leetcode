package trategy_pattern;

public class Solution {
    public static void main(String[] args) {
        FileReaderStrategy strategy = FileReaderFactory.getReader("json");
        FileReaderContext context = new FileReaderContext(strategy);
        System.out.println(context.readFile("data.json"));
    }
}
