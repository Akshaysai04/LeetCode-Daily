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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

         ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        // Merge the two lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Link to the smaller node
                list1 = list1.next;   // Move to the next node in list1
            } else {
                current.next = list2; // Link to the smaller node
                list2 = list2.next;   // Move to the next node in list2
            }
            current = current.next; // Move the current pointer
        }
        // If there are remaining nodes in either list, link them
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }
        // Return the merged list, which starts from the next of the dummy node
        return dummy.next;
    }
}