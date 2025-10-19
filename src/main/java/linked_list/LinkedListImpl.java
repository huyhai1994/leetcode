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

    public void deleteIndex(int index) {
        if (index < 0 || index >= size || head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
            size--;
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
        if (toDelete == tail) {
            tail = prev;
        }
        size--;
    }

    public void addAtIndex(int index, int value) {
        /*@TODO:
        case 1: index < 0 -> insert at head;
        case 2: index == size -> insert at tail;
        case 3: index > size -> ignore;
        otherwise: insert in middle;
        * */
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
