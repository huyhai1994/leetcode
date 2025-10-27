package merge_two_list;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private ListNode list1;
    private ListNode list2;
    private ListNode expectedList;
    private ListNode mergeList;

    @BeforeEach
    void setUp() {
        list1 = new ListNode();
        list2 = new ListNode();
        expectedList = new ListNode();
    }

    @AfterEach
    void tearDown() {
        list1 = null;
        list2 = null;
        expectedList = null;
        mergeList = null;
    }

    @Test
    void twoEmptyList() {
        mergeList = new Solution().mergeTwoLists(list1, list2);
        while (expectedList != null) {
            assertEquals(expectedList.val, mergeList.val);
            mergeList = mergeList.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    void oneEmptyListAndOneListHasZeroValue() {
        list2.val = 0;
        expectedList.val = 0;
        mergeList = new Solution().mergeTwoLists(list1, list2);
        while (expectedList != null) {
            assertEquals(expectedList.val, mergeList.val);
            mergeList = mergeList.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    void oneEmptyListAndOneListHasValueIsOne() {
        list2.val = 1;
        expectedList.val = 1;
        mergeList = new Solution().mergeTwoLists(list1, list2);
        while (expectedList != null) {
            assertEquals(expectedList.val, mergeList.val);
            mergeList = mergeList.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    void list1HasOneNodeList2HasOneNode() {
        list1 = new ListNode(1);
        list2 = new ListNode(2);
        expectedList = new ListNode(1);
        expectedList.next = new ListNode(2);

        mergeList = new Solution().mergeTwoLists(list1, list2);
        while (expectedList != null) {
            assertEquals(expectedList.val, mergeList.val);
            mergeList = mergeList.next;
            expectedList = expectedList.next;
        }
    }
}