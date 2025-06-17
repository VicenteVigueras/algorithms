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
class RemoveNthFromLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 1;
        var start = head;
        var ans = start;
        while(head.next != null && head != null) {
            i++;
            head = head.next;
        }
        if(i == 1 && n == 1) {
            head = null;
            return head;
        }
        if(i == 1) {
            System.out.println("hello");
            return head;
        }


        int position = i - n;
        int j = 1;
        while(start != null && start.next != null) {
            if(j == position) {
                start.next = start.next.next;
            }
            start = start.next;
            j++;
        }
        return ans;
    }
}