class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        
        for (int i = 0; i <= k; i++) {
            if (fast == null) return null; 
            fast = fast.next;
        }

       
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

       
        slow.next = slow.next.next;

        return dummy.next; 
    }
}
