package enhanced_for_loop;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
        // print all value in list using enhanced for loop
        for (int i : listInt) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // tradition way
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print(listInt.get(i) + " ");
        }
    }
}
