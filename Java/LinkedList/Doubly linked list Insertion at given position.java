class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head, int pos, int data)
	{
		// Your code here
		int count=0;
		Node curr=head;
		while(count!=pos)
		{
		    curr=curr.next;
		    count++;
		}
		Node temp=new Node(data);
		temp.next=curr.next;
		curr.next=temp;
		temp.prev=curr;
		
	}
}
