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
class Solution {
    public ListNode reverseList(ListNode head) {
        // 1 2 3 4 5
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        // 5 -> 1 -> 2 -> 3 -> 4 -> null
        // 4 -> 5 -> 1 -> 2 -> 3 -> null
        // 3 -> 4 -> 5 -> 1 -> 2 -> null
        // 2 -> 3 -> 4 -> 5 -> 1 -> null
        // 1 -> 2 -> 3 -> 4 -> 5 -> null

        // 1 -> 02 -> 03 -> 4 -> 5 -> null
        // 1 -> 2 -> 03 -> 4 -> 05 -> null
        // 1 -> 02 -> 3 -> 04 -> 5 -> null
        // 1 -> 2 -> 3 -> 04 -> 05 -> null
        // 01 -> 02 -> 3 -> 4 -> 5 -> null
    }
}