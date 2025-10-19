package linked_list;

/*https://leetcode.com/problems/design-linked-list/*/
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
        linkedList.addAtHead(4);
        linkedList.addAtHead(5);
        linkedList.addAtHead(6);
        linkedList.addAtTail(7);
        linkedList.addAtTail(8);
        linkedList.addAtTail(9);
        linkedList.addAtTail(10);
        System.out.println(linkedList.printAllNodes().toCharArray());
    }


    public String printAllNodes() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append(" -> null");
        return String.valueOf(sb);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
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

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }


    @Override
    public String toString() {
        return "LinkedListImpl{" + "head=" + head + ", tail=" + tail + ", size=" + size + '}';
    }
}
