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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        while(head != null){
            l.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = l.size() - 1;
        while (start < end) {
            if (!l.get(start).equals(l.get(end))) {
                return false; 
                }
                start++;
                end--;
            }
        return true;
    }
}