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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ans = new ListNode();
        while (list1.next != null && list2.next != null) {
            System.out.println(list1.val + " + " + list2.val);
            if(list1.val == list2.val) {
                ans = list1;
                ans.next = list2;
            }
            else if (list1.val < list2.val) {
                ans = list1;
                ans.next = list2;
            } else if (list1.val > list2.val) {
                ans = list2;
                ans.next = list1;
            } 
            list1 = list1.next;
            list2 = list2.next;
        }
        return ans;
    }
}