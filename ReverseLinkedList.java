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
        var arr = new ArrayList<Integer>();
        ListNode ans = null;
        ListNode tail = null;
        while(head != null) {
            arr.add(head.val);
            head = head.next;
        }
        Collections.reverse(arr);
 for (int val : arr) {
            ListNode current = new ListNode(val);
            if (ans == null) {
                ans = current;      // first node is the head
                tail = current;     // tail starts at head
            } else {
                tail.next = current; // link new node
                tail = current;      // move tail forward
            }
        }
        System.out.println(arr);
        return ans;
    }
}