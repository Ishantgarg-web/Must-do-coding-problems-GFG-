class Tree1
{
    public static long ps(Node root,long sum)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return sum*10+root.data;
        }
        sum=sum*10+root.data;
        return ps(root.left,sum)+ps(root.right,sum);
    }
	public static long treePathsSum(Node root)
        {
         //add code here.
         return ps(root,0);
	}
}
