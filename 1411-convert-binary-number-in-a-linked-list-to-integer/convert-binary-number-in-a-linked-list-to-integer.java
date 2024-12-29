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
    public int getDecimalValue(ListNode head) {
      List<Integer> al = new ArrayList<>();
      ListNode temp = head;
      while(temp != null){
        al.add(temp.val);
        temp = temp.next;
      }
      int p = 0;
      for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == 1) {
                p += (int) Math.pow(2, al.size() - 1 - i);
            }
        }

        return p;
    }
}