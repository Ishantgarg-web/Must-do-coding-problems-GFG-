class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	    if(head==null || head.next==null)
	    {
	        return head;
	    }
	    else
	    {
	        Node curr=head;
	        int res=head.data;
	        Node temp=head.next;
	        while(temp!=null)
	        {
	            if(temp.data!=res)
	            {
	                curr.next=temp;
	                curr=temp;
	                res=curr.data;
	                
	            }
	            temp=temp.next;
	        }
	        curr.next=null;
	        return head;
	    }
    }
}
