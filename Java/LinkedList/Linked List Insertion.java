class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        if(head==null)
        {
            head=new Node(x);
        }
        else
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
        }
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        if(head==null)
        {
            head=new Node(x);
        }
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=new Node(x);
            curr=curr.next;
        }
        return head;
    }
}
