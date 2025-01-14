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
        ListNode tempp = head;
        ListNode temppp = head;
        ListNode temp = null;
        while(tempp != null){
            temppp = temppp.next;
            tempp.next = temp;
            temp = tempp;
            tempp = temppp;
        }
        return temp;
    }
}