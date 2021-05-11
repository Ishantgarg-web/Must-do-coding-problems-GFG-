class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         if(head.next==null)
         {
             return head.data;
         }
         else
         {
             Node slow=head,fast=head;
             while(fast!=null && fast.next!=null)
             {
                 slow=slow.next;
                 fast=fast.next.next;
             }
             return slow.data;
         }
    }
}
