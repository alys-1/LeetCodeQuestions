class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head; 

        ListNode newHead = head.next;
        ListNode prev = null, curr = head;

        while (curr != null && curr.next != null) {
            ListNode nextPair = curr.next.next; 
            ListNode second = curr.next;

            
            second.next = curr;
            curr.next = nextPair;

            
            if (prev != null) {
                prev.next = second;
            }

            
            prev = curr;
            curr = nextPair;
        }

        return newHead;
    }
}
