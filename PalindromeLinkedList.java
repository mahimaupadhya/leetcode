class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
        {
            return true;
        }
       if(head.next==null)
       {
           return true;
       }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow= slow.next;
            
        }
        fast=head;
        slow=reverse(slow);
        while(slow!=null)
        {
            if(fast.val!=slow.val)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        
      //1->2->3->4
      //1<-2<-3<-4
     // 4->3->2->1
          
        
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode ran=null;
        while( head!=null)
        {
            ListNode b=head.next;
            head.next=ran;
            ran=head;
            head=b;
        }
        return ran;
        
    }
}
