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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){return null;}
        
        ListNode d=new ListNode();
        ListNode c=d;
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        while(l1!=null || l2!=null)
        {
            if(l1==null)
            {
                d.next=l2;
                d=d.next;
                l2=l2.next;
            }
           else if(l2==null)
            {
                d.next=l1;
                d=d.next;
                l1=l1.next;
                
            }
            else if(l1.val<l2.val)
            {
                d.next=l1;l1=l1.next;d=d.next;
                
                
            }
            else
            {
                d.next=l2;l2=l2.next;d=d.next;
            }
            
                
        }
         return c.next;
        
        
    }
}
