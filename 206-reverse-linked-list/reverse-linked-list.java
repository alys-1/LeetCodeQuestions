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
        ArrayList<Integer> a = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            a.add(curr.val);
            curr = curr.next;

        }
        Collections.reverse(a);
        ListNode head1 = new ListNode(0);
        ListNode curr1= head1; 

        for(int i = 0; i< a.size(); i++){
          ListNode cur = new ListNode(a.get(i));
            curr1.next = cur;
            curr1 = curr1.next;
        }
        return head1.next;

    }
}