package generic.hashset;

import java.util.HashSet;
import java.util.Set;

public class UnionTest {
    public static <E> Set<E> unionAll(Set<E> A, Set<E> B) {
        Set<E> result = new HashSet<>(A);
        result.addAll(B);
        return result;
    }
}
