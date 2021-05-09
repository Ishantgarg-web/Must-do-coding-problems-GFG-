class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	    if(x==1)
	    {
	        head=head.next;
	        return head;
	    }
	    else
	    {
	        int count=1;
	        Node curr=head;
	        while(count!=x-1)
	        {
	            count++;
	            curr=curr.next;
	        }
	        Node temp=curr.next;
	        curr.next=temp.next;
	        
	        
	    }
	    return head;
    }
}
