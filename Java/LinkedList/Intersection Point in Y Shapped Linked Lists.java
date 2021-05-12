class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int count1=0,count2=0;
         Node curr1=head1,curr2=head2;
         while(curr1!=null)
         {
             count1++;
             curr1=curr1.next;
         }
         while(curr2!=null)
         {
             count2++;
             curr2=curr2.next;
         }
         while(count1>count2)
         {
             head1=head1.next;
             count1--;
         }
         while(count1<count2)
         {
             head2=head2.next;
             count2--;
         }
         while(head1!=null && head2!=null)
         {
             if(head1.next==head2.next)
             {
                 return head1.next.data;
             }
             head1=head1.next;
             head2=head2.next;
         }
         return -1;
    }
}


