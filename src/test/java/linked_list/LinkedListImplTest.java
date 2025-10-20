package linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListImplTest {
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addAtIndex(0, 1);
        linkedList.addAtIndex(1, 2);
        linkedList.addAtIndex(2, 3);
        linkedList.addAtIndex(3, 5);
        linkedList.addAtIndex(4, 6);
        linkedList.addAtIndex(5, 7);
        linkedList.addAtIndex(6, 8);
        linkedList.addAtIndex(3, 4);

        System.out.println(linkedList.printAllNodes());
    }

    @Test
    void caseExceedSize() {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addAtIndex(0, 1);
        assertThrows(RuntimeException.class, () -> linkedList.addAtIndex(10, 2));
    }
}