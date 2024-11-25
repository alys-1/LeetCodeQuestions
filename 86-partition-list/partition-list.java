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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode lesser = less;
        ListNode bigger = more;

        ListNode temp = head;
        while(temp != null){
            if(temp.val >= x){
                //add in more
                ListNode a = new ListNode(temp.val);
                bigger.next = a;
                bigger = bigger.next;
                temp = temp.next;

            }else{
                //add in less
                ListNode b = new ListNode(temp.val);
                lesser.next = b;
                lesser = lesser.next;
                temp = temp.next;
            }

        }
        lesser.next = more.next;
        return less.next;

    }
}