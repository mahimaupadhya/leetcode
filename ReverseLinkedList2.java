class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)
        {
            return head;
        }
      
        ListNode curr=head;
        ListNode prev= null;
        while(m>1)
        {
            prev=curr;
            curr=curr.next;
            m--;n--;
        }
        ListNode tail=curr;
        ListNode con=prev;
        while(n>0)
        {
            ListNode k=curr.next;
            curr.next=prev;
            prev=curr;
            curr=k;
            n--;
        }
        if(con!=null)
        {
            con.next=prev;
        }
        else
        {
            head=prev;
        }
        
        tail.next=curr;
        return head;     
    }
}
