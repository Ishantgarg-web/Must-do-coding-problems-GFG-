class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node slow=head,fast=head;
    	while(fast!=null && n-->0)
    	{
    	    fast=fast.next;
    	}
    	if(fast==null)
    	{
    	    if(n==0)
    	    {
    	        return head.data; //for first node
    	    }
    	    else
    	    {
    	        return -1; //for n>len of linked list
    	    }
    	}
    	else
    	{
    	    while(fast!=null)
    	    {
    	        slow=slow.next;
    	        fast=fast.next;
    	    }
    	    return slow.data;
    	}
    }
}
