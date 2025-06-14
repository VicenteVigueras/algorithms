    /* 
    Problem: Leetcode 260; Difficulty Easy
    Time-complexity: O(n)
    Space-complexity: O(n) 
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
class ReverseLinkedList {
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
                ans = current;      
                tail = current;     
            } else {
                tail.next = current; 
                tail = current;     
            }
        }
        System.out.println(arr);
        return ans;
    }
}

    /* 
    Can it be better? 
    Space can be improved to O(1) when doing in-place reverse, 
    No extra storage would be needed. 
    */