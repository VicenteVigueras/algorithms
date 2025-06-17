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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var slowCount = 0;
        var fast = head;
        var slow = head;
        var start = slow;
        for (int i = 0; i < n; i++) {
            fast = fast.next;

        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            slowCount++;
            System.out.println("slow: " + slow.val);
            fast = fast.next;
            System.out.println("fast: " + fast.val);
        }
        if (slowCount == 0) {
            head = null;
            return head;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
            System.out.println("hey");
        }

        return start;
    }

}