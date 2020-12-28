class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode temp= new ListNode(0);
        ListNode curr=temp;
        int carry=0;
        while(p!=null || q!=null)
        {
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int z=x+y+carry;
            carry=z/10;
            curr.next= new ListNode(z%10);
            curr=curr.next;
            if(p!=null){p=p.next;}
            if(q!=null){q=q.next;}
        }
        if(carry>0)
        {
            curr.next=new ListNode(carry);
        }
        return temp.next;
        
    }
}
