class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        var slow = head;
        var fast = head.next;
        
        while(slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
       return true;
    }
}