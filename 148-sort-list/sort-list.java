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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            List<Integer> l = new ArrayList<>();
            ListNode current = head;
            while(current != null){
                l.add(current.val);
                current = current.next;
            }

            Collections.sort(l);

             current = head;
            for(int val : l){
                current.val = val;
                current = current.next;
            }

            return head;
        }
    }
}