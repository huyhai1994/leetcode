package linked_list;

class LinkedListImplTest {
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addAtHead(1);
        linkedList.addAtHead(2);
        linkedList.addAtHead(3);
        linkedList.addAtHead(4);
        linkedList.addAtHead(5);
        linkedList.addAtHead(6);
        linkedList.addAtTail(7);
        linkedList.addAtTail(8);
        linkedList.addAtTail(9);
        linkedList.addAtTail(10);
        System.out.println(linkedList.printAllNodes().toCharArray());
        linkedList.deleteIndex(9);
        System.out.println(linkedList.printAllNodes().toCharArray());
    }
}