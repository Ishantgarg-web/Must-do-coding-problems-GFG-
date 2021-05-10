public static void swap(Node temp1,Node temp2)
{
    int t=temp1.data;
    temp1.data=temp2.data;
    temp2.data=t;
}
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node temp1=head;
    Node temp2=head;
    while(temp2.next!=null)
    {
        temp2=temp2.next;
    }
    while(temp1!=temp2 && temp2.next!=temp1)
    {
        swap(temp1,temp2);
        temp1=temp1.next;
        temp2=temp2.prev;
    }
    return head;
    
}
