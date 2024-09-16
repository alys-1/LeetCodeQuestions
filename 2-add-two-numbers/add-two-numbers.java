class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dh = new ListNode(0); // dummy head
        ListNode tail = dh;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0; // if l1 is null, use 0
            int digit2 = (l2 != null) ? l2.val : 0; // if l2 is null, use 0

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            if (l1 != null) l1 = l1.next; // move to the next node in l1
            if (l2 != null) l2 = l2.next; // move to the next node in l2
        }
        
        return dh.next; // return the next node after the dummy head
    }
}
