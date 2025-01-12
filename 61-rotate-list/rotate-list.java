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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head; 

        LinkedList<Integer> ll = new LinkedList<>();
        ListNode temp = head;
        while (temp != null) {
            ll.add(temp.val);
            temp = temp.next;
        }

       
        int n = ll.size();
        k = k % n;
        if (k == 0) return head; 

        for (int i = 0; i < k; i++) {
            int last = ll.removeLast(); 
            ll.addFirst(last);         
        }


        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        for (int value : ll) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}
