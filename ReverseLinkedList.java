class Solution {
    public ListNode reverseList(ListNode head) {
        
        
        ListNode random=null;
        while(head!=null)
        {
            ListNode n=head.next;
            head.next=random;
            random=head;
            head=n;
        }
        return random;
    }
}
