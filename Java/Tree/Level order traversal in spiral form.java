class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(root==null){return al;}
        Stack<Node> s1=new Stack<Node>();
        Stack<Node> s2=new Stack<Node>();
        s1.push(root);
        while(s1.isEmpty()==false || s2.isEmpty()==false)
        {
            while(s1.isEmpty()==false)
            {
                Node temp=s1.peek();
                al.add(s1.pop().data);
                if(temp.right!=null)
                {
                    s2.push(temp.right);
                }
                if(temp.left!=null)
                {
                    s2.push(temp.left);
                }
            }
            while(s2.isEmpty()==false)
            {
                Node temp=s2.peek();
                al.add(s2.pop().data);
                if(temp.left!=null)
                {
                    s1.push(temp.left);
                }
                if(temp.right!=null)
                {
                    s1.push(temp.right);
                }
            }
        }
        return al;
    }
}
