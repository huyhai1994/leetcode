package generic.back_to_generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericMethod {
    public static <T> void addToSet(Set<T> s, T t) {
        s.add(t);
    }

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "a"));
        addToSet(stringSet, "d");
        stringSet.forEach(System.out::println);
        Set<Number> numberSet = new HashSet<>(Arrays.asList(1, 2, 3));
        addToSet(numberSet, 4);
        numberSet.forEach(System.out::println);


    }
}
