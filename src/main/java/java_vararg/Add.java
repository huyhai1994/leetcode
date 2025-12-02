package java_vararg;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Add {
    public void add(int... array) throws Exception {
        if (array.length == 0) {
            System.out.println("0=0");
            return;
        }
        int sum = Arrays.stream(array).sum();
        String expression = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("+"));
        System.out.println(expression + "=" + sum);
    }
}
