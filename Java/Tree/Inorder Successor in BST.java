class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public static void inorder(Node root, ArrayList<Integer> al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }
	public Node inorderSuccessor(Node root,Node x)
    {
        //add code here.
        ArrayList<Integer> al=new ArrayList<Integer>();
        inorder(root,al);
        Node temp=null;
        for (int i=0;i<al.size();i++)
        {
            if(al.get(i)==x.data)
            {
                if(i==al.size()-1)
                {
                    return temp;
                }
                else
                {
                    return new Node(al.get(i+1));
                }
            }
        }
        return temp;
    }
}
