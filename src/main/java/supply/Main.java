package supply;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> result = () ->  "result";
        System.out.println(result.get());
    }

}
