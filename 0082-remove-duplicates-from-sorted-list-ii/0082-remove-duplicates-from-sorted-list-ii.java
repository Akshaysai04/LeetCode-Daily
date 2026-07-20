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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode ans=new ListNode(0);
       ans.next=head;
       ListNode dd=ans;
       while(dd!=null && dd.next!=null)
       {
        ListNode next=safe(dd.next);
        dd.next=next;
        if(next==null || next.next==null) break;
        if(next.val!=next.next.val){ dd=dd.next; }
       }
    
    return ans.next;
}
    public ListNode safe(ListNode node)
    {
        int val=node.val;
        if(node.next==null || node.val!=node.next.val)
        {
            return node;
        }
        while(node!=null && node.val==val)
        {
            node=node.next;
        }
        return node;
    }
}