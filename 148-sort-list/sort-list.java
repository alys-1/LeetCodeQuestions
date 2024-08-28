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
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Convert the linked list to an ArrayList
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        // Step 2: Sort the ArrayList
        Collections.sort(list);

        // Step 3: Rebuild the linked list with the sorted values
        current = head;
        for (int val : list) {
            current.val = val;
            current = current.next;
        }

        return head;
    }
}