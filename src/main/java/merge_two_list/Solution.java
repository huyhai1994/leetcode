package merge_two_list;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list1.val != 0) {
            return list1;
        }
        if (list2 != null && list2.val != 0) {
            return list2;
        }
        return new ListNode();
    }
}
