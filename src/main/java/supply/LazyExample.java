package supply;

import java.util.function.Supplier;

public class LazyExample {
    public static String processData(Supplier<String> dataSupplier) {
        String data = dataSupplier.get();
        return "Processed " + data;
    }
}
