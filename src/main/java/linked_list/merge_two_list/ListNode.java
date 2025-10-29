package linked_list.merge_two_list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }
}
