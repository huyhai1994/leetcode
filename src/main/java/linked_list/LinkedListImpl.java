package linked_list;

public class LinkedListImpl {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListImpl() {
        head = null;
        tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addAtHead(1);
        linkedList.addAtHead(2);
        linkedList.addAtHead(3);
        System.out.println(linkedList);
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (size == 0) {
            tail = newNode;
        }
        size++;
    }



    @Override
    public String toString() {
        return "LinkedListImpl{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
