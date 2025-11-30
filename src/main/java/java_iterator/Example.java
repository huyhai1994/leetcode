package java_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
//        List myList = new ArrayList<>();
//        myList.add("Hello");
//        myList.add("Java");
//        myList.add("4");
        List myList = Arrays.asList("Hello", "Java", "4");

        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }


}
