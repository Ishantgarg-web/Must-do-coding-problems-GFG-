import java.util.*;
class Node{
    Node next;
    int val;
    Node(int data)
    {
        val=data;
        next=null;
    }
}
public class MyClass {
    public static void displayList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.val);
            curr=curr.next;
        }
    }
    public static void main(String args[]) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      Node head=null;
      for (int i=0;i<n;i++)
      {
          int x=input.nextInt();
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
        }
      }
      displayList(head);
    }
}
