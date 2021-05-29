class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null)
        {
            return 1;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        int sum=0;
        if(root.left!=null){sum=sum+root.left.data;}
        if(root.right!=null){sum=sum+root.right.data;}
        if(root.data==sum)
        {
            return isSumProperty(root.left)*isSumProperty(root.right);
        }
        return 0;
        
    }
}
