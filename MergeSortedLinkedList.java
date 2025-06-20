    /* 
    Problem: Leetcode 21; Difficulty Easy
    Time-complexity: O(n+m)
    Space-complexity: O(1) 
    */ 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ans = new ListNode();
        ListNode tail = ans;
        
        while (list1 != null && list2 != null) {
            if(list1.val == list2.val) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            } 
        }

        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }
        return ans.next;
    }
}
    /* 
    Can it be better?
    No, this is the optimal approach
    */