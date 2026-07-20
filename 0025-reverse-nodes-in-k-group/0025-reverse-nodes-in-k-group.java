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
    public ListNode reverseKGroup(ListNode head, int k) {
     if(!hasknode(head,k)) return head;
     ListNode prev=null;
     ListNode curr=head;
     ListNode next;
     int count=0;
     while(curr!=null && count<k)
     {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        count++;
     }
     head.next=reverseKGroup(curr,k);
     return prev;   
    }
    private boolean hasknode(ListNode node,int k)
    {
        int count=0;
        while(node!=null && count<k)
        {
            node=node.next;
            count++;
        }
        return count==k;
    }
}