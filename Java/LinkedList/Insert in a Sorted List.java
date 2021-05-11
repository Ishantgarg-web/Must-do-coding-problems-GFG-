class Solution {
    Node sortedInsert(Node head, int x) {
        // Add your code here.
        Node curr=head;
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
            return head;
        }
        else
        {
            if(curr.data>x)
            {
                temp.next=head;
                head=temp;
                return head;
            }
            else
            {
                while(curr.next!=null && curr.next.data<x)
                {
                    curr=curr.next;
                }
                if(curr.next==null)
                {
                    curr.next=temp;
                    temp.next=null;
                }
                else
                {
                    temp.next=curr.next;
                    curr.next=temp;
                }
                return head;
            }
        }
    }
}
