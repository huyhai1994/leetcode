package comparator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.testng.AssertJUnit.assertEquals;

class Main {

    private static List<Integer> getNumbers() {
        return Arrays.asList(5, 2, 4, 3, 6, 7);
    }

    @Test
    @DisplayName("Collections.sort()")
    void sortAscendingOrderUsingCollectionsSort() {
        List<Integer> numbers = getNumbers();
        Collections.sort(numbers);
        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 6, 7);
        IntStream.range(0, numbers.size())
                .forEach(i -> assertEquals(expected.get(i), numbers.get(i)));
    }

    @Test
    @DisplayName("list.sort(Collections.reverseOrder()")
    void sortDescendingOrderUsingCollectionsSort() {
        List<Integer> numbers = getNumbers();
        numbers.sort(Collections.reverseOrder());
        List<Integer> expected = Arrays.asList(7, 6, 5, 4, 3, 2);

        IntStream.range(0, numbers.size())
                .forEach(i -> assertEquals(expected.get(i), numbers.get(i)));
    }

    @Test
    void sortListOfStringInAlphabetOrder() {

        List<String> words = getWords();
        Collections.sort(words);

        List<String> expected = Arrays.asList("a", "b", "c", "d");

        IntStream.range(0, words.size())
                .forEach(i -> assertEquals(expected.get(i), words.get(i)));

    }

    private static List<String> getWords() {
        return Arrays.asList("b", "a", "d", "c");
    }

    @Test
    void sortListOfStringInReverseAlphabetOrder() {

        List<String> words = getWords();
        words.sort(Collections.reverseOrder());

        List<String> expected = Arrays.asList("d", "c", "b", "a");

        IntStream.range(0, words.size())
                .forEach(i -> assertEquals(expected.get(i), words.get(i)));
    }

    @Test
    void sortStudentsByAgeInAscendingOrder() {
        List<Student> students = getStudents();

        List<Student> expected = Arrays.asList(
                Student.builder()
                        .age(18)
                        .name("B")
                        .score(80)
                        .build(),
                Student.builder()
                        .age(19)
                        .name("A")
                        .score(100)
                        .build(),
                Student.builder()
                        .age(20)
                        .name("C")
                        .score(70)
                        .build()
        );
        students.sort(Comparator.comparingInt(Student::getAge));
        assertIterableEquals(expected, students);
    }

    @Test
    void sortStudentsByAgeInDescendingOrder() {
        List<Student> students = getStudents();

        List<Student> expected = Arrays.asList(
                Student.builder()
                        .age(20)
                        .name("C")
                        .score(70)
                        .build(),
                Student.builder()
                        .age(19)
                        .name("A")
                        .score(100)
                        .build(),
                Student.builder()
                        .age(18)
                        .name("B")
                        .score(80)
                        .build()
        );
        students.sort(Comparator.comparingInt(Student::getAge).reversed());
        assertIterableEquals(expected, students);
    }

    private static List<Student> getStudents() {
        return Arrays.asList(
                Student.builder()
                        .age(19)
                        .name("A")
                        .score(100)
                        .build(),
                Student.builder()
                        .age(18)
                        .name("B")
                        .score(80)
                        .build(),
                Student.builder()
                        .age(20)
                        .name("C")
                        .score(70)
                        .build()
        );
    }


}
