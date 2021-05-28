class GfG
{
    public int SumofLeafNodes(Node root)
    {
        // your code here
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return root.data;
        }
        return SumofLeafNodes(root.left)+SumofLeafNodes(root.right);
    }
}
