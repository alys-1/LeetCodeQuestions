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
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        // Add elements from the first list to the array
        while(temp1 != null){
            l.add(temp1.val);
            temp1 = temp1.next;
        }
        
        // Add elements from the second list to the array
        while(temp2 != null){
            l.add(temp2.val);
            temp2 = temp2.next;
        }
        
        // Sort the array
        Collections.sort(l);
        
        // If the array is empty, return null
        if (l.isEmpty()) return null;

        // Create a new linked list from the sorted values
        ListNode dummy = new ListNode(0); // dummy node to handle the head easily
        ListNode current = dummy;
        
        for (int val : l) {
            current.next = new ListNode(val); // create new node with the sorted value
            current = current.next; // move to the next node
        }
        
        return dummy.next; // return the head of the new sorted linked list
    }
}
