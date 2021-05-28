class GFG
{
	int countNonLeafNodes(Node root)
	{
	    //Add your code here.
	    if(root==null)
	    {
	        return 0;
	    }
	    if(root.left==null && root.right==null)
	    {
	        return 0;
	    }
	    return 1+countNonLeafNodes(root.left)+countNonLeafNodes(root.right);
	}
}
