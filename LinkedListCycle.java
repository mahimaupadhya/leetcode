public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){return false;}
        ListNode p=head;
        ListNode q= head;
        while(q!=null && q.next!=null)
        {
            p=p.next;
            q=q.next.next;
            if(p==q){return true;}
        }
        
        return false;
        
    }
}
