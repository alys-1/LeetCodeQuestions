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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode temp2 = head.next;
        while(temp2 != null){
            int gcdn = gcd(temp.val, temp2.val);
            ListNode newNode = new ListNode(gcdn);
            temp.next = newNode;
            newNode.next = temp2;
            temp=temp2;
            temp2 = temp2.next;

        }
        return head;

    }
    int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

}