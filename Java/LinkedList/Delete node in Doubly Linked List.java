class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
	    int count=0;
	    Node curr=head;
	    while(count!=x-1)
	    {
	        count++;
	        curr=curr.next;
	    }
	    if(curr==head)
	    {
	        curr=curr.next;
	        curr.prev=null;
	        return curr;
	    }
	    if(curr.next==null)
	    {
	        curr.prev.next=null;
	    }
	    else
	    {
	        curr.prev.next=curr.next;
	        curr.next.prev=curr.prev;
	    }
	    return head;
    }
}
