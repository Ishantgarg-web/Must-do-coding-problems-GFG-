class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    public static void inorder(Node root,ArrayList<Integer> al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }
    public static Node insert(Node root,int x)
    {
        if(root==null)
        {
            Node temp=new Node(x);
            return temp;
        }
        if(root.data>x)
        {
            root.left=insert(root.left,x);
        }
        else
        {
            root.right=insert(root.right,x);
        }
        return root;
    }
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       ArrayList<Integer> al=new ArrayList<Integer>();
       inorder(root,al);
       Node node=new Node(al.get(0));
       for (int i=1;i<al.size();i++)
       {
           insert(node,al.get(i));
       }
       return node;
    }
}
 
