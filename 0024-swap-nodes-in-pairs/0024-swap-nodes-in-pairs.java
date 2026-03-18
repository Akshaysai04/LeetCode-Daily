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
    public ListNode swapPairs(ListNode head) {
        ListNode a=new ListNode(-1);
        ListNode k=a;
        Stack<ListNode> b=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
                int c=0;
                while(temp!=null && c<2){
                    b.push(temp);
                    temp=temp.next;
                    c++;
                }
                if(c==2)
                { 
                    while(!b.isEmpty()){
                    k.next=b.pop();
                    k=k.next;
                }
                }else
                {
                    k.next=b.pop();
                    k=k.next;
                }
        }
        k.next=null;
        return a.next;
    
    }
}